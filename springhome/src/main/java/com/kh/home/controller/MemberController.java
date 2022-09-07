package com.kh.home.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.home.entity.MemberDto;
import com.kh.home.repository.AttachmentDao;
import com.kh.home.repository.MemberDao;
import com.kh.home.repository.MemberProfileDao;
import com.kh.home.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private AttachmentDao attachmentDao;
	
	@Autowired
	private MemberProfileDao memberProfileDao;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/join")
	public String join() {
		return "member/join";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto,
			@RequestParam MultipartFile memberProfile) throws Exception {
		
		memberService.join(memberDto, memberProfile);
		
		return "redirect:/member/join_success";
	}
	@RequestMapping("/join_success")
	public String joinSuccess() {
		return "member/join_success";
	}
	
//	로그인 처리
	@GetMapping("/login")
	public String login(@RequestHeader(value = "Referer",defaultValue = "/") String referer,
			Model model
			) {
		model.addAttribute("referer",referer);
		return "member/login";
	}
	
//	tip : 세션을 쓰고 싶으면 매개변수에 선언만 하면 자동으로 설정해준다
	@PostMapping("/login")
	public String login(
			@RequestParam String memberId,
			@RequestParam String memberPw,
			@RequestParam String referer,
			@RequestParam(required=false) String remember,
			HttpSession session,
			HttpServletResponse response) {
		MemberDto memberDto = memberDao.login(memberId,memberPw);
		if(memberDto != null) {
			session.setAttribute("login", memberDto.getMemberId());
			session.setAttribute("auth", memberDto.getMemberGrade());
//			쿠키
			if(remember != null) {
				Cookie ck = new Cookie("saveId",memberDto.getMemberId());
				ck.setMaxAge(4*7*24*60*60);
				response.addCookie(ck);
			}else {
				Cookie ck = new Cookie("saveId",memberDto.getMemberId());
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
			
			return "redirect:" + referer;
		}else {
			return "redirect:login?error";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		session.removeAttribute("auth");
		return "redirect:/";
				
	}

	@GetMapping("/mypage")
	public String mypage(HttpSession session, Model model) {
		String memberId = (String)session.getAttribute("login");
		MemberDto memberDto = memberDao.info(memberId);
		model.addAttribute("memberDto",memberDto);
		
		//프로필 이미지의 다운로드 주소를 추가
		// - member_profile에서 아이디를 이용하여 단일조회를 수행
		// - http://localhost:8080/home/attachment/download?attachmentNo = 1
		int attachmentNo = memberProfileDao.info(memberId);
		if(attachmentNo == 0) {
			model.addAttribute("profileUrl","/image/user.png");
			
		}else {
			model.addAttribute("profileUrl","/attachment/download?attachmentNo=" + attachmentNo);
		}
		return "member/mypage";
	}
	
	@GetMapping("/password")
	public String password() {
		return "member/password";
	}

	@PostMapping("/password")
	public String password(
			@RequestParam String currentPw,
			@RequestParam String changePw,
			HttpSession session
			) {
		String memberId = (String) session.getAttribute("login");
		boolean success = memberDao.changePassword(memberId,currentPw,changePw);
		if(success) {
			return "redirect:mypage";
		}
		else {
			return "redirect:password?error";
		}
	}

	@GetMapping("/find_id")
	public String findId() {
		return "member/find_id";
	}
	@PostMapping("/find_id")
	public String findId(
			@ModelAttribute MemberDto memberDto,
			Model model) {
		String memberId = memberDao.findId(memberDto);
		if(memberId == null) {
			return "redirect:find_id?error";
		}else {
			
		model.addAttribute("findUserId",memberId);
		return "member/find_id_result";
		}
	}
	
	@GetMapping("/exit")
	public String exit() {
		return "member/exit";
		
	}
	@PostMapping("/exit")
	public String exit(@RequestParam String memberPw,HttpSession session) {
		String memberId = (String)session.getAttribute("login");
		boolean success = memberDao.exit(memberId,memberPw);
		if(success) {
			session.removeAttribute("login");
			session.removeAttribute("auth");
			return "redirect:exit_finish";
		}
		else {
			return "redirect:exit?error";
		}
	}
	@GetMapping("/exit_finish")
	public String exitFinish() {
		return "member/exit_finish";
	}
	
	@GetMapping("/information")
	public String information(HttpSession session, Model model) {
		String memberId = (String) session.getAttribute("login");
		MemberDto memberDto = memberDao.info(memberId);
		model.addAttribute("memberDto",memberDto);
		return "member/information";
	}
	@PostMapping("/information")
	public String information(HttpSession session,@ModelAttribute MemberDto memberDto ) {
		String memberId = (String) session.getAttribute("login");
		memberDto.setMemberId(memberId);
		
		boolean success = memberDao.changeInfomation(memberDto);
		if(success) {
			return "redirect:mypage";
		}else {
			return "redirect:information?error";
		}
	}
}

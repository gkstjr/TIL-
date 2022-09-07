package com.kh.spring19.controller;

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

import com.kh.spring19.entity.MemberDto;
import com.kh.spring19.repository.MemberDao;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	

//	tip : 세션을 쓰고 싶으면 매개변수에 선언만 하면 자동으로 설정해준다
	@PostMapping("/login")
	public String login(
			@RequestParam String memberId,
			@RequestParam String memberPw,
			HttpSession session,
			HttpServletResponse response) {
		MemberDto memberDto = memberDao.login(memberId,memberPw);
		System.out.println(memberDto);
		if(memberDto != null) {
			session.setAttribute("login", memberDto.getMemberId());
			session.setAttribute("auth", memberDto.getMemberGrade());
		
			return "redirect:/";
		}else {
			return "redirect:/?error";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		session.removeAttribute("auth");
		return "redirect:/";
				
	}

	
}

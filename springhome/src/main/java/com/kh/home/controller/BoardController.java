package com.kh.home.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.home.entity.BoardDto;
import com.kh.home.entity.MemberDto;
import com.kh.home.repository.BoardDao;
import com.kh.home.repository.MemberDao;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/list")
	public String list(@RequestParam(required = false) String type,
					   @RequestParam(required = false) String keyword,
					   @RequestParam(required = false,defaultValue = "1") int p,
					   @RequestParam(required = false,defaultValue = "10") int s,
					   Model model
					   ) {
		List<BoardDto> list = boardDao.list(type,keyword,p,s);
		model.addAttribute("list",list);
		
		boolean search = type != null && keyword != null;
		model.addAttribute("search",search);
		int count = boardDao.count(type,keyword);
		int lastPage = (count + s -1) / s;
		
		int blockSize = 10;
		int endBlock = (p+blockSize -1) / blockSize * blockSize;
		int startBlock = endBlock - (blockSize - 1);
		if(endBlock > lastPage) {
			endBlock = lastPage;
		}
		
		model.addAttribute("p",p);
		model.addAttribute("s",s);
		model.addAttribute("type",type);
		model.addAttribute("keyword",keyword);
		model.addAttribute("startBlock", startBlock);
		model.addAttribute("endBlock" , endBlock);
		model.addAttribute("lastPage" , lastPage);
		return "board/list";
	}
	@GetMapping("/detail")
	public String detail(@RequestParam int boardNo,Model model,
			HttpSession session) {
		BoardDto boardDto = boardDao.read(boardNo);
		model.addAttribute("boardDto",boardDto);
	
		if(boardDto.getBoardWriter() != null) {
			MemberDto memberDto = memberDao.info(boardDto.getBoardWriter());
			model.addAttribute("memberDto",memberDto);
		}
//		내글인지 판정
		String memberId = (String) session.getAttribute("login");
		boolean isLogin = memberId != null;
		boolean isOwner = isLogin && memberId.equals(boardDto.getBoardWriter());
		model.addAttribute("isLogin",isLogin);
		model.addAttribute("isOwner",isOwner);
		
		//		관리자인지 판정
		String memberGrade = (String)session.getAttribute("auth");
		boolean isAdmin = memberGrade != null && memberGrade.equals("관리자");
		model.addAttribute("isAdmin",isAdmin);
		
		
		return "board/detail";	
	}
	@GetMapping("/detail/{boardNo}")
	public String detai2(@PathVariable int boardNo,Model model) {
		BoardDto boardDto = boardDao.read(boardNo);
		model.addAttribute("boardDto",boardDto);
		return "board/detail";
	}
}	

package com.kh.spring04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
		
	@RequestMapping("/")//컨트롤러 메소드에 주소를 부여하도록 설정한다
	public String home() {
			return "home";
//			return "/WEB-INF/views/home.jsp";
		}
	

}

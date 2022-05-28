package com.kh.spring05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController  {
	
	@RequestMapping("/")
	public String index() {	
		return "index";
		
	}
	@RequestMapping("/test")
	public String test() {	
	
		return "test";
	}
	@RequestMapping("/board")
	public String board() {	
		
	return "board/list";
	}
}

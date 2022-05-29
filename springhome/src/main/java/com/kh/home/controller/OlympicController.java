package com.kh.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/olympic")//공용주소 설정
public class OlympicController {
	
	@RequestMapping("/list")
	public String list() {
		return "olympic/list";
	}
}

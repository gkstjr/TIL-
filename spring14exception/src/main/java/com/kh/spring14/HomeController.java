package com.kh.spring14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

//	tip : @ResponseBody 를 사용하면 ViewResolver가 적용되지 않는다
//	- ViewResolver는 View(JSP)를 쉽게 찾을 수 있도록 접두사와 접미사를 추가하는 도구

	@GetMapping("/")
	@ResponseBody
	public String home() {
		int a = 10 / 0 ;
		return "home";
	}
	
//	Spring에서 예외를 처리하는 방법
//	[1] web.xml에 <error-page> 설정(비추천)
//	[2] @ExceptionHandler 사용
//	[3] @ControllerAdvice 사용

//	@ExceptionHandler(ArithmeticException.class)
//	public String handler(Exception ex) {
//		log.error("오류 발생",ex);
//		return "error/500";
//	}
}

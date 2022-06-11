package com.kh.home.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@ControllerAdvice(annotations = {Controller.class})
public class ExceptionController {
	
	@ExceptionHandler(Exception.class)
	public String handler(Exception ex) {
		log.error("예외 발생", ex);
		return "에러페이지";
		
	}
	
}

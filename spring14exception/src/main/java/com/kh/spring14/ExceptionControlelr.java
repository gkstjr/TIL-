package com.kh.spring14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

//컨트롤러를 간섭하여 예외를 뺴내는 클래스
//AOP의 구현체 중 하나
@Slf4j
@ControllerAdvice(annotations = {Controller.class})
public class ExceptionControlelr {

	@ExceptionHandler(Exception.class)
	public String handler(Exception ex) {
		log.error("예외 발생",ex);
		return "error/500";
	}
	
}

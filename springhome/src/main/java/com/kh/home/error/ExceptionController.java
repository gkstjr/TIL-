package com.kh.home.error;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@ControllerAdvice(annotations = {Controller.class})
public class ExceptionController {
	
//	캔낫파인드이셉션이 발생하면 사용자에게 404번 메세지를 전송
//	@ExceptionHandler(CannotFindException.class)
//	public void handler(HttpServletResponse response) throws IOException {
//		response.sendError(404);
//	}
	
//	[2] Spring 방식
	@ExceptionHandler(CannotFindException.class)
	public ResponseEntity<String> handler() {
		return ResponseEntity.notFound().build();
	}
	
	@ExceptionHandler(Exception.class)
	public String handler(Exception ex) {
		log.error("예외 발생", ex);
		return "error/500";
		
	}
	
}

package com.kh.spring18.error;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations=RestController.class)
public class ExceptionController {

	@ExceptionHandler(CannotFindException.class)
	public void notFound(HttpServletResponse response) throws IOException{
		response.sendError(404);
	}
}

package com.kh.spring01;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//프로그래밍 처리(DB,계산,파라미터,...) 
		ModelAndView mv = new ModelAndView();
		
//		mv.addObject("이름",데이터);
		
		mv.setViewName("/WEB-INF/views/index.jsp");
		return mv;
	}

}

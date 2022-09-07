package com.newlecture.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add2")
public class AddServlet2 extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


	 	String[] num_ = req.getParameterValues("num");
	 	
	 	int result = 0;
	 	
	 	for(int i=0; i<num_.length; i++) {
	 		int num = Integer.parseInt(num_[i]);
	 		result+=num;
	 	}
	 	
	 	
	 	
	 	
	 	resp.setContentType("text/plain; charset = UTF-8");
	 	resp.getWriter().println("덧셈 결과 : " + result);
 }
}

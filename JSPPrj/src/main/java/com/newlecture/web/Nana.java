package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns =  "/hi")
public class Nana extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/plain; charset= UTF-8");
			
			PrintWriter out = resp.getWriter();
			String cnt_ = req.getParameter("cnt");
			
			int cnt = 100;
			if(cnt_ !=null && !cnt_.equals("")) {
				cnt = Integer.parseInt(req.getParameter("cnt"));
			}
				for(int i=0; i<cnt; i++) {
					out.println((i+1) + ": 안녕 한석아!!");
				}
		}
}

<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
//		session.setAttribute("이름", 데이터);
		Random r = new Random();
	//session.setAttribute("dice", r.nextInt(6)+1);
	request.getSession().setAttribute("dice", r.nextInt(6)+1);
	
	%>    

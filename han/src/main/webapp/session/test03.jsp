<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
   // Integer dice =	(Integer)session.getAttribute("dice");
    	Integer dice = (Integer)request.getSession().getAttribute("dice");
    %>
    <h1>dice=<%=dice %></h1>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- 세션 데이터의 삭제 -->
    <%
    	//session.removeAttribute("dice");
    	request.getSession().removeAttribute("dice");
    %>
   
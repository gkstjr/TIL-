<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<br><br>
<%

	String memberId = (String) session.getAttribute("login");
	
	boolean login = memberId != null ;
	
	String auth = (String)session.getAttribute("auth");
	boolean admin = auth != null && auth.equals("관리자");

%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업용 홈페이지</title>
</head>
<body>
	<table border = "1" width = "1000" align = "center">
		<!-- 정보 확인용 공간 -->
			<tr>
				<td>
					memberId = <%=memberId %>, login = <%=login %>, Session ID = <%=session.getId() %>, auth =<%=auth %>, admin= <%=admin %>;

				</td>
			</tr>	
		
	
		<tr height = "120">
			<td align = "center">
				<h1>HS 호텔</h1>
			</td>
		</tr>
		<tr>
			<td>
			<a href = "<%=request.getContextPath()%>">홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href = "<%=request.getContextPath()%>/olympic/list.jsp">올림픽정보</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href = "<%=request.getContextPath()%>/score/list.jsp">국영수정보</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<%if(login){ %>
			<a href = "<%=request.getContextPath()%>/member/logout.kh">로그아웃</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href = "<%=request.getContextPath()%>/member/mypage.jsp">내정보</a>&nbsp;&nbsp;&nbsp;&nbsp;	
			<%}else{ %>
			<a href = "<%=request.getContextPath()%>/member/join.jsp">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href = "<%=request.getContextPath()%>/member/login.jsp">로그인</a>&nbsp;&nbsp;&nbsp;&nbsp;
			
			<%} %>
			<%if(admin){%>
				<a href = "<%=request.getContextPath()%>/admin/list.jsp">회원관리</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href = "<%=request.getContextPath()%>/admin/staticstics.jsp">사이트관리</a>&nbsp;&nbsp;&nbsp;&nbsp;
			
			
			<% }%>
			<a href = "<%=request.getContextPath() %>/board/list.jsp">게시판</a>
			
			
			</td>
		</tr>
		<tr height = "450">
			<td align = "center" valign = "top">
				<br><br>
			
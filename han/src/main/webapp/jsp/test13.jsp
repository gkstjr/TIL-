<%@page import="han.beans.OlympicDto"%>
<%@page import="han.beans.OlympicDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
%>
<%
	OlympicDao olympicDao = new OlympicDao();
	OlympicDto olympicDto = olympicDao.selectOne(name);

%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가 상세정보</title>
</head>
<body>
	<div align = "center">
		<%if(olympicDto == null){ %>
		<h1>존재하지 않는 국가 이름</h1>
		
		<%}else {%>
		
		<h1>국가 상세 정보</h1>
			<table border="1" width="400">
				<tr>
				<th>순위</th>
				<td><%=olympicDto.getRank() %></td>

				</tr>
			<tr>
				<th>이름</th>
				<td><%=olympicDto.getName() %></td>
				</tr>
				
			<tr>
				<th>메달</th>
				<td>
				금 <%=olympicDto.getGold() %>
				은 <%=olympicDto.getSilver() %>
				동 <%=olympicDto.getBronze() %>
				</td>
				</tr>
				
			</table>
	<%} %>
		<h2><a href ="test05.jsp">목록보기</a></h2>
	</div>
</body>
</html>
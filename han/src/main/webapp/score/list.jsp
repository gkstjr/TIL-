<%@page import="han.beans.ScoreDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--준비 --%>
	<%
		String name = request.getParameter("name");
	%>

<%--처리 --%>
		<%
			boolean isSearch = name!=null&&!name.equals("");
		ScoreDao scoreDao = new ScoreDao();
			List<ScoreDto> list;
			if(isSearch) {
				list = scoreDao.selectList(name);
				
			}
			else{
				list = scoreDao.select();
			}
		%>
	
<%--출력 --%>
		




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 정보 검색</title>
</head>
<body>
	<div align = "center">
		<h1>성적 정보 검색</h1>
			
		<form action = "test10.jsp">
			<%if(name==null){ %>
		
			<input type = "text" name = "name" required placeholder = "검색어 작성">
			<%}else{ %>
			<input type = "text" name = "name" required placeholder = "검색어 작성" value = "<%=name %>">
		<%} %>
			
			<input type = "submit" value = "검색"> 	
		<h2>검색 결과 : <%=list.size() %>개</h2>
		<%if(list.isEmpty()){ %>
		<h2>검색 결과가 존재하지 않습니다</h2>
		<% }else{%>
		<table border = "1" width = "400">
			<thead>
				<tr>
					<th>이름</th>
					<th>국어점수</th>
					<th>영어점수</th>
					<th>수학점수</th>
					<th>총점</th>
					<th>평균</th>
				</tr>
			</thead>
		<tbody align = "center">
			<%for(ScoreDto scoreDto : list){ %>
			<tr>

				<td><a href = "detail.jsp?name=<%=scoreDto.getName() %>"><%=scoreDto.getName() %></a></td>
				<td><%=scoreDto.getKorean() %></td>
				<td><%=scoreDto.getEnglish() %></td>
				<td><%=scoreDto.getMath() %></td>
				<td><%=scoreDto.getTotal() %></td>
				<td align = "right"><%=scoreDto.getAverage() %></td>
			</tr>
			<%} %>	
		</tbody>
</table>
		<%} %>
		
	</div>
</body>
</html>
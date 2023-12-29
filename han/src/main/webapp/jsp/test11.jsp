<%@page import="han.beans.ExamDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ExamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% 
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	%>
	<% 
	boolean success = (type!=null&&!type.equals("")) && (keyword!=null&&!keyword.equals(""));
			ExamDao examDao = new ExamDao();
	List<ExamDto> list;
		if(success) {
			list= examDao.selectList(type, keyword);

		}else{
			list = examDao.selectList();
		}
	%>
	
	<!-- 제목 -->
		<h1>시험 결과 조회</h1>
	<!-- 검색창 -->
		<form action = "test11.jsp">
			<select name = "type">
				<option>student</option>
				<option>subject</option>
				<option>type</option>
			<%if(success){ %>
			<input type = "text" name = "keyword" placeholder = "검색어 입력" value = "<%=keyword %>">;
			
			<%}else{ %>
							<input type = "text" name = "keyword" placeholder = "검색어 입력">
			<%} %>
			<input type = "submit" name = "검색">
			
		</form>
	<!-- 검색결과 -->
	<%if(list.isEmpty()){ %>
		<h2>검색 결과가 존재하지 않습니다.</h2>
	<%}else{ %>
		<table border = "1" widrh ="600">
			<thead>
				<tr>
					<th>번호</th>
					<th>학생</th>
					<th>과목</th>
					<th>유형</th>
					<th>점수</th>
				</tr>
			</thead>
			<tbody = align ="center">
				<%for(ExamDto examDto : list){ %>
				<tr>
					<td><%=examDto.getExamId() %></td>
					<td><%=examDto.getStudent() %></td>
					<td><%=examDto.getSubject() %></td>
					<td><%=examDto.getType() %></td>
					<td><%=examDto.getScore() %></td>
					
				<% } %>
			</tbody>
		</table>
	<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>
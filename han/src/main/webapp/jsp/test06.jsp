<%@page import="han.beans.ExamDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ExamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%
		ExamDao examDao = new ExamDao();
		List<ExamDto> list = examDao.selectList(); 
	%>	
	<table border = "1">
		<thead>
			<tr>
				<th>번호</th>
				<th>학생이름</th>
				<th>과목</th>
				<th>유형</th>
				<th>점수</th>
			</tr>
		</thead>
			<tbody align = "center">
			<%for(ExamDto examDto : list){ %>
					<tr>
						<td>
						<a href ="/han/exam/detail.kh?examId=<%=examDto.getExamId() %>">
						<%=examDto.getExamId() %>
						</a>
						</td>
						<td><%=examDto.getStudent() %></td>
						<td><%=examDto.getSubject() %></td>
						<td><%=examDto.getType() %></td>
						<td><%=examDto.getScore() %></td>
					</tr>
			<%} %>
			</tbody>
	</table>
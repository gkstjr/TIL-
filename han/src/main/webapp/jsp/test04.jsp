<%@page import="han.beans.ScoreDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	//준비
    	//처리
    	ScoreDao scoreDao = new ScoreDao();
    	List<ScoreDto> list = scoreDao.select();
     %>
   <!-- 출력 -->
   <table border = "1">
   		<thead>
   			<tr>
   				<th>이름</th>
   				<th>국어점수</th>
   				<th>영어점수</th>
   				<th>수학점수</th>
   			</tr>
   		</thead>
  		<tbody>
  			<% for(ScoreDto scoreDto : list){%>
  					<tr>
  						
  						<td><%=scoreDto.getName() %></td>
  						<td><%=scoreDto.getKorean() %></td>
  						<td><%=scoreDto.getEnglish() %></td>
  						<td><%=scoreDto.getMath() %></td>
  					</tr>
  				
  			<%} %>
  		</tbody>
   </table>
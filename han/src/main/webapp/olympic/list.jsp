<%@page import="han.beans.OlympicDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.OlympicDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    	//준비
    	//처리
    	OlympicDao olympicDao = new OlympicDao();
    	List<OlympicDto> list = olympicDao.select();
    	
    %>
    
   <!-- 출력 -->
   <jsp:include page="/template/header.jsp"></jsp:include>
   	<table border ="1">
   		<thead>
			<tr>
				<th>순위</th>   	
				<th>이름</th>   	
				<th>금메달</th>   	
				<th>은메달</th>   	
				<th>동메달</th>
				<th>메뉴</th>   	
   			</tr>
   		</thead>
   	<tbody>
   
   	<% for(OlympicDto olympicDto : list){%>
   			<tr>
   				<td><%=olympicDto.getRank() %></td>
   				<td>
   				<a href = "detail.jsp?name=<%=olympicDto.getName() %>">	
   				<%=olympicDto.getName() %>
   				</a>
   				</td>
   				<td><%=olympicDto.getGold() %></td>
   				<td><%=olympicDto.getSilver() %></td>
   				<td><%=olympicDto.getBronze() %></td>
   				<td>
   				<a href = "delete.kh?name=<%=olympicDto.getName() %>">지우기</a>
   				</td>
   			</tr>
   		<%}%>
   	</tbody>
   	</table>
   	   <jsp:include page="/template/footer.jsp"></jsp:include>
   	
<%@page import="han.beans.OlympicDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.OlympicDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String name = request.getParameter("name");
   
    %>
    
    <%
    	OlympicDao olympicDao = new OlympicDao();
    	List<OlympicDto> list = olympicDao.selectList(name);
    %>
  <form action = "search.jsp">
  		<%if(name==null) {%>
  		<input type = "text" name ="name" placeholder="나라이름" required>
  		<%} else{%>
  			  		<input type = "text" name ="name" placeholder="나라이름" required value= "<%=name%>">
  		<%} %>
  		<input type = "submit" value = "검색">
  </form>
  
  
  
   <%if(list.isEmpty()){ %>
   		<h2>데이터가 존재하지 않는다</h2>
   <%}else{%>
     <table border ="1" width = "500">
   		<thead>
			<tr>
				<th>순위</th>   	
				<th>이름</th>   	
				<th>금메달</th>   	
				<th>은메달</th>   	
				<th>동메달</th>   	
   			</tr>
   		</thead>
   	<tbody>
   
   	<% for(OlympicDto olympicDto : list){%>
   			<tr>
   				<td><%=olympicDto.getRank() %></td>
   				<td><a href = "detail.jsp?name=<%=olympicDto.getName() %>"><%=olympicDto.getName() %></a></td>
   				<td><%=olympicDto.getGold() %></td>
   				<td><%=olympicDto.getSilver() %></td>
   				<td><%=olympicDto.getBronze() %></td>
   			</tr>
   		<%}%>
   	</tbody>
   	</table>
  	<%}%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   		<table border = "1">
   		<%for(int i=1; i<=10; i++){ %>
   			<%if(i%2==0){%>
   			<tr bgcolor = "skyblue">
   			<% }else{%>
   				<tr>
   			
   			<%} %>
   				<td><%=i %>-1</td>
   				<td><%=i %>-2</td>
   				<td><%=i %>-3</td>
   			</tr>
   	<%} %>
   </table>
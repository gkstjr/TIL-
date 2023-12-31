<%@page import="han.beans.CustomerDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	CustomerDao customerDao = new CustomerDao();
		List<CustomerDto> list = customerDao.selectList();
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<table border = "1" width = "700">
			<thead>
				<tr>
					<th>고객번호</th>
					<th>고객아이디</th>
					<th>포인트</th>
					<th>고객등급</th>
				</tr>
			</thead>
				<tbody>
				<%for(CustomerDto customerDto : list) {%>
						<tr>
							<td><%=customerDto.getCustomerNo() %></td>
							<td><%=customerDto.getCustomerId() %></td>
							<td><%=customerDto.getCustomerMileage() %></td>
							<td><%=customerDto.getCustomerLevel() %></td>
						</tr>
						
				<%} %>
				</tbody>
	
		</table>
	</div>
</body>
</html>
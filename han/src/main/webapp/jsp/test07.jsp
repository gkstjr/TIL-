<%@page import="han.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ProductDao productDao = new ProductDao();
	List<ProductDto> list = productDao.selectList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<div align = "center">
		<h1>상품 목록</h1>
		
		<table border= "1" width = "1000">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>유형</th>
					<th>가격</th>
					<th>제조일</th>
					<th>파기일</th>
					<th>관리</th>
				</tr>
				</thead>
				<tbody>
					<%for(ProductDto product : list){ %>
						<tr>
							<td><%=product.getNo() %></td>
							<td><%=product.getName() %></td>
							<td><%=product.getType() %></td>
							<td><%=product.getPrice() %></td>
							<td><%=product.getMadeStringNotNull() %></td>
							<td><%=product.getExpireStringNotNull() %></td>
							<td>
								<a href="/han/product/delete.kh?number=<%=product.getNo()%>">
								삭제
								</a>
							</td>
						<%} %>
				</tbody>
		</table>
	</div>
</body>
</html>
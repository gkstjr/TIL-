<%@page import="han.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- (Q) Product 검색 페이지 --%>

<%-- 준비 --%>
<%
	request.setCharacterEncoding("UTF-8");
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
%>

<%-- 처리 --%>
<%
	boolean isSearch = type != null && !type.equals("") && keyword != null && !keyword.equals("");
	ProductDao productDao = new ProductDao();
	List<ProductDto> list;
	if(isSearch){
		list = productDao.selectList(type, keyword);
	}
	else {
		list = productDao.selectList();
	}
%>

<%-- 출력 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 검색</title>
</head>
<body>
	
	<div align="center">
		
		<!-- 제목 -->
		<h1>상품 검색</h1>
		
		<!-- 검색창 -->
		<form action="test12.jsp" method="get">
		
			<%if(type == null || type.equals("name")){%>
			<select name="type">
				<option value="name" selected>이름</option>
				<option value="type">분류</option>
			</select>
			<%} else { %>
			<select name="type">
				<option value="name">이름</option>
				<option value="type" selected>분류</option>
			</select>
			<%} %>
			
			<%if(isSearch){ %>
			<input type="search" name="keyword" placeholder="검색어" value="<%=keyword%>">
			<%} else { %>
			<input type="search" name="keyword" placeholder="검색어">
			<%} %>
			
			<input type="submit" value="검색">
		</form>
		
		<!-- 검색결과 -->
		<%if(list.isEmpty()){ %>
		<h2>결과가 존재하지 않습니다</h2>
		<%} else { %>
		<table border="1" width="500">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>분류</th>
					<th>가격</th>
					<th>제조일</th>
					<th>폐기일</th>
				</tr>
			</thead>
			<tbody align="center">
				<%for(ProductDto productDto : list){ %>
				<tr>
					<td><%=productDto.getNo()%></td>
					<td><%=productDto.getName()%></td>
					<td><%=productDto.getType()%></td>
					<td><%=productDto.getPrice()%></td>
					<td><%=productDto.getMadeStringNotNull()%></td>
					<td><%=productDto.getExpireStringNotNull()%></td>
				</tr>
				<%} %>
			</tbody>
		</table>
		<%} %>
		
	</div>
	
</body>
</html>


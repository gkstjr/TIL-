<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<br><br>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업용 홈페이지</title>
</head>
<body>
	<table border = "1" width = "1000" align = "center">
		<tr height = "120">
			<td align = "center">
				<h1>HS 호텔</h1>
			</td>
		</tr>
		<tr>
			<td>
			<a href = "<%=request.getContextPath()%>">홈으로</a>
			<a href = "<%=request.getContextPath()%>/olympic/list.jsp">올림픽정보</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href = "<%=request.getContextPath()%>/score/list.jsp">국영수정보</a>&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
		<tr height = "450">
			<td align = "center" valign = "top">
				<br><br>
			
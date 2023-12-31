<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%	
		String memberId	= request.getParameter("memberId");
	%>
    <jsp:include page="/template/header.jsp"></jsp:include>

	<h1>비밀번호 재설정</h1>
	
	<form action = "set_pw.kh" method = "post">
		<input type = "hidden" name = "memberId" value = "<%=memberId%>">
		<input type = "password" name = "memberPw" required>
		<input type = "submit" value = "재설정">
	</form>

    <jsp:include page="/template/footer.jsp"></jsp:include>
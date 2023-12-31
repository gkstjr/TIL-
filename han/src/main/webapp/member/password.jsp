<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	이 페이지는 비밀번호를 변경하기 위해 사용자에게 입력을 받는 페이지
 --%>
<%
	String error = request.getParameter("error");
	boolean type1 = error != null && error.equals("1");
	boolean type2 = error != null && error.equals("2");
%>


<jsp:include page="/template/header.jsp"></jsp:include>

	<h1>비밀번호 변경</h1>
<form action = "password.kh"method = "post">
	<table>
		<tr>
		<th>현재 비밀번호</th>
		<td>
			<input type ="password" name ="currentPw" required>
		</td>
		</tr>
			<tr>
		<th>바꿀 비밀번호</th>
		<td>
			<input type ="password" name ="changePw" required>
		</td>
		</tr>
		<tr>
			<td colspan = "2" align = "center">
				<input type = "submit" value = "비밀번호 변경">
			</td>
		</tr>

	</table>
</form>
	<%if(type1){ %>
		<h3>현재 비밀번호와 같은 비밀번호로 변경할 수 없습니다</h3>
	<%} %>
	
	<%if(type2){ %>
		<h3>비밀번호가 일치하지 않습니다.</h3>
	<%} %>
<jsp:include page="/template/footer.jsp"></jsp:include>
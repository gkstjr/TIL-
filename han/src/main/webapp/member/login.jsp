<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/template/header.jsp"></jsp:include>

		<h1>로그인</h1>
	
		<form action = "login.kh" method = "post">
				<table>
						<tr>
							<th>아이디</th>
							<td>
								<input type = "text" name ="memberId" required>
							</td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td>
								<input type = "password" name ="memberPw" required>
							</td>
						</tr>
						<tr>
							<td align = "center" colspan = "2">
								<input type = "submit" value = "로그인">
							</td>
						</tr>
						<tr>
							<td align="center" colspan="2">
								<a href = "find_id.jsp">아이디가 기억나지 않아요</a>
							</td>
						</tr>
						<tr>
							<td align="center" colspan="2">
								<a href = "find_pw.jsp">비밀번호가 기억나지 않아요</a>
							</td>
						</tr>
				</table>
		</form>
   <%-- 에러 표시가 있는경우 메세지를 출력 --%>
   	<%if(request.getParameter("error") !=null){ %>
   	<H3>로그인 정보가 일치하지 않습니다</H3>
   	<%} %>
    <jsp:include page="/template/footer.jsp"></jsp:include>
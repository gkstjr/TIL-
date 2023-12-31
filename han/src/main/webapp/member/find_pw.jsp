<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:include page="/template/header.jsp"></jsp:include>
   
   	<h1>비밀번호 찾기</h1>
   	<form action="find_pw.kh" method = "post">
   		<table>
   			<tr>
   				<th>아이디</th>
   				<td>
   					<input type = "text" name = "memberId" required>
   				</td>
   			</tr>
   				<tr>
   				<th>닉네임</th>
   				<td>
   					<input type = "text" name ="memberNick" required>
   				</td>
   			</tr>
   			<tr>
   				<th>생년월일</th>
   				<td>
   					<input type = "date" name ="memberBirth" required>
   				</td>
   			</tr>
   				<tr>
   				<th>전화번호</th>
   				<td>
   					<input type = "tel" name ="memberPhone" required>
   				</td>
   			</tr>
   			<tr>
   				<td colspan ="2" align ="center">
   					<input type = "submit" value = "비밀번호 찾기">
   				</td>
   			</tr>
   		</table>
   	</form>
    <jsp:include page="/template/footer.jsp"></jsp:include>
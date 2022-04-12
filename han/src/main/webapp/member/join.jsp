<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>
	<h1>회원 가입</h1>
	<form action = "join.kh" method = "post">
		<table>
			<tr>
				<th>아이디</th>
				<td>
					<input type = "text"name ="memberId" required placeholder="영문소문자 또는 숫자 8~20자 이내" >
				</td>	
				<tr>
					<th>비밀번호</th>
					<td>
						<input type = "password" name = "memberPw" required placeholder = "영어,숫자,특수문자 8~16">
					</td>	
					</tr>
					<tr>
						<th>닉네임</th>
						<td>
							<input type = "text" name = "memberNick" required placeholder = "한글,숫자 10자 이내">
						</td>
					</tr>
						<tr>
						<th>생년월일</th>
						<td>
							<input type = "date" name = "memberBirth" required placeholder = "YYYY-MM-DD">
						</td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td>
								<input type = "tel" name = "memberPhone" required placeholder = "-제외하고 입력">		
							</td>
						</tr>
						<tr>
							<th>이메일</th>
							<td>
								<input type = "email" name = "memberEmail">
							</td>
						</tr>
						<tr>
							<th rowspan = "3">주소</th>
							<td>
								<input type = "text" name = "memberPost" size = "5" placeholder="우편번호">
								<button>검색</button>
							</td>
						</tr>
						<tr>
							<td>
								<input type = "text" name = "memberPost" size = "50" placeholder="기본주소">
							</td>
						</tr>
						<tr>
							<td>
								<input type = "text" name = "memberPost" size = "50" placeholder="상세주소">
							</td>
						</tr>
						<tr>
							<td align = "center" colspan="2">
								<input type = "submit" value = "회원가입">
							</td>
						</tr>
		</table>	
	</form>
<jsp:include page="/template/footer.jsp"></jsp:include>
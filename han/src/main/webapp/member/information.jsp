<%@page import="han.beans.MemberDto"%>
<%@page import="han.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--준비 : 로그인된 사용자의 ID	--%>
	<% 
	String memberId = (String)session.getAttribute("login");
	%>


<%
	MemberDao memberDao	 = new MemberDao();
	MemberDto memberDto = memberDao.selectOne(memberId);

%>
<jsp:include page="/template/header.jsp"></jsp:include>



<h1>개인정보 변경</h1>
<form action = "information.kh" method = "post">
	<table>
		<tr>
			<th>닉네임</th>
			<td>
				<input type = "text" name = "memberNick" required value = "<%=memberDto.getMemberNick()%>">
			</td>
		</tr>
	<tr>
			<th>생년월일</th>
			<td>
				<input type = "date" name = "memberBirth" required value = "<%=memberDto.getMemberBirth()%>">
			</td>
		</tr>
	<tr>
			<th>전화번호</th>
			<td>
				<input type = "tel" name = "memberPhone" required value = "<%=memberDto.getMemberPhone()%>">
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>
				<input type = "email" name = "memberEmail" required value = "<%=memberDto.getMemberEmailString()%>">
			</td>
		</tr>
		<tr>
			<th rowspan = "3">주소</th>
			<td>
				<input type = "text" name = "memberPost" size="5" placeholder="우편번호" value = "<%=memberDto.getMemberPostString()%>">
				<button>검색</button>
			</td>
		</tr>
		<tr>
			<td>
				<input type = "text" name = "memberBasicAddress" size = "50" placehoder = "기본주소" value = "<%=memberDto.getMemberBasicAddressString()%>">
				
			</td>
		</tr>
		<tr>
			<td>
				<input type = "text" name = "memberDetailAddress" size = "50" placeholder = "상세주소" value = "<%=memberDto.getMemberDetailAddressString()%>">
			</td>
		</tr>
		<tr>
			<th>비밀번호 확인</th>
			<td>
				<input type = "password" name = "memberPw" required>
			</td>
		<tr>
			<td colspan = "2" align = "center">
				<input type = "submit" value = "개인정보 변경">
			</td>
		</tr>

	
	
	</table>
</form>
<%if(request.getParameter("error")!=null){ %>
	<h3>비밀번호가 일치하지 않습니다</h3>
<%} %>
<jsp:include page="/template/footer.jsp"></jsp:include>
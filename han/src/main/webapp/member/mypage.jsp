<%@page import="han.beans.MemberDto"%>
<%@page import="han.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		String memberId = (String)session.getAttribute("login");	
		
	%>
   <%
   	MemberDao memberDao = new MemberDao();
   	MemberDto memberDto = memberDao.selectOne(memberId);
   %>
   
   
   
    <jsp:include page="/template/header.jsp"></jsp:include>

	<h1>회원 정보</h1>
	<table border ="1" width = "400">
		<tr>	
			<th width = "30%">아이디</th>
			<td><%=memberDto.getMemberId() %></td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td><%=memberDto.getMemberNick() %></td>
			</tr>
			<tr>
			<th>생년월일</th>
			<td><%=memberDto.getMemberBirth() %></td>
		</tr>
			<tr>
			<th>전화번호</th>
			<td><%=memberDto.getMemberPhone() %></td>
		</tr>
			<tr>
			<th>이메일</th>
			<td><%=memberDto.getMemberEmailString() %></td>
		</tr>
			<tr>
			<th>주소</th>
			<td>[<%=memberDto.getMemberPostString() %>]
			<%=memberDto.getMemberBasicAddressString() %>
			<%=memberDto.getMemberDetailAddressString() %></td>
		</tr>
			<tr>
			<th>포인트</th>
			<td><%=memberDto.getMemberPoint() %></td>
		</tr>
			<tr>
			<th>등급</th>
			<td><%=memberDto.getMemberGrade() %></td>
		</tr>
			<tr>
			<th>최종접속일</th>
			<td><%=memberDto.getMemberLogindate() %></td>
		</tr>
	</table>
		<h2><a href ="password.jsp">비밀번호 변경</a></h2>
		<h2><a href ="information.jsp">개인정보 변경</a></h2>
		<h2><a href ="#">포인트 충전</a></h2>
		<h2><a href ="#">탈퇴하기</a></h2>
    <jsp:include page="/template/footer.jsp"></jsp:include>
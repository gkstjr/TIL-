<%@page import="han.beans.BoardDto"%>
<%@page import="han.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 준비 --%>
<%
	int boardNo = Integer.parseInt(request.getParameter("boardNo"));
%>

<%-- 처리 --%>
<%
	BoardDao boardDao = new BoardDao();
	BoardDto boardDto = boardDao.selectOne(boardNo);
%>

<%-- 출력 --%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h1>게시글 수정</h1>

<form action="edit.kh" method="post">

<input type="hidden" name="boardNo" value="<%=boardDto.getBoardNo()%>">

<table border="1">
	<tr>
		<th>말머리</th>
		<td>
			<%if(boardDto.getBoardHead() == null){ %>
			<select name="boardHead">
				<option value=""  selected>선택</option>
				<option>정보</option>
				<option>유머</option>
				<option>공지</option>
			</select>
			<%} else if(boardDto.getBoardHead().equals("정보")){ %>
			<select name="boardHead">
				<option value="">선택</option>
				<option selected>정보</option>
				<option>유머</option>
				<option>공지</option>
			</select>
			<%} else if(boardDto.getBoardHead().equals("유머")){ %>
			<select name="boardHead">
				<option value="">선택</option>
				<option>정보</option>
				<option selected>유머</option>
				<option>공지</option>
			</select>
			<%} else if(boardDto.getBoardHead().equals("공지")){ %>
			<select name="boardHead">
				<option value="">선택</option>
				<option>정보</option>
				<option>유머</option>
				<option selected>공지</option>
			</select>
			<%} %>
		</td>
	</tr>
	
	<tr>
		<th>제목</th>
		<td>
			<input type="text" name="boardTitle" required size="60" value="<%=boardDto.getBoardTitle()%>">
		</td>
	</tr>
	
	<tr>
		<th>내용</th>
		<td>
			<%-- (주의) textarea에는 value가 없다 --%>
			<textarea rows="10" cols="65" name="boardContent" 
				required><%=boardDto.getBoardContent()%></textarea>
		</td>
	</tr>
	
	<tr>
		<td colspan="2" align="right">
			<input type="submit" value="수정하기">
			<a href="list.jsp">목록보기</a>
		</td>
	</tr>
</table>
</form>

<jsp:include page="/template/footer.jsp"></jsp:include>
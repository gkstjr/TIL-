<%@page import="han.beans.MemberDto"%>
<%@page import="han.beans.MemberDao"%>
<%@page import="han.beans.BoardDto"%>
<%@page import="han.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int boardNo = Integer.parseInt(request.getParameter("boardNo"));

	BoardDao boardDao = new BoardDao();
	boardDao.plusReadcount(boardNo);
	BoardDto boardDto = boardDao.selectOne(boardNo);
	
	MemberDao memberDao = new MemberDao();
	MemberDto memberDto = memberDao.selectOne(boardDto.getBoardWriter());
%>



<jsp:include page="/template/header.jsp"></jsp:include>
		<h1><%=boardDto.getBoardNo() %>번 게시글 보기</h1>

	<table border = "1" width = "500" align = "center">
		<tr>
			<td>
				<h2>
			<%if(boardDto.getBoardHead()!=null){ %>
			[<%=boardDto.getBoardHead() %>]
			<%} %>
			<%=boardDto.getBoardTitle() %>
			
				</h2>
			</td>	
		</tr>
		<tr>
			<td><%=boardDto.getBoardWriter() %> 
				<%=memberDto.getMemberGrade() %>
			</td>	
		</tr>
		<tr>
			<td><%=boardDto.getBoardTime() %> 
				조회수 <%=boardDto.getBoardReadcount() %>
				</td>	
		</tr>
		<tr height = "200">
			<td valign = "top" ><%=boardDto.getBoardContent()%></td>	
		</tr>
		<tr>
			<td align ="right">
				<a href = "write.jsp">글쓰기</a>
				<a href = "write.jsp">답글</a>
				<a href = "edit.jsp?boardNo=<%=boardNo%>">수정</a>
				<a href = "delete.kh?boardNo=<%=boardNo%>">삭제</a>
				<a href = "list.jsp">목록</a>
			</td>	
		</tr>
	</table>

<jsp:include page="/template/footer.jsp"></jsp:include>
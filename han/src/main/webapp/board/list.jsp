<%@page import="han.beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	boolean search = type != null && keyword != null; 
	
	BoardDao boardDao = new BoardDao();
	
	List<BoardDto> list;
	if(search){
		list = boardDao.selectList(type, keyword);
	}else{
		list = boardDao.selectList();
	}
	%>
	
	
	
	
	<jsp:include page="/template/header.jsp"></jsp:include>
	
	<h3>
		type = <%=type %> , keyword = <%=keyword %>, search = <%=search %>
	</h3>
	<h1>자유 게시판</h1>
		
	<h3><a href = "write.jsp">글쓰기</a></h3>
		<table border ="1" width = "800">
			<thead>
					<tr>
						<th>번호</th>	
						<th width = "40%">제목</th>	
						<th>작성자</th>	
						<th>작성일</th>	
						<th>조회수</th>
						</tr>	
					</thead>
			<tbody align = "center">
				<%for(BoardDto boardDto : list){ %>
					<tr>
						<td><%=boardDto.getBoardNo() %></td>	
						<td align = "left">
						<a href = "detail.jsp?boardNo=<%=boardDto.getBoardNo()%>">
						<%=boardDto.getBoardTitle() %></a>
						<%if(boardDto.getBoardReplycount()>0){ %>
						[<%=boardDto.getBoardReplycount() %>]
						<% } %>
						</td>	
						<td><%=boardDto.getBoardWriter()%></td>	
						<td><%=boardDto.getBoardTime() %></td>
						<td><%=boardDto.getBoardReadcount() %></td>	
					</tr>	
				<%} %>
				
					
			</tbody>
		
		</table>
	<h4>
	[이전]
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	[다음]
	</h4>
	
	<form action ="list.jsp" method = "get">
			<select name = "type">
				<option value = "board_title">제목</option>
				<option value = "board_content">내용</option>
				<option value = "board_writer">작성자</option>
			</select>
			<input type = "search" name = "keyword"	placeholder = "검색어 입력" required> 
	
			<input type = "submit" value = "검색">
	</form>
	<jsp:include page="/template/footer.jsp"></jsp:include>
	
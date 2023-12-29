<%@page import="han.beans.ReplyDto"%>
<%@page import="java.util.List"%>
<%@page import="han.beans.ReplyDao"%>
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
	//내 글인지 판정
	String memberId = (String) session.getAttribute("login");
	boolean isOwner = memberId!=null && memberId.equals(boardDto.getBoardWriter());
	
	//관리자인지 판정
	String memberGrade = (String)session.getAttribute("auth");
	boolean isAdmin = memberGrade!= null && memberGrade.equals("관리자");

	//현재 글에 대한 댓글목록 조회
		ReplyDao replyDao = new ReplyDao();
		List<ReplyDto> replyList = replyDao.selectList(boardDto.getBoardNo());
		
	
%>



<jsp:include page="/template/header.jsp"></jsp:include>
		<h1><%=boardDto.getBoardNo() %>번 게시글 보기</h1>

	<table border = "1" width = "600" align = "center">
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
		<!-- 버튼 영역 -->
		<tr>
			<td align ="right">
				<a href = "write.jsp">글쓰기</a>
				<a href = "write.jsp">답글</a>
			<%if(isOwner || isAdmin){ %>
				<a href = "edit.jsp?boardNo=<%=boardNo%>">수정</a>
				<a href = "delete.kh?boardNo=<%=boardNo%>">삭제</a>
				<%} %>

				<a href = "list.jsp">목록</a>
			</td>	
		</tr>
		<!-- 댓글 작성영역 -->
				<tr>
					<td align = "right">
					<form action = "reply_write.kh" method = "post">
						<%if(memberId ==null){ %>
						<textarea name = "replyContent" rows ="4" cols = "65" disabled placeholder = "로그인 후 댓글 작성이 가능합니다"></textarea>
						<input type = "submit" value = "댓글 작성" disabled>
							<%}else{ %>
						<input type ="hidden" name ="replyTarget"value ="<%=boardDto.getBoardNo()%>">
						<textarea name = "replyContent" rows ="4" cols = "65"></textarea>
						<input type = "submit" value = "댓글 작성">
					<%} %>
					</form>
					</td>
				</tr>
					
		<!-- 댓글 목록영역 -->
				<tr>
					<td>
						<table  width = "100%">
							<%for(ReplyDto replyDto : replyList){ %>
								<%
									boolean isReplyOwner = memberId != null && memberId.equals(replyDto.getReplyWriter());
								%>
							
							<tr>
								<th width ="30%"><%=replyDto.getReplyWriter() %></th>
								<td width = "20%"><%=replyDto.getReplyTime() %></td>
								<td width = "50%"><%=replyDto.getReplyContent() %>
								<%if(isReplyOwner || isAdmin){ %>
								<a href = "reply_delete.kh?replyNo=<%=replyDto.getReplyNo()%>&replyTarget=<%=replyDto.getReplyTarget()%>">
								<img src = "<%=request.getContextPath()%>/image/delete.jpg" width ="20">
								</a>
								<%} %>
								<%--댓글 수정 --%>
								<%if(isReplyOwner){ %>
								<a href = "reply_edit.kh?">
								<img src = "<%=request.getContextPath()%>/image/라이언01.gif" width ="20">
								</a>
								<%} %>
								</td>
							
							
							</tr>
							
							<%--본인 글인 경우 수정을 할 수 있도록 준비된 줄 --%>
							
								<%if (isReplyOwner){ %>
								<tr>
									<td colspan = "3">
											<form action = "reply_edit.kh" method = "post">
											<input type = "hidden" name = "replyNo" value = "<%=replyDto.getReplyNo()%>">
											<input type ="hidden" name ="replyTarget"value ="<%=boardDto.getBoardNo()%>">
											<textarea name = "replyContent" rows ="4" cols = "75-"><%=replyDto.getReplyContent() %></textarea>
											
											<input type = "button" value = "변경 취소">
											<input type = "submit" value = "댓글 수정">
											</form>
									</td>
								</tr>
						<%} %>
						<%} %>
						</table>
					
					</td>
				</tr>

	</table>

<jsp:include page="/template/footer.jsp"></jsp:include>
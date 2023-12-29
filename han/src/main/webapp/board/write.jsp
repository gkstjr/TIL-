<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include><

<h1>게시글 작성</h1>

<form action = "write.kh" method = "post">
	<table border ="1">
		<tr>
			<th>말머리</th>
			<td>
				<select name = "boardHead">
						<option value = "">선택</option>
						<option>정보</option>				
						<option>유머</option>				
						<option>공지</option>				
				</select>
			</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>
				<input type ="text" name ="boardTitle" required size= "60">
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea name = "boardContent" rows ="10" cols="60" required></textarea>
			</td>
		</tr>
			<tr>
				<td colspan ="2" align = "right">
					<input type ="submit" value = "등록">
				</td>
			</tr>
	</table>
</form>

<jsp:include page="/template/footer.jsp"></jsp:include><

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<jsp:include page="/template/header.jsp"></jsp:include>

	<div align = "center">
	<h1>상품 정보입력</h1>
		<form action = "add.kh" method="post">
			<table>
					<tr>
						<th>상품번호</th>
						<td><input type = "text" name = "no" required></td>
					</tr>
					<tr>
						<th>상품이름</th>
						<td><input type = "text" name = "name" required></td>
					</tr>
					<tr>
						<th>상품분류</th>
						<td>
							<select name = "type" required>
									<option value = "">선택하세요</option>
									<option>과자</option>
									<option>주류</option>
									<option>사탕</option>
									<option>아이스크림</option>
							
							</select>
						</td>
					</tr>
					<tr>
						<th>가격</th>
						<td><input type = "text" name = "price" required></td>
					</tr>
					<tr>
						<th>제조일</th>
						<td><input type = "date" name = "made" required></td>
					</tr>
					<tr>
						<th>유통기한</th>
						<td><input type = "date" name = "expire" required></td>
					</tr>
					<tr>
						<td align = "center"><input type = "submit" value = "생성"></td>
						<td><a href = "list.jsp">목록</a></td>
					</tr>
			</table>
		</form>
	</div>
	<jsp:include page="/template/footer.jsp"></jsp:include>

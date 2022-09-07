<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>파일 업로드 화면 - 단일</h1>
<form action="upload" method="post" enctype="multipart/form-data">
	<input type="file" name="attach" accept=".png, .jpg, .gif">
	<input type="submit" value="업로드">
</form>
<h1>파일 업로드 화면 - 다중</h1>
<form action="upload2" method="post" enctype="multipart/form-data">
	<input type="file" name="attach" accept=".png, .jpg, .gif" multiple>
	<input type="submit" value="업로드">
</form>
<h1>파일 업로드 화면 - 다른 정보와 같이</h1>
<form action="upload3" method="post" enctype="multipart/form-data">
	아이디 : <input type="text" name="memberId"><br><br>
	비밀번호 : <input type="password" name="memberPw"><br><br>
	닉네임 : <input type="text" name="memberNick"><br><br>
	프로필 : <input type="file" name="attach" accept=".png, .jpg, .gif"><br><br>
	<input type="submit" value="회원가입">
</form>

<h1><a href="download">파일 다운로드 - Legacy</a></h1>
<h1><a href = "download2">파일 다운로드 - Spring</a></h1>
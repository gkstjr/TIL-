<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="memberId" value="${login}"></c:set>
<c:set var="isLogin" value="${memberId != null}"></c:set>
<c:set var="isAdmin" value="${auth == '관리자'}"></c:set>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업용 홈페이지</title>

<!-- 구글 폰트 CDN -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="${root}/css/reset.css">
<link rel="stylesheet" type="text/css" href="${root}/css/layout.css">
<link rel="stylesheet" type="text/css" href="${root}/css/commons.css">
<%-- <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/test.css"> --%>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://cdn.jsdelivr.net/npm/crypto-js@4.1.1/crypto-js.js"></script>
<script src="https://cdn.jsdelivr.net/npm/crypto-js@4.1.1/sha1.js"></script>
<script>
	/*
		프론트엔드 암호화에 대한 계획
		- 암호화 알고리즘은 상황에 맞게 선택
		- input[type=password] 형태의 컬럼을 찾아서 전송 전에 암호화한 값으로 교체
	*/
	$(function(){
		$("form").submit(function(){
			//this == form
			$(this).find("input[type=password]").each(function(){
				//this == 입력창
				var rawData = $(this).val();
				//var encData = 암호화(rawData);
				var hash = CryptoJS.SHA1(rawData);//암호화
				var encData = CryptoJS.enc.Hex.stringify(hash);//문자열화
				$(this).val(encData);
			});
		});
	});
</script>

</head>
<body>

	<!-- main 영역 : 실제 홈페이지가 되는 영역(프로그래밍에서의 main 메소드) -->
    <main>

        <header>
            <h1>KH정보교육원 JSP 수업용 홈페이지</h1>
        </header>

		<!-- 메뉴 영역 -->
        <nav>
        	<!-- 디자인이 이루어지도록 ul로 메뉴를 구현 -->
        	<ul class="menu">
        		<li><a href="${root}">홈으로</a></li>
        		<li>
        			<a href="#">올림픽정보</a>
        			<ul>
        				<li><a href="${root}/olympic/list">목록보기</a></li>
        				<li><a href="${root}/olympic/insert">등록하기</a></li>
        			</ul>
        		</li>
        		<li>
        			<a href="#">국영수정보</a>
        			<ul>
        				<li><a href="${root}/score/list">목록보기</a></li>
        				<li><a href="${root}/score/insert">등록하기</a></li>
        			</ul>
        		</li>
        		<li>
        			<a href="#">평가관리</a>
        			<ul>
        				<li><a href="${root}/exam/list">목록보기</a></li>
        				<li><a href="${root}/exam/insert">등록하기</a></li>
        			</ul>
        		</li>
        		<li>
        			<a href="#">상품관리</a>
        			<ul>
        				<li><a href="${root}/product/list">목록보기</a></li>
        				<li><a href="${root}/product/add">등록하기</a></li>
        			</ul>
        		</li>
        		<li>
        			<a href="${root}/board/list">게시판</a>
        		</li>
        		
        		<!-- 우측 메뉴 : 회원용 기능 -->
        		
        		<%-- 로그인 상태에 따라 다른 메뉴를 출력 --%>
        		<c:choose>
        			<c:when test="${isLogin}">
	        			<li class="right-menu">
		        			<a href="#">회원기능</a>
		        			<ul>
		        				<li><a href="${root}/member/mypage">내정보</a></li>
		        				<li><a href="${root}/member/logout">로그아웃</a></li>
		        			</ul>
		        		</li>
        			</c:when>
        			<c:otherwise>
	        			<li class="right-menu">
		        			<a href="${root}/member/login">로그인</a>
		        			<ul>
		        				<li><a href="${root}/member/join">회원가입</a></li>
		        			</ul>
		        		</li>
        			</c:otherwise>
        		</c:choose>
        		
        		<%-- 관리자라면 관리 메뉴를 출력 --%>
        		<c:if test="${isAdmin}">
        			<li class="right-menu">
	        			<a href="#">관리자메뉴</a>
	        			<ul>
	        				<li><a href="${root}/admin/list">회원관리</a></li>
	        				<li><a href="${root}/admin/statistics">사이트관리</a></li>
	        			</ul>
	        		</li>
        		</c:if>
        		
        	</ul>
        
        </nav>
        <section>
            <article>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="faml" uri="http://java.sun.com/jsp/jstl/fmt"%>

<h1>모든 거래내역 출력</h1>

<ul class = "payment-history">
<c:forEach var = "paymentListVO" items = "${list }">
		<li>
			<!-- 대표정보 -->
			이름 : ${paymentListVO.paymentDto.paymentName},
			금액 : ${paymentListVO.paymentDto.paymentTotal }원
		
			<!-- 상세정보 -->
			<ul>
				<c:forEach var = "paymentDetailDto" items = "${paymentListVO.paymentDetailList }">
					<li>
						상품명 : ${paymentDetailDto.paymentDetailName },
						금액 : ${paymentDetailDto.paymentDetailPrice }원
					</li>
				</c:forEach>
			</ul>
		</li>		
</c:forEach>
</ul>


<script src = "https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
			//$(".payment-history > li").click(function(){});
			$(".payment-history").children("li").click(function(){
				$(this).children("ul").slideToggle();
			});
				
		
	});
</script>




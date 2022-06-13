<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>챗봇 예제</h1>

<button class="btn-connect">연결</button>
<button class="btn-disconnect">종료</button>
<hr>


<!-- 메세지 출력 공간 -->
<div class ="message-wrapper"></div>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		disconnectOperation();//최초 상태 설정
		
		$(".btn-connect").click(function(){
			//주소 자동 계산
			var uri = "ws://";
			uri += location.host;
			uri += "${pageContext.request.contextPath}";
			uri += "/ws/chatbot";
			
			//접속
			socket = new WebSocket(uri);
			
			socket.onopen = function(e){
				connectOperation();
			};
			socket.onclose = function(e){
				disconnectOperation();
			};
			socket.onerror = function(){
				alert("서버와의 연결 오류가 발생하였습니다");
				disconnectOperation();
			};
			socket.onmessage = function(e){
					//console.log(e.data);
			var div = $("<div>").addClass("message").text(e.data);
			$(".message-wrapper").append(div);
			};
			
		});
		
		$(".btn-disconnect").click(function(){
			socket.close();
		});
		
	

		function connectOperation(){//연결되면 처리할 화면 작업을 구현
			$(".btn-connect").prop("disabled", true);//연결버튼 비활성화
			$(".btn-disconnect").prop("disabled", false);//종료버튼 활성화
		
		}
		function disconnectOperation(){//연결 종료되면 처리할 화면 작업을 구현
			$(".btn-connect").prop("disabled", false);//연결버튼 활성화
			$(".btn-disconnect").prop("disabled", true);//종료버튼 비활성화
		

		}
	});
</script>

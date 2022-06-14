<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>회원 전용 웹소켓 예제</h1>



<input type="text" class="send-input">
<button class="btn-send">전송</button>

<!-- 메세지 출력 공간 -->
<div class ="message-wrapper"></div>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.1/sockjs.min.js"></script>
<script>
	$(function(){
		disconnectOperation();//최초 상태 설정
		
			//주소 자동 계산
			var uri =  "${pageContext.request.contextPath}/ws/memberonly";
			
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
			
		
	
		
		$(".btn-send").click(function(){
			var text = $(".send-input").val();
			if(!text) return;
			
			socket.send(text);//전송 명령
			
			$(".send-input").val("");
		});
		function connectOperation(){//연결되면 처리할 화면 작업을 구현
		
			$(".send-input").prop("disabled",false);//입력창 활성화
			$(".btn-send").prop("disabled",false);//전송버튼 활성화
		}
		function disconnectOperation(){//연결 종료되면 처리할 화면 작업을 구현
		
			$(".send-input").prop("disable",true);
			$(".btn-send").prop("disabled",true);//전송버튼 활성화

		}
	});
</script>

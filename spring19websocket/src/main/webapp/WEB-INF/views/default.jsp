<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>기본 웹소켓 예제</h1>
    
  <button class ="btn-connect">연결</button>
  <button class ="btn-disconnect">종료</button>
  
  <script src = "https://code.jquery.com/jquery-3.6.0.js"></script>
  <script>
  	$(function(){
		
  		disconnectOperation();
  		
  		
  		//1 연결버튼누르면 웹소켓 연결
  			$(".btn-connect").click(function(){
			//주소 설정(프로토콜부터 작성해야 한다)
			var uri = "ws://localhost:8080/spring19/ws/default";
			
			//접속 - 자바스크립트 표준 API 사용
			//window.socket = new WebSocket(uri);
			 socket = new WebSocket(uri);
			 
			 connectOperation();
  			
  		});
  		$(".btn-disconnect").click(function(){
  			//연결을 종료하려면 연결 정보를 가진 객체가 필요하다
  			//window.socket.close();
  			socket.close();
			 
  			
  			disconnectOperation();

  		});
  		
  		function connectOperation(){
  			$(".btn-connect").prop("disabled",true);
  			$(".btn-disconnect").prop("disabled",false);
  		}
  		function disconnectOperation(){
  			$(".btn-connect").prop("disabled",false);
  			$(".btn-disconnect").prop("disabled",true);
  		}
  	});
  </script>
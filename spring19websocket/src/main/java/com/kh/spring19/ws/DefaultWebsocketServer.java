package com.kh.spring19.ws;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

/**
	기본 웹소켓 서버
	- 상속을 통해서 구현한다(class 또는 interface)
	- 접속 및 종료는 자동으로 구현되며, 결과만 알 수 있다
	- 필요한 기능을 재정의(override)하여 원하는 작업을 추가한다
 */
@Slf4j
//public class DefaultWebsocketServer implements WebSocketHandler{
public class DefaultWebsocketServer extends TextWebSocketHandler {
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		log.debug("접속 완료!");
		log.debug("session = {}", session);
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		log.debug("접속 종료! {}");
		log.debug("session = {}", session);
		log.debug("status = {}", status);
	}
	
}

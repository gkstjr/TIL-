package com.kh.spring19.ws;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.internal.AbstractConnectionBuilder;
@Slf4j
public class MultiuserWebsocketServer extends TextWebSocketHandler {

	//사용자 정보를 저장할 저장소
	//private Set<WebSocketSession> users = new HashSet<>();
	private Set<WebSocketSession> users = new CopyOnWriteArraySet<>();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		users.add(session);
		log.debug("사용자 입장 - 현재 사용자 {}명",users.size());
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		users.remove(session);
		log.debug("사용자 퇴장 - 현재 사용자 {}명",users.size());
	}
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		//전체 전송(broadcast)
		for(WebSocketSession user : users) {
			user.sendMessage(message);
		}
	}
}

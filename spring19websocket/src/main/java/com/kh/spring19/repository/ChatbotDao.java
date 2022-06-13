package com.kh.spring19.repository;

import java.util.List;

import com.kh.spring19.entity.ChatbotDto;

public interface ChatbotDao {
	List<ChatbotDto> getFirstMessages();
	List<ChatbotDto> getAnswer(int superNo);
}

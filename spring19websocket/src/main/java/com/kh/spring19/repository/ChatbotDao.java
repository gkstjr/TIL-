package com.kh.spring19.repository;

import java.util.List;

import com.kh.spring19.entity.ChatbotDto;
import com.kh.spring19.vo.ChatbotVO;

public interface ChatbotDao {
	List<ChatbotDto> getFirstMessages();
	List<ChatbotDto> getAnswer(int superNo);
	List<ChatbotVO> getFirstMessages2();
	List<ChatbotVO> getAnswer2(int superNo);
}

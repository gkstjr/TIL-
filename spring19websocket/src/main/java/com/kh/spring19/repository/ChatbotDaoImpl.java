package com.kh.spring19.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.entity.ChatbotDto;

@Repository
public class ChatbotDaoImpl implements ChatbotDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ChatbotDto> getFirstMessages() {
		return sqlSession.selectList("chatbot.first");
	}

	@Override
	public List<ChatbotDto> getAnswer(int superNo) {
		return sqlSession.selectList("chatbot.answer",superNo);
	}
	
}

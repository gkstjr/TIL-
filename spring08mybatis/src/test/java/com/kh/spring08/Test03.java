package com.kh.spring08;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring08.entity.ExamDto;

public class Test03 {
	
	private SqlSession sqlSession;
	
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(true);
		
	}
	
	@Test
	public void test() {
		ExamDto examDto = new ExamDto();
		examDto.setStudent("뮤츠");
		examDto.setSubject("UI구현");
		examDto.setType("문제해결시나리오");
		examDto.setScore(76);
		
		sqlSession.insert("exam.insert", examDto);
	}
}

package com.kh.spring08;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring08.entity.ExamDto;

public class Test05 {

	private SqlSession sqlSession;
	
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(true);
		
	}

	@Test
	public void list() {
		List<ExamDto> list = sqlSession.selectList("exam.list");
		for(ExamDto examDto : list) {
			System.out.println(examDto);
		}
	}

	@Test
	public void search() {
		String type = "student" , keyword = "피카";
		
//		Map<String,Object> param = new HashMap<String, Object>();
//		param.put("type", type);
//		param.put("keyword", keyword);
		
		Map<String,Object> param = Map.of("type" , type, "keyword",keyword);
		
		List<ExamDto> list = sqlSession.selectList("exam.search",param);
		for(ExamDto examDto : list) {
			System.out.println(examDto);
		}
	}
		
	@Test
	public void one() {
		long examId = 5;
		
		ExamDto examDto = sqlSession.selectOne("exam.one" , examId);
		System.out.println(examDto);
		
	}
}

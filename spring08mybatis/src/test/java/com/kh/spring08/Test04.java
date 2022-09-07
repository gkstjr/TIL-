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

import com.kh.spring08.entity.OlympicDto;

public class Test04 {

	private SqlSession sqlSession;
	
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(true);
		
	}

		@Test
		public void list() {
			List<OlympicDto> list = sqlSession.selectList("olympic.list");
			for(OlympicDto olympicDto : list) {
				System.out.println(olympicDto);
			}
		}

		@Test
		public void find() {
			String name = "한석";
			OlympicDto olympicDto = sqlSession.selectOne("olympic.one", name);
			System.out.println(olympicDto);
			
		}

		@Test
		public void Search() {
			String type = "name";
			String keyword = "국";
			
			Map<String,Object> param = new HashMap<>();
			param.put("type", type);
			param.put("keyword",keyword);
			
			List<OlympicDto> list = sqlSession.selectList("olympic.search",param);
			for(OlympicDto olympicDto : list) {
				System.out.println(olympicDto);
			}
		
		}
}

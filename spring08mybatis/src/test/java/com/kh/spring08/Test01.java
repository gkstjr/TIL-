package com.kh.spring08;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.kh.spring08.entity.OlympicDto;

public class Test01 {
	
	@Test
	public void test() throws IOException {
//		직접 SqlSessionFactory를 생성해본다
//		
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");//
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession = factory.openSession(true);
		
//		sqlSession.insert("구문아이디", 데이터);
//		sqlSession.selectList("구문아이디", 데이터);
//		sqlSession.selectOne("구문아이디",데이터);
//		sqlSession.update("구문아이디",데이터);
//		sqlSession.delete("구문아이디",데이터);
		
		OlympicDto olympicDto = new OlympicDto();
		olympicDto.setRank(80);
		olympicDto.setName("한석");
		olympicDto.setGold(99);
		olympicDto.setSilver(99);
		olympicDto.setBronze(99);
		
		sqlSession.insert("olympic.insert",olympicDto);
	}
}

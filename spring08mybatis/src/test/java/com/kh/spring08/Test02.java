package com.kh.spring08;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring08.entity.ProductDto;

public class Test02 {

	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession();	
	}

	@Test
	public void test() {
		ProductDto productDto = new ProductDto();
		productDto.setNo(126);
		productDto.setName("허니버칩");
		productDto.setType("과자");
		productDto.setPrice(2000);
		productDto.setMadeString("2022-01-01");
		productDto.setExpireString("2023-01-01");
		
		sqlSession.insert("product.add",productDto);
	}

	@After
	public void after() {
		sqlSession.commit();
	}
}
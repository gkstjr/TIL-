package com.kh.spring08;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring08.entity.ProductDto;

public class Test06 {

		
	private SqlSession sqlSession;
	
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(true);
		
	}
	
	
	@Test
	public void list() {
		List<ProductDto> list = sqlSession.selectList("product.list");
		for(ProductDto productDto : list) {
			System.out.println(productDto);
		}
	}

	@Test
	public void search() {
		Map<String,Object> param = Map.of("type","name","keyword","고친이름");
		
		List<ProductDto> list = sqlSession.selectList("product.search", param);
		for(ProductDto productDto : list) {
			System.out.println(productDto);
		}
	}

	@Test
	public void one() {
		int no = 2;
		
		ProductDto productDto = sqlSession.selectOne("product.one", no);
		System.out.println(productDto);
	}


	@Test
	public void count() {
		int count = sqlSession.selectOne("product.count");
		System.out.println(count);
	}
}

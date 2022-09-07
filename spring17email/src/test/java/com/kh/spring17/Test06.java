package com.kh.spring17;

import static org.junit.Assert.assertEquals;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.spring17.entity.CertDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test06 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		String email = "hanseok8541@gmail.com";
		String certNumber = "133614";
		
		int count = sqlSession.selectOne("cert.check", CertDto.builder()
															.certTarget(email)
															.certNumber(certNumber)
															.build());
		log.debug("count = {}", count);
		assertEquals(count, 1);																																		
	}
	
}

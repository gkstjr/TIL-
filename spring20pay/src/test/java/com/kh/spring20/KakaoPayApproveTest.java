package com.kh.spring20;

import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.spring20.service.KakaoPayService;
import com.kh.spring20.vo.KakaoPayApproveRequestVO;
import com.kh.spring20.vo.KakaoPayApproveResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class KakaoPayApproveTest {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		KakaoPayApproveResponseVO responseVO = 
				kakaoPayService.approve(
						KakaoPayApproveRequestVO.builder()
							.partner_order_id("859f84ef-cdd7-4cef-ad5c-712538046853")
							.partner_user_id("testuser1")
							.tid("T2a8cad065200508300a")
							.pg_token("0c8e910b10ec4a75eadc")
						.build()
						);
	log.debug("responseVO = {}",responseVO);
	
	}
}

package com.kh.spring20;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring20.vo.KakaoPayApproveResponseVO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Test03 {
	
	@Test
	public void test() throws URISyntaxException {
		//결제 승인 요청
		// ->결제 요청 작업이 성공적으로 끝나 후 발생하는 요청
		RestTemplate template = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 278a38da40271710250b1054d8350ada");
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("cid", "TC0ONETIME");
		body.add("tid", "???");//
		body.add("partner_order_id", "");//결제요청시의 거래번호
		body.add("partner_user_id", "");//결제 요청시의 회원번호
		body.add("pg_token", "");//결제 성공 후 서버에서 반환되는 토근(Token)
		
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body,headers);
		
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		Map resp = template.postForObject(uri, entity, Map.class);
		log.debug("resp = {}",resp);
		KakaoPayApproveResponseVO vo = 
				template.postForObject(uri, entity, KakaoPayApproveResponseVO.class);
		log.debug("vo = {}",vo);
	}
}

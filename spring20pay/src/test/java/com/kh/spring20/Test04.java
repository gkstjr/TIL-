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

import com.kh.spring20.vo.KakaoPayOrderResponseVO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Test04 {

	@Test
	public void test() throws URISyntaxException {
		RestTemplate template = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 278a38da40271710250b1054d8350ada");
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("cid", "TC0ONETIME");
		body.add("tid", "T2b05cfa1d7a790f27b1");
		
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body,headers);

		URI uri = new URI("https://kapi.kakao.com/v1/payment/order");

//		Map resp = template.postForObject(uri, entity, Map.class);
//		log.debug("resp = {}", resp);
		
		KakaoPayOrderResponseVO responseVO = 
				template.postForObject(uri, entity, KakaoPayOrderResponseVO.class);
		log.debug("responseVO = {}",responseVO);
	}
}

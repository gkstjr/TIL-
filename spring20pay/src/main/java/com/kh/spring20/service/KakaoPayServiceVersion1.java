package com.kh.spring20.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring20.vo.KakaoPayApproveRequestVO;
import com.kh.spring20.vo.KakaoPayApproveResponseVO;
import com.kh.spring20.vo.KakaoPayReadyRequestVO;
import com.kh.spring20.vo.KakaoPayReadyResponseVO;
@Service
public class KakaoPayServiceVersion1 implements KakaoPayService {

	private String urlPrefix = "https://kapi.kakao.com/v1/payment";
	
	private RestTemplate template = new RestTemplate();
	
	private String authorization = "KakaoAK 278a38da40271710250b1054d8350ada";
	private String contentType = "application/x-www-form-urlencoded;charset=utf-8";
	
	private String cid = "TC0ONETIME";
	@Override
	public KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO requestVO) throws URISyntaxException {
		//정보에는 Header와 Body가 존재한다(POST방식)
		HttpHeaders headers = new HttpHeaders();
		//headers.add("이름", "값");
		headers.add("Authorization", authorization);
		headers.add("Content-type", contentType);
		
		//body
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		//body.add("이름", "값");
		body.add("cid", cid);
		body.add("partner_order_id", requestVO.getPartner_order_id());//임시로 랜덤 시리얼 번호 사용
		body.add("partner_user_id", requestVO.getPartner_user_id());
		body.add("item_name", requestVO.getItem_name());
		body.add("quantity", String.valueOf(requestVO.getTotal_amount()));
		body.add("total_amount", String.valueOf(requestVO.getTotal_amount()));
		body.add("tax_free_amount", "0");//무조건 0원
		
//		
//		String prefix = ServletUriComponentsBuilder
//									.fromCurrentContextPath()
//									.path(authorization)
//									.toUriString();
		String prefix = "http://localhost:8080/spring20/pay";
		body.add("approval_url", prefix+"/approve");
		body.add("cancel_url", prefix+"/cancel");
		body.add("fail_url", prefix+"/fail");
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);

		URI uri = new URI(urlPrefix+"/ready");

		KakaoPayReadyResponseVO responseVO = 
				template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
		return responseVO;
	}

	@Override
	public KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO requestVO) throws URISyntaxException {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", authorization);
		headers.add("Content-type", contentType);
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("cid", cid);
		body.add("tid", requestVO.getTid());//결제요청시의 거래번호
		body.add("partner_order_id", requestVO.getPartner_order_id());//결제요청시의 거래번호
		body.add("partner_user_id", requestVO.getPartner_user_id());//결제 요청시의 회원번호
		body.add("pg_token", requestVO.getPg_token());//결제 성공 후 서버에서 반환되는 토근(Token)
		
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body,headers);
		
		URI uri = new URI(urlPrefix+ "/approve");
		
		KakaoPayApproveResponseVO responseVO = 
				template.postForObject(uri, entity, KakaoPayApproveResponseVO.class);
		return responseVO;
	}

}

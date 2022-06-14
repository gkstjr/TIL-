package com.kh.spring20.service;

import java.net.URISyntaxException;

import com.kh.spring20.vo.KakaoPayApproveRequestVO;
import com.kh.spring20.vo.KakaoPayApproveResponseVO;
import com.kh.spring20.vo.KakaoPayReadyRequestVO;
import com.kh.spring20.vo.KakaoPayReadyResponseVO;

public interface KakaoPayService {
	KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO requestVO) throws URISyntaxException;
	KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO requestVO) throws URISyntaxException;
			
}

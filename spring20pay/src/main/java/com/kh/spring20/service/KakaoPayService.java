package com.kh.spring20.service;

import com.kh.spring20.vo.KakaoPayApproveResponseVO;
import com.kh.spring20.vo.KakaoPayReadyResponseVO;

public interface KakaoPayService {
	KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO requestVO);
	KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO requestVO);
			
}

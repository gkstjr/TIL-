package com.kh.spring20.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class KakaoPayReadyResponseVO {
	
	private String tid;
	private String next_redirect_mobile_url,next_redirect_pc_url;//결제 페이지 주소
	private Date created_at;
}

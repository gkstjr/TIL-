package com.kh.spring20.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class KakaoPayReadyRequestVO {
	private String cid;
	private String partner_order_id;
	private String partner_user_id;
	private String item_name;
	private int quantity;
	private int total_amount;
	private int tax_free_amount;
	private String approval_url;
	private String cancel_url;
	private String fail_url;
	
}

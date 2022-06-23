package com.kh.spring20.vo;

import java.util.List;

import com.kh.spring20.entity.PaymentDetailDto;
import com.kh.spring20.entity.PaymentDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PaymentListVO {
	//1개의 대표결제정보와 여러개의 결제상세정보가 들어있어야 한다
	//1개의 대표결제정보 = PaymentDto
	//여러개의 결제상세정보 = List<PaymentDetailDto>
	
	private PaymentDto paymentDto;
	private List<PaymentDetailDto> paymentDetailList;
}

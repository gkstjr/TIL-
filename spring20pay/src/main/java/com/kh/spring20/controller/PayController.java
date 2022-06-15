package com.kh.spring20.controller;

import java.net.URISyntaxException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring20.entity.ProductDto;
import com.kh.spring20.repository.ProductDao;
import com.kh.spring20.service.KakaoPayService;
import com.kh.spring20.vo.KakaoPayApproveRequestVO;
import com.kh.spring20.vo.KakaoPayApproveResponseVO;
import com.kh.spring20.vo.KakaoPayReadyRequestVO;
import com.kh.spring20.vo.KakaoPayReadyResponseVO;
import com.kh.spring20.vo.PurchaseVO;


@Controller
public class PayController {
	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/")
	public String home() {
		return "home";
		
	}
	@GetMapping("/pay1")
	public String pay1(Model model) {
		model.addAttribute("list",productDao.list());
		return "pay1/list";
	}
	@GetMapping("/pay1_purchase")
	public String pay1Purchase(@RequestParam int no, Model model){
		model.addAttribute("productDto",productDao.find(no));
		return "pay1/purchase";
	
		
	}
	@PostMapping("/pay1_purchase")
	public String pay1Purchase(
				@ModelAttribute PurchaseVO purchaseVO) throws URISyntaxException {
		
		ProductDto productDto = productDao.find(purchaseVO.getNo());
		
		//결제 준비 요청을 진행
		int totalAmount = productDto.getPrice() * purchaseVO.getQuantity();
		KakaoPayReadyRequestVO requestVO = 
				KakaoPayReadyRequestVO.builder()
											.partner_order_id(UUID.randomUUID().toString())
											.partner_user_id("testuser1")
											.item_name(productDto.getName())
											.quantity(purchaseVO.getQuantity())
											.total_amount(totalAmount)
										.build();
		
		KakaoPayReadyResponseVO responseVO = kakaoPayService.ready(requestVO);
		return "redirect:"+responseVO.getNext_redirect_pc_url();	
	}

	//승인/취소/실패 : 카카오 API에 신청한 URL로 처리
	@GetMapping("/pay/success")
	public String paySuceess(@RequestParam String pg_token) throws URISyntaxException {
		//주어진 정보를 토대로 approve 요청을 보낸다
		KakaoPayApproveRequestVO requestVO = KakaoPayApproveRequestVO.builder()
														.partner_order_id("??")
														.partner_user_id("???")
														.tid("???")
														.pg_token(pg_token)
													.build();
				KakaoPayApproveResponseVO responseVO = kakaoPayService.approve(requestVO);
				
				
				return "redirect:결제완료안내페이지";
				
	}
//	@GetMapping("/pay/cancel")
//	@GetMapping("/pay/fail")
}

package com.kh.spring18.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductSearchVO {
	private int no;
	private String name;
	private List<String> types;
	private int minPrice, maxPrice;
	private String beginDate, endDate, beginExpire, endExpire;
}
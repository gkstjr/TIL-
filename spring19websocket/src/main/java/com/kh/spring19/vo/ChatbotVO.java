package com.kh.spring19.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatbotVO {
	private int chatbotNo;
	private String chatbotContent;
	private int count;
}
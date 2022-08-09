package com.kh.spring18.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamDto {
	private long examId;
	private String student;
	private String subject;
	private String type;
	private int score;
}

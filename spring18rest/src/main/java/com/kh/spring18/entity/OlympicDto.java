package com.kh.spring18.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OlympicDto {
	private int rank;
	private String name;
	private int gold,silver,bronze;
}

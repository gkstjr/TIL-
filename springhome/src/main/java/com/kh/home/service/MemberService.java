package com.kh.home.service;

import org.springframework.web.multipart.MultipartFile;

import com.kh.home.entity.MemberDto;

public interface MemberService  {
	void join(MemberDto memberDto, MultipartFile memberProfile) throws Exception;
}

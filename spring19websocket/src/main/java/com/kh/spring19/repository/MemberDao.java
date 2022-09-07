package com.kh.spring19.repository;

import java.util.List;

import com.kh.spring19.entity.MemberDto;

//다양한 형태를 손쉽게 교체하는 구조를 구현하기 위해 앞으로의 DAO는 모두 추상화 구조로 만든다
public interface MemberDao {
		MemberDto login(String memberId, String memberPw);
		
}


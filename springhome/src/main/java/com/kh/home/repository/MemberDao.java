package com.kh.home.repository;

import java.util.List;

import com.kh.home.entity.MemberDto;
import com.kh.home.vo.MemberComplexSearchVO;

//다양한 형태를 손쉽게 교체하는 구조를 구현하기 위해 앞으로의 DAO는 모두 추상화 구조로 만든다
public interface MemberDao {
		void join(MemberDto memberDto);
		List<MemberDto> complexSearch(MemberComplexSearchVO vo);
		MemberDto login(String memberId, String memberPw);
		MemberDto info(String memberId);
		boolean changePassword(String memberId, String currentPw, String changePw);
		String findId(MemberDto memberDto);
		boolean exit(String memberId, String memberPw);
		boolean changeInfomation(MemberDto memberDto);
		
}


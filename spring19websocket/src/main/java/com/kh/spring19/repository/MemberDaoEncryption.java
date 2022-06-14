package com.kh.spring19.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.kh.spring19.entity.MemberDto;

@Repository
public class MemberDaoEncryption implements MemberDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	


	@Override
	public MemberDto login(String memberId, String memberPw) {
		MemberDto memberDto = sqlSession.selectOne("member.one",memberId);
		System.out.println(memberDto);

		if(memberDto == null) {
			return null;
		}
//		System.out.println(memberPw);
//		boolean isPasswordMatch = memberDto.getMemberPw().equals(memberPw);
//		boolean isPasswordMatch = passwordEncoder.matches( memberDto.getMemberPw(),memberPw);
//		System.out.println(isPasswordMatch);
//		if(isPasswordMatch) {
			sqlSession.update("member.updateLastLogin",memberId);
			return memberDto;
//		}
//		else {
//			return null;
		}
	}
//}

	
	
	


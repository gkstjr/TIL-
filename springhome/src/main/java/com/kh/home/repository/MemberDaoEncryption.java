package com.kh.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.kh.home.entity.MemberDto;
import com.kh.home.vo.MemberComplexSearchVO;

@Repository
public class MemberDaoEncryption implements MemberDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void join(MemberDto memberDto) {
		//비밀번호를 암호화하여 재설정한 뒤 등록
		String rawPassword = memberDto.getMemberPw();
		String encryptPassword = passwordEncoder.encode(rawPassword);
		memberDto.setMemberPw(encryptPassword);
		sqlSession.insert("member.join",memberDto);
		
		
	}

	@Override
	public List<MemberDto> complexSearch(MemberComplexSearchVO vo) {
		List<MemberDto> list = sqlSession.selectList("member.complexSearch2",vo);
		return list;
	}

	@Override
	public MemberDto login(String memberId, String memberPw) {
		MemberDto memberDto = sqlSession.selectOne("member.one",memberId);
		if(memberDto == null) {
			return null;
		}
//		boolean isPasswordMatch = memberDto.getMemberPw().equals(memberPw);
		boolean isPasswordMatch = passwordEncoder.matches(memberPw, memberDto.getMemberPw());
		if(isPasswordMatch) {
			sqlSession.update("member.updateLastLogin",memberId);
			return memberDto;
		}
		else {
			return null;
		}
	}

	@Override
	public MemberDto info(String memberId) {
		return sqlSession.selectOne("member.one",memberId);
		
	}

	@Override
	public boolean changePassword(String memberId, String currentPw, String changePw) {
		MemberDto memberDto = this.login(memberId,currentPw);
		if(memberDto == null) {
			return false;
		}
		//비밀번호 암호화 코드를 추가
		String encodePassword = passwordEncoder.encode(changePw);
		
		int count = sqlSession.update("member.changePassword",
				MemberDto.builder().memberId(memberId).memberPw(encodePassword).build());
	
		return count > 0;
	}

	@Override
	public String findId(MemberDto memberDto) {
	return	sqlSession.selectOne("member.findId",memberDto);
	}

	@Override
	public boolean exit(String memberId, String memberPw) {
		MemberDto memberDto = this.login(memberId, memberPw);
		if(memberDto == null) {
			return false;
		}
		else {
			int count = sqlSession.delete("member.exit",memberId);
			return count > 0;
		}
	}

	@Override
	public boolean changeInfomation(MemberDto memberDto) {
		MemberDto findDto = this.login(memberDto.getMemberId(),memberDto.getMemberPw());
		if(findDto == null) {
			return false;
		}
		int count = sqlSession.update("member.changeInformation",memberDto);
		return count >0;
	}
	
	
}

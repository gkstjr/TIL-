package com.kh.home.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.kh.home.entity.MemberDto;

//전제조건은 component-scan과 annotation-driven 설정이 있어야 한ㄷ!
//@Repository는 해당 클래스를 "영속성 제어"를 위한 용도로 쓰기 위한 등록 코드

@Repository
public class MemberDao {
	
//	이 클래스는 연결 도구인 DataSource를 필요로 한다
	@Autowired
	private DriverManagerDataSource dataSource;
	
	public void join(MemberDto memberDto) throws Exception {
		Connection con = dataSource.getConnection();
		
		String sql = "insert into member("
							+ "member_id, member_pw, member_nick, member_birth, member_email, "
							+ "member_phone, member_post, member_basic_address, member_detail_address) "
						+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberId());
		ps.setString(2, memberDto.getMemberPw());
		ps.setString(3, memberDto.getMemberNick());
		ps.setString(4, memberDto.getMemberBirth());
		ps.setString(5, memberDto.getMemberEmail());
		ps.setString(6, memberDto.getMemberPhone());
		ps.setString(7, memberDto.getMemberPost());
		ps.setString(8, memberDto.getMemberBasicAddress());
		ps.setString(9, memberDto.getMemberDetailAddress());
		ps.execute();
		
		con.close();
	}
	
//	단일조회
	public MemberDto selectOne(String memberId) throws Exception {
		Connection con = dataSource.getConnection();

		
		String sql = "select * from member where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ResultSet rs = ps.executeQuery();
		
		MemberDto memberDto;
		if(rs.next()) {
			memberDto = new MemberDto();
			
			//data 13개 copy
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPost(rs.getString("member_post"));
			memberDto.setMemberBasicAddress(rs.getString("member_basic_address"));
			memberDto.setMemberDetailAddress(rs.getString("member_detail_address"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberGrade(rs.getString("member_grade"));
			memberDto.setMemberJoindate(rs.getDate("member_joindate"));
			memberDto.setMemberLogindate(rs.getDate("member_logindate"));
		}
		else {
			memberDto = null;
		}
		
		con.close();
		
		return memberDto;
	}

//	비밀번호 변경
	public boolean changePassword(String memberId, String changePw) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "update member set member_pw = ? where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, changePw);
		ps.setString(2, memberId);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}

//	개인정보 변경
	public boolean changeInformation(MemberDto memberDto) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "update member set "
									+ "member_nick = ? , member_birth = ? , member_phone = ?, member_email = ? , "
									+ "member_post = ? , member_basic_address = ?, member_detail_address = ? "
									+ "where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberNick());
		ps.setString(2, memberDto.getMemberBirth());
		ps.setString(3, memberDto.getMemberPhone());
		ps.setString(4, memberDto.getMemberEmail());
		ps.setString(5, memberDto.getMemberPost());
		ps.setString(6, memberDto.getMemberBasicAddress());
		ps.setString(7, memberDto.getMemberDetailAddress());
		ps.setString(8, memberDto.getMemberId());
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
//	최종 접속일시 갱신
//	= 야! OOO의 접속일시 갱신해!
	public boolean updateLogindate(String memberId) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "update member set member_logindate = sysdate where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}

//	탈퇴 기능
//	= 야! OOO 지워!
	public boolean delete(String memberId) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "delete member where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
//	아이디찾기 = 단일조회와 큰 차이 없음!
	public String findId(MemberDto memberDto) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "select member_id from member where member_nick=? and member_phone=? and member_birth=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberNick());
		ps.setString(2, memberDto.getMemberPhone());
		ps.setString(3, memberDto.getMemberBirth());
		ResultSet rs = ps.executeQuery();
		
//		String memberId = null or 데이터;
		String memberId;
		if(rs.next()) {
			memberId = rs.getString("member_id");
		}
		else {
			memberId = null;
		}
		
		con.close();
		
		return memberId;
	}
	
//	비밀번호 찾기용 검색
	public MemberDto findPw(MemberDto memberDto) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "select * from member "
							+ "where "
							+ "member_id = ? and member_nick = ? and member_phone = ? and member_birth = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberId());
		ps.setString(2, memberDto.getMemberNick());
		ps.setString(3, memberDto.getMemberPhone());
		ps.setString(4, memberDto.getMemberBirth());
		ResultSet rs = ps.executeQuery();
		
		MemberDto findDto;
		if(rs.next()) {
			findDto = new MemberDto();
			
			//data 13개 copy
			findDto.setMemberId(rs.getString("member_id"));
			findDto.setMemberPw(rs.getString("member_pw"));
			findDto.setMemberNick(rs.getString("member_nick"));
			findDto.setMemberBirth(rs.getString("member_birth"));
			findDto.setMemberPhone(rs.getString("member_phone"));
			findDto.setMemberEmail(rs.getString("member_email"));
			findDto.setMemberPost(rs.getString("member_post"));
			findDto.setMemberBasicAddress(rs.getString("member_basic_address"));
			findDto.setMemberDetailAddress(rs.getString("member_detail_address"));
			findDto.setMemberPoint(rs.getInt("member_point"));
			findDto.setMemberGrade(rs.getString("member_grade"));
			findDto.setMemberJoindate(rs.getDate("member_joindate"));
			findDto.setMemberLogindate(rs.getDate("member_logindate"));
		}
		else {
			findDto = null;
		}
		
		con.close();
		
		return findDto;
	}

	public MemberDto findByNickname(String memberNick) throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "select * from member where member_nick = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberNick);
		ResultSet rs = ps.executeQuery();
		
		MemberDto memberDto;
		if(rs.next()) {
			memberDto = new MemberDto();
			
			//data 13개 copy
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPost(rs.getString("member_post"));
			memberDto.setMemberBasicAddress(rs.getString("member_basic_address"));
			memberDto.setMemberDetailAddress(rs.getString("member_detail_address"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberGrade(rs.getString("member_grade"));
			memberDto.setMemberJoindate(rs.getDate("member_joindate"));
			memberDto.setMemberLogindate(rs.getDate("member_logindate"));
		}
		else {
			memberDto = null;
		}
		
		con.close();
		
		return memberDto;
	}
	
	//회원목록
	public List<MemberDto> selectList() throws Exception {
		Connection con = dataSource.getConnection();

		String sql = "select * from member order by member_id asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPost(rs.getString("member_post"));
			memberDto.setMemberBasicAddress(rs.getString("member_basic_address"));
			memberDto.setMemberDetailAddress(rs.getString("member_detail_address"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberGrade(rs.getString("member_grade"));
			memberDto.setMemberJoindate(rs.getDate("member_joindate"));
			memberDto.setMemberLogindate(rs.getDate("member_logindate"));
			list.add(memberDto);
		}
		
		con.close();
		return list;
	}
	
}
package han.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	
	public void join(MemberDto memberDto) throws Exception{
			Connection con = JdbcUtils.getConnection();
			
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
		public MemberDto selectOne(String memberId) throws Exception {
			Connection con = JdbcUtils.getConnection();
			
			String sql = "select * from member where member_id = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			ResultSet rs = ps.executeQuery();
			
			MemberDto memberDto;
			if(rs.next()) {
				memberDto = new MemberDto();
				
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
				
			}else {
				memberDto = null;
			}
		
			con.close();
			return memberDto;
		}
			public boolean changePassword(String memberId, String changePw) throws Exception	{
				Connection con = JdbcUtils.getConnection();
				
				String sql = "update member set member_pw = ? where member_id=?";
				
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, changePw);
				ps.setString(2, memberId);
				int count = ps.executeUpdate();
				
				con.close();
				return count> 0;
			}

			public boolean changeInformation(MemberDto memberDto) throws Exception {
				Connection con = JdbcUtils.getConnection();
			
				String sql = "update member set "
								+"member_nick = ?, member_birth = ? , member_phone = ?, member_email=?,"
								+"member_post = ? , member_basic_address = ?, member_detail_address =?"
								+ "where member_id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, memberDto.getMemberNick());
				ps.setString(2, memberDto.getMemberBirth());
				ps.setString(3, memberDto.getMemberPhone());
				ps.setString(4, memberDto.getMemberEmail());
				ps.setString(5, memberDto.getMemberPostString());
				ps.setString(6, memberDto.getMemberBasicAddressString());
				ps.setString(7, memberDto.getMemberDetailAddressString());
				ps.setString(8, memberDto.getMemberId());
				int count = ps.executeUpdate();
				
				con.close();
				
				return count>0;
			}
			
			public boolean updateLogindate(String memberId) throws Exception {
					Connection con = JdbcUtils.getConnection();
					
					String sql = "update member set member_logindate =sysdate where member_id=?";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, memberId);
					int count = ps.executeUpdate();
					
					con.close();
					
					return count > 0;
			}

			public boolean delete(String memberId) throws Exception	{
				Connection con = JdbcUtils.getConnection();
				
				String sql = "delete member where member_id =?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, memberId);
				int count = ps.executeUpdate();
				
				con.close();
				return count>0;
			}
			public String findId(MemberDto memberDto) throws Exception {
				Connection con = JdbcUtils.getConnection();
				
				String sql = "select member_id from member where member_nick=? and member_phone=? and member_birth?";
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, memberDto.getMemberNick());
				ps.setString(2, memberDto.getMemberPhone());
				ps.setString(3, memberDto.getMemberBirth());
				ResultSet rs = ps.executeQuery();
				
				String memberId;
				if(rs.next()) {
					memberId=rs.getString("member_id");
				}
				else {
					memberId = null;
				}
			con.close();
			return memberId;
			}
			public MemberDto findPw(MemberDto memberDto) throws Exception {
				Connection con = JdbcUtils.getConnection();
				
				String sql = "select * from member where member_id=? and member_nick=? and member_phone=? and member_birth = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, memberDto.getMemberId());
				ps.setString(2, memberDto.getMemberNick());
				ps.setString(3, memberDto.getMemberPhone());
				ps.setString(4, memberDto.getMemberBirth());
				ResultSet rs = ps.executeQuery();
				
				MemberDto findDto;
				if(rs.next()) {
					findDto = new MemberDto();
					
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
					
				}else {
					findDto = null;
				}
			
				con.close();
				return findDto;
			}

}
				

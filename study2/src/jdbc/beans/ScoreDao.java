package jdbc.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScoreDao {
	
	public void insert(ScoreDto scoreDto) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "insert into score(name,korean,english,math) values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, scoreDto.getName());
		ps.setInt(2, scoreDto.getKor());
		ps.setInt(3, scoreDto.getEng());
		ps.setInt(4, scoreDto.getMath());
		
		ps.execute();
		
		
		
		con.close();
	}

	public boolean update(ScoreDto scoreDto) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "update score set korean=?,english=?,math=? where name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, scoreDto.getKor());
		ps.setInt(2, scoreDto.getEng());
		ps.setInt(3, scoreDto.getMath());
		ps.setString(4, scoreDto.getName());
		int count = ps.executeUpdate();
		
		con.close();
		
		return count>0;
	
	}
	public List<ScoreDto> select() throws Exception{
		Connection con = JdbcUtils.getConnection();
		String sql = "select * from score";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<ScoreDto> list = new ArrayList<>();
		while(rs.next()) {
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setName(rs.getString("name"));
			scoreDto.setKor(rs.getInt("kor"));
			scoreDto.setEng(rs.getInt("eng"));
			scoreDto.setMath(rs.getInt("math"));
			
			list.add(scoreDto);
		}
		
		
		con.close();
		return list;
	}
		public List<ScoreDto> selectList(String name) throws Exception{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from score where instr(name,?) > 0order by name asc";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			List<ScoreDto> list = new ArrayList<>();

			while(rs.next()) {
				ScoreDto scoreDto = new ScoreDto();
				scoreDto.setName(rs.getString("name"));
				scoreDto.setKor(rs.getInt("kor"));
				scoreDto.setEng(rs.getInt("eng"));
				scoreDto.setMath(rs.getInt("math"));
				
				list.add(scoreDto);
			}
				con.close();
				return list;
		}
}

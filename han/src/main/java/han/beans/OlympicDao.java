package han.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Data Acess object(DAO)
public class OlympicDao {

	public void insert(OlympicDto olympicDto) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "insert into olympic(rank,name,gold,silver,bronze) values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, olympicDto.getRank());
		ps.setString(2, olympicDto.getName());
		ps.setInt(3, olympicDto.getGold());
		ps.setInt(4, olympicDto.getSilver());
		ps.setInt(5, olympicDto.getBronze());
		
		ps.execute();
		
		con.close();
		
	}


	public boolean update(OlympicDto olympicDto) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "update olympic set rank = ?, gold =?,silver=?,bronze=? where name = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, olympicDto.getRank());
		ps.setInt(2, olympicDto.getGold());
		ps.setInt(3, olympicDto.getSilver());
		ps.setInt(4, olympicDto.getBronze());
		ps.setString(5, olympicDto.getName());
		int count = ps.executeUpdate();
		
		con.close();
		return count>0;
		
	}

	public boolean delete(String name) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "delete olympic where name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count>0;
	}

	public List<OlympicDto> select() throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from olympic";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
//		연결이 끊어지기 전까지 rs의 모든 데이터를 List에 옮겨야 한다.
		List<OlympicDto> list = new ArrayList<>();
		
		while(rs.next()) {
			OlympicDto olympicDto = new OlympicDto();
			olympicDto.setRank(rs.getInt("rank"));
			olympicDto.setName(rs.getString("name"));
			olympicDto.setGold(rs.getInt("gold"));
			olympicDto.setSilver(rs.getInt("silver"));
			olympicDto.setBronze(rs.getInt("bronze"));

			list.add(olympicDto);
		}
		
		
		con.close();
		
		return list;
	}
	public List<OlympicDto> selectList(String keyword) throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from olympic where instr(name,?)>0 order by rank asc";
//		String sql = "select * from olympic where regexp_like(name,?) order by rank asc";
//		String sql = "select * from olympic where name like '%'||?||'%' order by rank asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
List<OlympicDto> list = new ArrayList<>();
		
		while(rs.next()) {
			OlympicDto olympicDto = new OlympicDto();
			olympicDto.setRank(rs.getInt("rank"));
			olympicDto.setName(rs.getString("name"));
			olympicDto.setGold(rs.getInt("gold"));
			olympicDto.setSilver(rs.getInt("silver"));
			olympicDto.setBronze(rs.getInt("bronze"));

			list.add(olympicDto);
		}
		
		
		
		con.close();
		return list;
	}
	public OlympicDto selectOne(int rank) throws Exception{
		Connection con = JdbcUtils.getConnection();
		String sql = "select * from olympic where rank = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, rank);
		ResultSet rs = ps.executeQuery();
		OlympicDto olympicDto;
		if(rs.next()) {
			 olympicDto = new OlympicDto();
			olympicDto.setRank(rs.getInt("rank"));
			olympicDto.setName(rs.getString("name"));
			olympicDto.setGold(rs.getInt("gold"));
			olympicDto.setSilver(rs.getInt("silver"));
			olympicDto.setBronze(rs.getInt("bronze"));
			
	}else {
		olympicDto = null;
	}
		
		
		
		con.close();
		return olympicDto;
	}



}

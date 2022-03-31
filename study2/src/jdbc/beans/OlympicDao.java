package jdbc.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OlympicDao {

	public void insert(OlympicDto olympicDto) throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kim","kim");
		
		String sql = "insert into olympic values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, olympicDto.getRank());
		ps.setString(2, olympicDto.getName());
		ps.setInt(3, olympicDto.getGold());
		ps.setInt(4, olympicDto.getSilver());
		ps.setInt(5, olympicDto.getBronze());
		ps.execute();
		
		
		con.close();
	}
		public boolean update(OlympicDto olympicDto) throws Exception{
			Connection con = JdbcUtils.getConnection();
			String sql = "update olympic set rank=?,gold=?,silver=?,bronze=? where name = ?";
			PreparedStatement ps =con.prepareStatement(sql);
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
			Connection con = JdbcUtils.getConnection();
			String sql = "delete Olympic where name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			int count = ps.executeUpdate();
			
			con.close();
		
			return count>0;
		}
		
		public List<OlympicDto> select() throws Exception{
			Connection con =  JdbcUtils.getConnection();
			String sql = "select * from olympic";
			PreparedStatement ps = con.prepareStatement(sql);
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
		public List<OlympicDto> selectList(String keyword) throws Exception{
			Connection con = JdbcUtils.getConnection();
			String sql = "select * from olympic where instr(name,?)>0 order by rank asc";
//			String sql = "select * from olympic where name like '%'||?||'%' order by rank asc";
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
	
}

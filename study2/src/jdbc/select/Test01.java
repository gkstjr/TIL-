package jdbc.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.beans.JdbcUtils;
import jdbc.beans.OlympicDto;

public class Test01 {
	public static void main(String[] args) throws Exception {
		
		Connection con = JdbcUtils.getConnection();
		String sql = "select * from olympic order by rank asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			OlympicDto olympicDto = new OlympicDto();
			olympicDto.setRank(rs.getInt("rank"));
			olympicDto.setName(rs.getString("name"));
			olympicDto.setGold(rs.getInt("gold"));
			olympicDto.setSilver(rs.getInt("silver"));
			olympicDto.setBronze(rs.getInt("bronze"));
			
		}
		
		con.close();
		
		System.out.println("조회완료");
	}
}

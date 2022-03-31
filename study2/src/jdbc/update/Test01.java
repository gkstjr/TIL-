package jdbc.update;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.beans.JdbcUtils;

public class Test01 {
	public static void main(String[] args) throws Exception {
		
		int rank =1 ;
		String name = "김한석";
		int gold = 30;
		int silver =20;
		int bronze = 10;
		
				Connection con = JdbcUtils.getConnection();
				
				String sql = "update olympic set rank = ?,gold=?,silver=?,bronze=? where name = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, rank);
				ps.setInt(2, gold);
				ps.setInt(3, silver);
				ps.setInt(4, bronze);
				ps.setString(5, name);
				int count = ps.executeUpdate();
				
				
				con.close();
				
				if(count>0)
				System.out.println("변경완료!");
				else System.out.println("변경 실패");
	}
}

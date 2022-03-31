package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		int rank = 30;
		String name = "한국";
		int gold = 2;
		int silver = 1;
		int bronze = 1;
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kim","kim");
		
		String sql = "insert into olympic(rank,name,gold,silver,bronze) values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, rank);
		ps.setString(2,name);
		ps.setInt(3, gold);
		ps.setInt(4, silver);
		ps.setInt(5, bronze);
		ps.execute();
		
		con.close();
		System.out.println("성공!");
	}
}

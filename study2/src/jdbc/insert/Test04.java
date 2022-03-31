package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test04 {
	public static void main(String[] args) throws Exception {
		String name = "슬라임";
		int korean = 95;
		int english = 80;
		int math = 72;
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kim","kim");
		
		String sql = "insert into score values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, korean);
		ps.setInt(3, english);
		ps.setInt(4, math);
		ps.execute();
		
		
		con.close();
		System.out.println("학생 정보가 등록됨");
	}
}

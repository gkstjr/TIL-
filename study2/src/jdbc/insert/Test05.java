package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test05 {
	public static void main(String[] args) throws Exception {
		String student = "마리오";
		String subject = "서버프로그램구현";
		String type = "문제해결시나리오";
		int score = 85;
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kim","kim");
		
		String sql = "insert into exam values(exam_seq.nextval,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, student);
		ps.setString(2, subject);
		ps.setString(3, type);
		ps.setInt(4, score);
		ps.execute();		
		
		
		con.close();
		System.out.println("입력 완료");
	}
}

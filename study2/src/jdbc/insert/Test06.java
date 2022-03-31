package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test06 {
	public static void main(String[] args) {
		try {
			String customerId = "kimhanseok";
			String customerPhone = "010-7240-8332";
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kim","kim");
			
			String sql = "insert into customer values(customer_seq.nextval,?,?,sysdate,sysdate,0,'일반')";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerId);
			ps.setString(2, customerPhone);
			ps.execute();
			
			con.close();
			System.out.println("고객정보 등록 완료");
			
		}catch(Exception e) {
			System.err.println("고객 정보등록과정에서 오륩ㄹㅇㄹ");
			e.printStackTrace();
		}
	}
}

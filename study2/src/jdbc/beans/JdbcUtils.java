package jdbc.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
		public static Connection getConnection() throws Exception{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kim","kim");
			return con;
		}
}

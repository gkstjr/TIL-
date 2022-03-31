package jdbc.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	public void insert(CustomerDto customerDto) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "insert into customer1("
				+	"customer_no,"
				+	"customer_id,"
				+	"customer_phone,"
				+	"customer_regist_date,"
				+	"customer_purchase_date,"
				+	"customer_mileage,customer_level"
				+") values("
				+ "customer_seq.nextval,?,?,sysdate,sysdate,0,'일반'"
				+ ")";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, customerDto.getCustomerId());
		ps.setString(2, customerDto.getCustomerPhone());
		ps.execute();
		
		con.close();
		
	}

	
	public boolean editCustomerProfile(CustomerDto customerDto) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "update customer1 set customer_id =? , customer_phone=? where customer_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, customerDto.getCustomerId());
		ps.setString(2, customerDto.getCustomerPhone());
		ps.setInt(3, customerDto.getCustomerNo());
		int count = ps.executeUpdate();
		
		con.close();
		return count>0;
	}

	public boolean addPoint(int customerNo,int amount) throws Exception{
		if(amount<0) return false;
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "update customer1 set customer_mileage = customer_mileage +? where customer_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, amount);
		ps.setInt(2, customerNo);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count >0;
	
	}

	public List<CustomerDto> selectList() throws Exception{
		Connection con = JdbcUtils.getConnection();
		String sql = "select * from customer";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<CustomerDto> list = new ArrayList<>();
		while(rs.next()) {
			CustomerDto customerDto = new CustomerDto();
			customerDto.setCustomerNo(rs.getInt("customer_no"));
			customerDto.setCustomerId(rs.getString("customer_id"));
			customerDto.setCustomerPhone(rs.getString("customer_phone"));
			customerDto.setCustomerRegistDate(rs.getString("customer_regist"));
			customerDto.setCustomerPurchaseDate(rs.getString("customer_purchase"));
			customerDto.setCustomerMileage(rs.getInt("customer_mileage"));
			customerDto.setCustomerLevel(rs.getString("customer_level"));
			
			list.add(customerDto);
		}
		con.close();
		return list;
		
	}

}

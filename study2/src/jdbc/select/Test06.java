package jdbc.select;

import java.util.List;

import jdbc.beans.CustomerDao;
import jdbc.beans.CustomerDto;

public class Test06 {
	public static void main(String[] args) throws Exception {
		CustomerDao customerDao = new CustomerDao();
		List<CustomerDto> list = customerDao.selectList();
		
		for(CustomerDto customerDto : list) {
			System.out.println(customerDto);
		}
		
 	}
}

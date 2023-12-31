package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.CustomerDao;
import han.beans.CustomerDto;

@WebServlet(urlPatterns = "/customer/edit.kh")
public class CustomerEditServlet extends HttpServlet{
	@Override
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			CustomerDto customerDto = new CustomerDto();
			customerDto.setCustomerId(req.getParameter("customerId"));
			customerDto.setCustomerPhone(req.getParameter("customerPhone"));
			customerDto.setCustomerNo(Integer.parseInt(req.getParameter("customerNo")));
			
			CustomerDao customerDao = new CustomerDao();
			boolean success = customerDao.editCustomerProfile(customerDto);
			
			resp.setContentType("text/plain; charset = UTF-8");
			if(success) resp.getWriter().println("변경 완료");
			else resp.getWriter().println("입력하신 번호가 없습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}
}

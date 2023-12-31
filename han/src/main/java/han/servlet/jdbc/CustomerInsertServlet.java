package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.CustomerDao;
import han.beans.CustomerDto;

@WebServlet(urlPatterns = "/customer/insert.kh")
public class CustomerInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
				CustomerDto customerDto =new CustomerDto();
				customerDto.setCustomerId(req.getParameter("customerId"));
				customerDto.setCustomerPhone(req.getParameter("customerPhone"));
			
				CustomerDao customerDao = new CustomerDao();
				customerDao.insert(customerDto);
				
				resp.setContentType("text/plain; charset = utf-8");
				resp.getWriter().println("등록완료");
				
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}

}

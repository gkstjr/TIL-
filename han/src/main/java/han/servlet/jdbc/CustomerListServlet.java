package han.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.CustomerDao;
import han.beans.CustomerDto;

@WebServlet(urlPatterns = "/customer/list.kh")
public class CustomerListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				CustomerDao customerDao = new CustomerDao();
				List<CustomerDto> list	= customerDao.selectList();
				
				resp.setContentType("text/plain; charset = UTF-8");
				for(CustomerDto customerDto : list) {
					resp.getWriter().println(customerDto);
				}
				
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
	
	}
}

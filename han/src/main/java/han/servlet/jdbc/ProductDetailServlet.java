package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ProductDao;
import han.beans.ProductDto;

@WebServlet(urlPatterns = "/product/detail.kh")
public class ProductDetailServlet extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				int number = Integer.parseInt(req.getParameter("number"));
				
				
				ProductDao productDao = new ProductDao();
				ProductDto productDto = productDao.selectone(number);
				
				resp.setContentType("text/plain; charset=utf-8");
				boolean success = productDto!=null;
				if(success) {
					resp.getWriter().println(productDto);
				}else {
					resp.getWriter().println("결과가 없습니다.");
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
		
		
		}
}

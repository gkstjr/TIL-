package han.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ProductDao;
import han.beans.ProductDto;

@WebServlet(urlPatterns = "/product/list.kh")
public class ProductListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				ProductDao productDao = new ProductDao();
				List<ProductDto> list	= productDao.selectList();
				
				resp.setContentType("text/plain; charset=utf-8");
				for(ProductDto productDto : list) {
					
					resp.getWriter().println(productDto);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
			
	}
}

package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ProductDao;
import han.beans.ProductDto;

@WebServlet(urlPatterns = "/product/insert.kh")
public class ProductInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				try { 
				ProductDto productDto = new ProductDto();
				productDto.setNo(Integer.parseInt(req.getParameter("no")));
				productDto.setName(req.getParameter("name"));
				productDto.setType(req.getParameter("type"));
				productDto.setPrice(Integer.parseInt(req.getParameter("price")));
				productDto.setMade(req.getParameter("made"));
				productDto.setExpire(req.getParameter("expire"));
				
				ProductDao productDao = new ProductDao();
				productDao.insert(productDto);
				
			
						
				resp.setContentType("text/plain; charset=UTF-8");
				resp.getWriter().println("등록 완료");
					
					
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
					resp.sendError(500);
				}
	
		}
}

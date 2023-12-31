package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ProductDao;
import han.beans.ProductDto;

@WebServlet(urlPatterns = "/product/delete.kh")
public class ProductDeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ProductDto productDto = new ProductDto();
			
			 productDto.setNo(Integer.parseInt(req.getParameter("number")));
			ProductDao productDao = new ProductDao();
			boolean success = productDao.delete(productDto);
			
			resp.setContentType("text/plain; charset = utf-8");
			if(success){
				resp.getWriter().println("삭제성공");
			}else {
				resp.getWriter().println("주어진 번호가 없습니다");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	

}

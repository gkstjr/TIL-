package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ProductDao;
import han.beans.ProductDto;

@WebServlet(urlPatterns = "/product/edit.kh")
public class ProductEditSerlvet extends HttpServlet{
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
			boolean success = productDao.update(productDto);
			
			resp.setContentType("text/plain; charset = utf-8");
			if(success)resp.getWriter().println("변경완료");
			else resp.getWriter().println("입력하신 번호가 없습니다");
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}

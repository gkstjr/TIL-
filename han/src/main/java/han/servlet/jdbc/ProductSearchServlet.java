package han.servlet.jdbc;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ProductDao;
import han.beans.ProductDto;

@WebServlet(urlPatterns = "/product/search.kh")
public class ProductSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("name");
			String type = req.getParameter("type");
			
			boolean success = name!=null && type!=null;
			ProductDao productDao = new ProductDao();
			List<ProductDto> list; 
			if(success) {
				list = productDao.selectList(name, type);
			}else {
				list = Collections.EMPTY_LIST;
			}
			resp.setContentType("text/plain; charset = utf-8");
			if(list.isEmpty()) {
				resp.getWriter().println("검색결과가 없습니다.");
			}else {
					for(ProductDto productDto : list) {
						resp.getWriter().println(productDto);
					}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}

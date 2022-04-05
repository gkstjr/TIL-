package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.OlympicDao;

@WebServlet(urlPatterns = "/olympic/delete.kh")
public class OlympicDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String name =req.getParameter("name");
			
			OlympicDao olympicDao = new OlympicDao();
			boolean success = olympicDao.delete(name);
			
			//출력 - 사용자가 다른 페이지로 이동하도록 redirect 처리하는 코드
			resp.sendRedirect("list.jsp");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}
}

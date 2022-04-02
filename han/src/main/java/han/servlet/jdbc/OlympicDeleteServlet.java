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
			String name = req.getParameter("name");
			
			OlympicDao olympicDao = new OlympicDao();
			boolean success = olympicDao.delete(name);
			
			resp.setContentType("text/plain; charset=utf-8");
			if(success) resp.getWriter().println("삭제 완료");
			else resp.getWriter().println("입력한 국가가 없습니다");
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}
}

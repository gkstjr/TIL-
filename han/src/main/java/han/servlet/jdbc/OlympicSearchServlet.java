package han.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.OlympicDao;
import han.beans.OlympicDto;

@WebServlet(urlPatterns = "/olympic/search.kh")
public class OlympicSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("name");
			
			OlympicDao olympicDao = new OlympicDao();
			List<OlympicDto> list = olympicDao.selectList(name);
			
			resp.setContentType("text/plain; charset=UTF-8");
			for(OlympicDto olympicDto : list) {
				resp.getWriter().println(olympicDto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}

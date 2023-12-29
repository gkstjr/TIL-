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
@WebServlet(urlPatterns="/olympic/list.kh")
public class OlympicListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			OlympicDao olympicDao = new OlympicDao();
			List<OlympicDto> list = olympicDao.select();
			
			
			
			resp.setContentType("text/plain; charset = utf-8");
			for(OlympicDto olympicDto : list) {
				resp.getWriter().println(olympicDto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

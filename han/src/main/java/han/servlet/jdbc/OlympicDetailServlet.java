package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.OlympicDao;
import han.beans.OlympicDto;

@WebServlet(urlPatterns= "/olympic/detail1.kh")
public class OlympicDetailServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int rank = Integer.parseInt(req.getParameter("rank"));
			
			OlympicDao olympicDao = new OlympicDao();
			OlympicDto olympicDto = olympicDao.selectOne(rank);
			
			
			resp.setContentType("text/plain; charset=UTF-8");
			resp.getWriter().println(olympicDto.getRank());
			resp.getWriter().println(olympicDto.getName());
			resp.getWriter().println(olympicDto.getGold());
			resp.getWriter().println(olympicDto.getSilver());
			resp.getWriter().println(olympicDto.getBronze());
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

package han.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ScoreDao;
import han.beans.ScoreDto;

@WebServlet(urlPatterns = "/score/search.kh")
public class ScoreSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try { 
			String name = req.getParameter("name");
			
			ScoreDao scoreDao = new ScoreDao();
			List<ScoreDto> list = scoreDao.selectList(name);
			
			resp.setContentType("text/plain; charset = UTF-8");
			for(ScoreDto scoreDto : list) {
				resp.getWriter().println(scoreDto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
			
	}
}

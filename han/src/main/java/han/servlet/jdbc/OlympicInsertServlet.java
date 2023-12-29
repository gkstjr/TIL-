package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.OlympicDao;
import han.beans.OlympicDto;

@WebServlet(urlPatterns="/olympic/insert.kh")
public class OlympicInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				try {
					OlympicDto olympicDto = new OlympicDto();
					olympicDto.setRank(Integer.parseInt(req.getParameter("rank")));
					olympicDto.setName(req.getParameter("name"));
					olympicDto.setGold(Integer.parseInt(req.getParameter("gold")));
					olympicDto.setSilver(Integer.parseInt(req.getParameter("silver")));
					olympicDto.setBronze(Integer.parseInt(req.getParameter("bronze")));
					
					OlympicDao olympicDao = new OlympicDao();
					olympicDao.insert(olympicDto);
					
					resp.setContentType("text/plain; charset = utf-8");
					resp.getWriter().println("등록완료");
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
					resp.sendError(500);
				}
	
	
	}

}

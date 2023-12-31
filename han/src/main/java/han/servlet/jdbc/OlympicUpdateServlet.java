package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.OlympicDao;
import han.beans.OlympicDto;

@WebServlet(urlPatterns = "/olympic/update.kh")
public class OlympicUpdateServlet extends HttpServlet{
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
			
			boolean success = olympicDao.update(olympicDto);
			
			resp.setContentType("text/plain; charset = utf-8");
			if(success) resp.getWriter().println("변경완료");
			else resp.getWriter().println("입력하신 나라가 없습니다");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}

package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ScoreDao;
import han.beans.ScoreDto;

@WebServlet(urlPatterns = "/score/insert.kh")
public class ScoreInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setName(req.getParameter("name"));
			scoreDto.setKorean(Integer.parseInt(req.getParameter("korean")));
			scoreDto.setEnglish(Integer.parseInt(req.getParameter("english")));
			scoreDto.setMath(Integer.parseInt(req.getParameter("math")));
			
			ScoreDao scoreDao = new ScoreDao();
			scoreDao.insert(scoreDto);
			
			
			
			
			resp.setContentType("text/plain; charset = UTF-8");
			resp.getWriter().println("점수 정보 등록 완료");
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}

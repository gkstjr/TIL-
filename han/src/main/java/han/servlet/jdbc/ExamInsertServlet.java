package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ExamDao;
import han.beans.ExamDto;

@WebServlet(urlPatterns = "/exam/insert.kh")
public class ExamInsertServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				ExamDto examDto	 = new ExamDto();
				examDto.setStudent(req.getParameter("student"));
				examDto.setSubject(req.getParameter("subject"));
				examDto.setType(req.getParameter("type"));
				examDto.setScore(Integer.parseInt(req.getParameter("score")));
				
				
				ExamDao examDao = new ExamDao();
				examDao.insert(examDto);
				
				resp.setContentType("text/plain; charset = UTF-8");
				resp.getWriter().println("등록 정보완료");				
				
				
			}catch(Exception e ) {
				e.printStackTrace();
				resp.sendError(500);
			}

}
}

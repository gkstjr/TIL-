package han.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ExamDao;
import han.beans.ExamDto;

@WebServlet(urlPatterns="/exam/list.kh")
public class ExamListServlet extends HttpServlet{
 @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 	try {
	 		ExamDao examDao = new ExamDao();
	 		List<ExamDto> list = examDao.selectList();
	 		
	 		
	 		resp.setContentType("text/plain; charset=utf-8");
	 		for(ExamDto examDto :list) {
	 			resp.getWriter().println(examDto);
	 		}
	 		
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 		resp.sendError(500);
	 	}
 }
}

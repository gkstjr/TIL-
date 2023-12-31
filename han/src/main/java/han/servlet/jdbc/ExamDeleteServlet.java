package han.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.ExamDao;

@WebServlet(urlPatterns = "/exam/delete.kh")
public class ExamDeleteServlet  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int number = Integer.parseInt(req.getParameter("number"));
			
			ExamDao examDao = new ExamDao();
			boolean success = examDao.delete(number);
			
			resp.setContentType("text/plain; charset = utf-8");
			if(success) {
				resp.getWriter().println("삭제 성공");
			}else {
				resp.getWriter().println("주어진 번호가 없다.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	

}

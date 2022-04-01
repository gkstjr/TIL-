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

@WebServlet(urlPatterns = "/exam/search.kh")
public class ExamSearchServlet extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				
				String type = req.getParameter("type");
				String keyword = req.getParameter("keyword");
				boolean isSearch = type!= null && keyword !=null;
				ExamDao examDao = new ExamDao();
				List<ExamDto> list;
				if(isSearch) {
					 list = examDao.selectList(type, keyword);
					
				}else {
					 list	=examDao.selectList();
				}
				resp.setContentType("text/plain; charset=utf-8");

				
				if(list.isEmpty()) {
					resp.getWriter().println("검색 결과가 없습니다.");
				}else {
					for(ExamDto examDto :list) {
						resp.getWriter().println(examDto);
					}
				}
				
				
				
				
			}catch(Exception e) {
				resp.sendError(500);
				e.printStackTrace();
			}
		
		}
}

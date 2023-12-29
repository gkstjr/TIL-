package han.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.BoardDao;
import han.beans.ReplyDao;
import han.beans.ReplyDto;

@WebServlet(urlPatterns = "/board/reply_write.kh")
public class ReplyWriteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ReplyDto replyDto = new ReplyDto();
			replyDto.setReplyContent(req.getParameter("replyContent"));
			replyDto.setReplyTarget(Integer.parseInt(req.getParameter("replyTarget")));
			replyDto.setReplyWriter((String) req.getSession().getAttribute("login"));
			
			ReplyDao replyDao = new ReplyDao();
			replyDao.insert(replyDto);
			
			BoardDao boardDao = new BoardDao();
			boardDao.updateReplycount(replyDto.getReplyTarget());
			
			resp.sendRedirect("detail.jsp?boardNo="+replyDto.getReplyTarget());
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
	}
		}
	
}

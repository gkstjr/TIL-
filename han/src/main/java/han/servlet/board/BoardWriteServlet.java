package han.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.BoardDao;
import han.beans.BoardDto;

@WebServlet(urlPatterns = "/board/write.kh")
public class BoardWriteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			BoardDto boardDto = new BoardDto();
			boardDto.setBoardHead(req.getParameter("boardHead"));
			boardDto.setBoardTitle(req.getParameter("boardTitle"));
			boardDto.setBoardContent(req.getParameter("boardContent"));
			boardDto.setBoardWriter((String)req.getSession().getAttribute("login"));
//			처리
			BoardDao boardDao = new BoardDao();
			boardDto.setBoardNo(boardDao.getSequence());
			boardDao.insert(boardDto);
			
			resp.sendRedirect("detail.jsp?boardNo="+boardDto.getBoardNo());
		
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	
	
	}
}

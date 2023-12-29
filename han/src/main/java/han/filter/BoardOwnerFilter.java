package han.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.BoardDao;
import han.beans.BoardDto;

@WebFilter(filterName = "f3",urlPatterns = {
		"/board/edit.jps","/board/edit.kh",
		"/board/delete.kh"
		
		
})
public class BoardOwnerFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse resp = (HttpServletResponse)response;
			try {
//				[1]관리자인지 확인하기
				String memberGrade = (String)req.getSession().getAttribute("auth");
				if(memberGrade != null && memberGrade.equals("관리자")) {
					chain.doFilter(request, response);
					return;
				}
				
//				[2] 직상지 본인인지 확인하기
				String memberId= (String)req.getSession().getAttribute("login");
				int boardNo = Integer.parseInt(req.getParameter("boardNo"));
				
				BoardDao boardDao	 = new BoardDao();
				BoardDto boardDto	= boardDao.selectOne(boardNo);
				if(memberId!= null && memberId.equals(boardDto.getBoardWriter())) {
					chain.doFilter(request, response);
				}else {
//					권한 에러 숫자 403
					resp.sendError(403);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
	}

}

package han.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.MemberDao;
import han.beans.MemberDto;

@WebServlet(urlPatterns = "/member/login.kh")
public class MemberLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String memberId = req.getParameter("memberId");
			String memberPw = req.getParameter("memberPw");
			
			//처리
			MemberDao memberDao = new MemberDao();
			MemberDto memberDto = memberDao.selectOne(memberId);
		
			boolean isLogin = memberDto != null && memberDto.getMemberPw().equals(memberPw);
			
			if(isLogin) {
				//최종 로그인 시각 변경 처리
				memberDao.updateLogindate(memberId);
				//세션에 login이라는 이름으로 사용자의 아이디를 저장해야한다 -->로그인 처리
				req.getSession().setAttribute("login", memberId);
				req.getSession().setAttribute("auth", memberDto.getMemberGrade());
				resp.sendRedirect(req.getContextPath());
			}else {
				resp.sendRedirect("login.jsp?error");
			}
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}

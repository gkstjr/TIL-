package han.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.MemberDao;
import han.beans.MemberDto;

@WebServlet(urlPatterns = "/member/exit.kh")
public class MemberExitServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
					req.setCharacterEncoding("UTF-8");
					String memberId = (String)req.getSession().getAttribute("login");
					String memberPw = req.getParameter("memberPw");
					
					//처리
					MemberDao memberDao = new MemberDao();
					MemberDto memberDto = memberDao.selectOne(memberId);
					boolean isPasswordCorrect = memberPw != null && memberPw.equals(memberDto.getMemberPw());
					if(!isPasswordCorrect) {
						resp.sendRedirect("exit.jsp?error");
						return;
					}
					memberDao.delete(memberId);
					req.getSession().removeAttribute("login");
					
					resp.sendRedirect("exit_finish.jsp");
			}catch(Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
	}
}

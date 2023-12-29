package han.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.MemberDao;
import han.beans.MemberDto;

@WebServlet(urlPatterns = "/member/password.kh")
public class MemberPasswordServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			req.setCharacterEncoding("UTF-8");
			String currentPw = req.getParameter("currentPw");
			String changePw = req.getParameter("changePw");
			
			String memberId = (String) req.getSession().getAttribute("login");
			
			//처리
			//1 기존 비밀번호와 변경할 비밀번호가 일치하는지 검사
			boolean isSamePassword = currentPw == null || changePw==null|| currentPw.equals(changePw);
			if(isSamePassword) {
				resp.sendRedirect("password.jsp?error=1");
				return;
			}
			//2. 현재 비밀번호가 일치하는지 검사
			MemberDao memberDao = new MemberDao();
			MemberDto memberDto = memberDao.selectOne(memberId);
			
			boolean isCorrectPassword = currentPw.equals(memberDto.getMemberPw());
			if(!isCorrectPassword) {
				resp.sendRedirect("password.jsp?error=2");
				return;
			}
			//3. 변경할 비밀번호가 적합한 형식인지 검사(생략)
			//4. 비밀번호 변경 
			memberDao.changePassword(memberId,changePw);
			
			//출력
			resp.sendRedirect("mypage.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

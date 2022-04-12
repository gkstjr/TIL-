package han.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.MemberDao;
import han.beans.MemberDto;

@WebServlet(urlPatterns = "/member/find_id.kh")
public class MemberFindIdServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberNick(req.getParameter("memberNick"));
			memberDto.setMemberPhone(req.getParameter("memberPhone"));
			memberDto.setMemberBirth(req.getParameter("memberBirth"));
		
			MemberDao memberDao = new MemberDao();
			String memberId = memberDao.findId(memberDto);
			
			if(memberId == null) {
				resp.sendRedirect("find_id.jsp?error");
			}else {
				resp.sendRedirect("find_id_result.jsp?memberId=" +memberId);
			}
		 }catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

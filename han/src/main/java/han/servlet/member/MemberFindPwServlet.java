package han.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.MemberDao;
import han.beans.MemberDto;

@WebServlet(urlPatterns = "/member/find_pw.kh")
public class MemberFindPwServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			req.setCharacterEncoding("UTF-8");
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(req.getParameter("memberId"));
			memberDto.setMemberNick(req.getParameter("memberNick"));
			memberDto.setMemberPhone(req.getParameter("memberPhone"));
			memberDto.setMemberBirth(req.getParameter("memberBirth"));
			
			//처리
			MemberDao memberDao = new MemberDao();
			MemberDto findDto = memberDao.findPw(memberDto);
		
			//출력
			if(findDto!=null) {
				resp.sendRedirect("set_pw.jsp?memberId="+findDto.getMemberId());
			}else {
				resp.sendRedirect("find_pw.jsp?error");
			}
		}catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		
			// TODO: handle exception
		}
	
	
	}

}

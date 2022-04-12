package han.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import han.beans.MemberDao;
import han.beans.MemberDto;

@WebServlet(urlPatterns = "/member/information.kh")
public class MemberInformationServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				req.setCharacterEncoding("UTF-8");
				
				MemberDto memberDto = new MemberDto();
				
				memberDto.setMemberId((String) req.getSession().getAttribute("login"));
				
				memberDto.setMemberNick(req.getParameter("memberNick"));
				memberDto.setMemberBirth(req.getParameter("memberBirth"));
				memberDto.setMemberPhone(req.getParameter("memberPhone"));
				memberDto.setMemberEmail(req.getParameter("memberEmail"));
				memberDto.setMemberPost(req.getParameter("memberPost"));
				memberDto.setMemberBasicAddress(req.getParameter("memberBasicAddress"));
				memberDto.setMemberDetailAddress(req.getParameter("memberDetailAddress"));
				memberDto.setMemberPw(req.getParameter("memberPw"));
				
				//처리
				MemberDao memberDao = new MemberDao();
				
				MemberDto findDto = memberDao.selectOne(memberDto.getMemberId());
				boolean isPasswordCorrect = memberDto.getMemberPw().equals(findDto.getMemberPw());
			
				if(!isPasswordCorrect) {
					resp.sendRedirect("information.jsp?error");
					return;
				}
				
				memberDao.changeInformation(memberDto);
				
				resp.sendRedirect("mypage.jsp");
			}catch (Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
	
	}
}

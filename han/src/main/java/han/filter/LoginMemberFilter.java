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

@WebFilter(filterName = "f2",urlPatterns = {
		"/score/*",
		"/member/mypage.jsp",
		"/member/password.jsp","/member/password.kh",
		"/member/information.jsp","/member/information.kh",
		"/member/exit.jsp","/member/exit.kh",
		"/board/edit.jsp","/board/edit.kh",
		"/board/write.jsp","/board/write.kh",
		"/board/delete.kh"

})
public class LoginMemberFilter implements Filter{
@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse resp = (HttpServletResponse)response;
			
			try {
				String memberId = (String)req.getSession().getAttribute("login");
				
				if(memberId == null) {
					resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
				
				}else {
					chain.doFilter(request, response);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				resp.sendError(500);
			}
	
}
}

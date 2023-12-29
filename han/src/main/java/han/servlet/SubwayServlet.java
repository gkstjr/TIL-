package han.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/subway.kh")
public class SubwayServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int age = Integer.parseInt(req.getParameter("age"));
		//		준비
//		처리
		int fare;
		if(age>=65|| age<8) {
			fare = 0;
		}else if(age >=20) {
			fare =1250;
		}else {
			fare= 450;
		}
//		출력
		resp.setContentType("text/plain; charset = utf-8");
		resp.getWriter().println("요금 : " + fare);
		}

}

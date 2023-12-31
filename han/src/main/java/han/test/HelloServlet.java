package han.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
  서블릿(Servlet)
  	-접속이 가능한 자바 파일
  	-접속이 되려면 주소가 있어야 한다
  	-접속이 되려면 자격도 있어야 한다(HttpServlet 상속)
  	-접속 시 사용자가 가져갈 데이터에 대한 코드가 작성될 수 있는 메소드가 필요하다
  			-service라는 이름의 메소드를 재정의한다.
  	실제 위치
  	http://localhost:8080/study/src/main/java/study/test/HelloServlet.java
  	
  	http://localhost:8080/study/goHello
 */
@WebServlet("/goHello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req : 요청정보가 담긴 객체 , resp : 응답정보가 담길 객체
		try {
			
		resp.setContentType("text/plain; charset = UTF8");
		
		resp.getWriter().println("성장하는 개발자 김한석");
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	






}

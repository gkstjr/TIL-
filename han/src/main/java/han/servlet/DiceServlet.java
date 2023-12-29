package han.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dice.kh")
public class DiceServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random r = new Random();
		int dice = r.nextInt(6)+1;
		
		resp.setContentType("text/plain; charset=UTF-8");
		resp.getWriter().println("주사위 결과 = " + dice);
	}
}

package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class InputServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디 : "+user_id);
		System.out.println("password : "+user_pw);
		String[] subject = request.getParameterValues("subject");
		for(String str: subject) {
			System.out.println("선택한 과목: "+str);
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy call");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init call");
	}
	
}

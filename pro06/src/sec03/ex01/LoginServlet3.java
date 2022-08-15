package sec03.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet{
	public static void main(String[] args) {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디   : " + user_id);
		System.out.println("비밀번호 : " + user_pw);

//		String data = "<html>";
//		data += "<body>";
//		data += "아이디 : " + id;
//		data += "<br>";
//		data += "비밀번호 : " + pw;
//		data += "<br>";
//		data += "주소 : " + address;
//		data += "</html>";
//		data += "</body>";
//		out.print(data);
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

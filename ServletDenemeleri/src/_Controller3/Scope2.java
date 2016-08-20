package _Controller3;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/scope2")
public class Scope2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext context2 = getServletContext();
		Object value = context2.getAttribute("Int");
		System.out.println(value);
		Object valueStr = context2.getAttribute("NameString");
		System.out.println(valueStr);
		Object man = context2.getAttribute("Erkek Listesi");
		System.out.println(man);
	}
}

package _Controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class Context extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		String value = context.getInitParameter("ContextName");
		System.out.println("Döngüsüzz alýnan = " + value);
		Enumeration<String> contextNames = context.getInitParameterNames();
		while (contextNames.hasMoreElements()) {
			String name = (String) contextNames.nextElement();
			System.out.println("Context-Ad = " + name);
			System.out.println("Context-Deger = "
					+ context.getInitParameter(name));

		}
	}
}

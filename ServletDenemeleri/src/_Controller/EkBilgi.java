package _Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= { "/hello", "/hello2", "/hello3" }, initParams = @WebInitParam(name = "Name", value = "Value"))
public class EkBilgi extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("Hello Annotation!\n");

		ServletConfig config = getServletConfig();
		String val = config.getInitParameter("Name");
		out.print(val);
	}
}

package _Controller2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/encoding")
public class Encoding  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	resp.setCharacterEncoding("ISO-8859-9");
	PrintWriter out = resp.getWriter();
	out.print("<html><head><meta charset = ISO-8859-9/></head><body>þiöçðasd</body></html>");
}
}

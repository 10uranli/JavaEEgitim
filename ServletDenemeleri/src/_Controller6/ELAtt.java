package _Controller6;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/express")
public class ELAtt extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("name", "Request Scope Value");
		req.getSession().setAttribute("name", "Session Scope Value");
		req.getServletContext().setAttribute("name",
				"Context-Application Scope Value");

		Cookie cookie = new Cookie("cookieName", "cookieValue");
		resp.addCookie(cookie);

		ServletContext context = getServletContext();
		req.getRequestDispatcher("/express.jsp").forward(req, resp);
	}
}

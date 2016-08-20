package _Controller2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String ad = req.getParameter("ad");
		String cinsiyet = req.getParameter("cinsiyet");
		String takim = req.getParameter("takim");// Tek parametre döner
		// Checkbox birden fazla dönen deðer var.
		String checkBox[] = req.getParameterValues("check");
		PrintWriter out = resp.getWriter();
		out.print("Adi = " + ad + " cinsiyeti = " + cinsiyet + " takimi = "
				+ takim);
		for (String check : checkBox) {
			out.print(" Check = " + check);
		}

	}
}

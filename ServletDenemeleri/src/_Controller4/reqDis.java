package _Controller4;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _Controlle.Mekan;
@WebServlet("/reqSco")
public class reqDis  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			Mekan mekan = new Mekan();
			mekan.setMekanAd("KarsVegas");
			mekan.setMekanAdres("Kars");
			mekan.setMekanId(36);
			req.setAttribute("Mekanlar", mekan);
			req.getRequestDispatcher("/mekan.jsp").forward(req, resp);
}
}

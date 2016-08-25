package _Controller5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemleketServlet")
public class MemleketServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Memleket sehir = new Memleket(36, "Kars");
		Il_Bilgisi bilgi = new Il_Bilgisi("Dogu", "Peynir", sehir);
		req.setAttribute("sehirReq", bilgi);
		RequestDispatcher disp = req.getRequestDispatcher("/memleket.jsp");
		disp.forward(req, resp);

	}

}

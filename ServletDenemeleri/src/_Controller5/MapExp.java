package _Controller5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MapExp")
public class MapExp extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		HashMap<String, String> iller = new HashMap<>();
		iller.put("kars","36");
		iller.put("izmir","35");
		iller.put("istanbul","34");
		req.setAttribute("illerReq", iller);
		RequestDispatcher disp = req.getRequestDispatcher("WEB-INF/iller.jsp");
		disp.forward(req, resp);
}

}

package _Controller5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/koseli")
public class köseliOp extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		String iller[] = {"Kars","istanbul","Samsun","izmir"};
		req.setAttribute("ilArray", iller);
		
		Map<String, String> illerMap = new HashMap<String, String>();
		illerMap.put("Kars", "36");
		illerMap.put("izmir", "35");
		
		req.setAttribute("ilMap", illerMap);
		req.setAttribute("evaluate", "izmir");
		
		req.getRequestDispatcher("/köseli.jsp").forward(req, resp);
	
}
}

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setHeader")
public class setHeader extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	resp.setHeader("name", "value");
	resp.setHeader("name", "value2");
	resp.addHeader("test", "test..");
	resp.addHeader("test","test2..");
	resp.setIntHeader("Sayýsal", 2016);
	resp.addDateHeader("Zaman", System.currentTimeMillis());
}
}

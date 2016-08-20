package _Controller2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestDevam extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String hostName = req.getHeader("host");
		System.out.println("Host Name : " + hostName);
		System.out.println("***************");
		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			System.out.println(headerName + " : " + req.getHeader(headerName));
		}
		System.out.println("************");
		String path = req.getServletPath();
         int port = req.getServerPort();
         System.out.println("Path:" + path);
         System.out.println("Port:"  + port);
		
	}
}

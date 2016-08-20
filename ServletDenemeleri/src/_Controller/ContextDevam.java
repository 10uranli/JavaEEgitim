package _Controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Read")
public class ContextDevam extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	ServletContext context = getServletContext();
	String yol  = context.getContextPath();
	System.out.println(yol);
	
	InputStream ýnputStream = context.getResourceAsStream("/WEB-INF/Text/deneme.txt");
	ServletOutputStream out = resp.getOutputStream();
	int a ;
	 	while ((a= ýnputStream.read()) != -1) {
			System.out.println((char)a);
			out.write(a);
		
		}
}
}

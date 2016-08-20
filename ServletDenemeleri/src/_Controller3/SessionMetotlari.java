package _Controller3;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sesMetot")
public class SessionMetotlari extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		int Time = session.getMaxInactiveInterval();
		System.out.println("Tomcat Varsayýlan Session ömrü : " + Time);
		
		long sonGiris = session.getLastAccessedTime();
		Date dateLast = new Date(sonGiris);
		System.out.println(dateLast);
		
		long olusturma = session.getCreationTime();
		Date dateCreate = new Date(olusturma);
		System.out.println(dateCreate);
		
		session.setMaxInactiveInterval(5);
		session.setAttribute("Deneme","Deneme");
		
	}
}

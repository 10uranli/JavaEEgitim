package _Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class LifeCy extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
System.out.println("Do gett çalýþýr.");
	}

	public LifeCy() {
		System.out.println("Yapýlandýrýcý çalýþýyor..");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Ýnit çalýþýyor..Artýk servlet oldu");
	}

	@Override
	public void destroy() {
		System.out.println("Siliniyorr...");
	}
}

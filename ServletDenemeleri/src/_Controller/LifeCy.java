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
System.out.println("Do gett �al���r.");
	}

	public LifeCy() {
		System.out.println("Yap�land�r�c� �al���yor..");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("�nit �al���yor..Art�k servlet oldu");
	}

	@Override
	public void destroy() {
		System.out.println("Siliniyorr...");
	}
}

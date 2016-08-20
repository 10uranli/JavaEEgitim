package _Controller3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/scope")
public class Scope extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		ServletContext context = getServletContext();
		ArrayList<String> array = new ArrayList();
		array.add("Ali");
		array.add("Veli");
		context.setAttribute("Int", 5);
		context.setAttribute("NameString", "String");
		context.setAttribute("Erkek Listesi", array);
	

	}
}

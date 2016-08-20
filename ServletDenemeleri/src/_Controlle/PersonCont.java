package _Controlle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _Model.PersonModel;
@WebServlet("/Person")
public class PersonCont extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		PersonModel person = new PersonModel("Onur", "Anli");
		PersonModel person2 = new PersonModel("Utku", "Küçük");
		ArrayList<PersonModel> people = new ArrayList();
		people.add(person);
		people.add(person2);
		req.setAttribute("People", people);
		RequestDispatcher disp = req.getRequestDispatcher("/hello.jsp");
		disp.forward(req, resp);
	
		
}
}

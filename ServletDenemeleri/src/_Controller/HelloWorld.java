package _Controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		
		String ParamValue = config.getInitParameter("Param1");
		System.out.println("ParamValue = " + ParamValue);
		
		String ServletName = config.getServletName();
		System.out.println("ServletName = " + ServletName);
		
		Enumeration<String> ConfigNames = config.getInitParameterNames();
		while (ConfigNames.hasMoreElements()) {
			String ConfigName = (String) ConfigNames.nextElement();
			System.out.println("Name = " + ConfigName);
			System.out.println("Value = " + config.getInitParameter(ConfigName));
		}
	}

}

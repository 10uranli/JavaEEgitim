package _Controller2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie")
public class CookieDeneme extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	Cookie cook = new Cookie("CookieName", "CookieValue");
	cook.setMaxAge(5);
	resp.addCookie(cook);

	resp.addHeader("Set-Cookie", "CookieName2=CookieValue2");
	
	
	
	Cookie[] cookies = req.getCookies();
	for(Cookie cookie : cookies){
		System.out.println("Cookie adý = " + cookie.getName() + "   cookie deðeri = " + cookie.getValue());
	}
}
}

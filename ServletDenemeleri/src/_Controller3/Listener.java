package _Controller3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class Listener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	System.out.println("İmha ediliyorummmmmm" + arg0.getServletContext());
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Oluşturuluyorumm"+arg0.getServletContext()); 
		
	}

}

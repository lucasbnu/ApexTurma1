package pacote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class mensagem extends HttpServlet {
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	  PrintWriter etr = resp.getWriter();
	  etr.println("<html>");
	  etr.println("<head>");
	  etr.println("<title>Document</title>");
	  etr.println("</head>");
	  etr.println("<body>");
	  etr.println("<h1>Utilizando serverlets na Apex!</h1>");
	  etr.println("</body>");
	  etr.println("</html>");
   }
}

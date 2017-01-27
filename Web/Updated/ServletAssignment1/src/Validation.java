
import javax.servlet.*;

import java.io.*;

import javax.servlet.http.*;

 public class Validation extends HttpServlet {
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	  {
	     	  response.setContentType("text/html");
			  PrintWriter out = response.getWriter();	 
			  out.print("<html><head><body>");
			  out.print("<h3 style=\"color:green\">Information is submitted successfully1!!! </h3>");
			  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
			  requstDispatcher.include(request, response);
			  out.print("</html></body>"); 
	  }
 }

import javax.servlet.*;

import java.io.*;

import javax.servlet.http.*;

 public class Registration1 extends HttpServlet {
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	  {
	     	  response.setContentType("text/html");
			  PrintWriter out = response.getWriter();
			  
			  String firstname = request.getParameter("firstname");
			  String lastname = request.getParameter("lastname");
			  String password = request.getParameter("password");
			  String password1 = request.getParameter("password1");
			  String age = request.getParameter("age");
			  String state = request.getParameter("state");
			  String city = request.getParameter("city");
			  String address = request.getParameter("address");
			  out.print("<html><head><body>");
			  if(firstname.length()==0){
				  out.print("<h3 style=\"color:red\">First Name is  invalid!!! </h3>"); 
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  }
			  else if(lastname.length()==0){
				  out.print("<h3 style=\"color:red\">Last Name is  invalid!!! </h3>"); 
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  }
			  else if(password.length() < 8 ){
				  out.print("<h3 style=\"color:red\">Password Should be contained minimum 8 charecter!!! </h3>");
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  }
			  else if(!password.equals(password1)){
				  out.print("<h3 style=\"color:red\">re-enter password mismatch!!! </h3>");
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  }
			  else if(age.length() == 0 && Integer.parseInt(age)>= 0 && Integer.parseInt(age)<200){
				  out.print("<h3 style=\"color:red\">Age is  invalid!!! </h3>");  
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  } 
			  else if(state.length()==0){
				  out.print("<h3 style=\"color:red\">State is  invalid!!! </h3>"); 
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  }
			  else if(city.length()==0){
				  out.print("<h3 style=\"color:red\">City is  invalid!!! </h3>"); 
				  RequestDispatcher requstDispatcher = request.getRequestDispatcher("registration.html");
				  requstDispatcher.include(request, response);
			  }
			 else 
			 {
				 RequestDispatcher requstDispatcher = request.getRequestDispatcher("validation");
				 requstDispatcher.forward(request, response);
			  }
			  out.print("</html></body>"); 
	  }
 }
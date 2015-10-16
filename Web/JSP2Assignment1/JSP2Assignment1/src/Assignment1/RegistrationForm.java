package Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean flag = true;
		PrintWriter out = response.getWriter();
		
		String error="";
		if(request.getParameter("firstName") == "")
		{  
			error="First Name not entered<br>";
			flag=false;
		} 
		
		else if(request.getParameter("lastName")== "") 
		{
			error="Last Name not entered<br>";
		    flag=false;
		}
		else if(request.getParameter("password")== "") 
		{
			error="Password not entered<br>";
		    flag=false;
		}
		
		else if(request.getParameter("password").length() < 8 )
		{
			error="Password Length should be greater than 8 <br>";
		     flag=false;
		}
		
		else if(!request.getParameter("password").equalsIgnoreCase(request.getParameter("confirmPassword"))) 
		{  
			error="Password doesn't match<br>";
			flag=false;
		}
		
		else if(request.getParameter("states") == "")
		{ 
			error="State is not entered<br>";
			flag=false;
		}else if(request.getParameter("cities") == "") { 
			error="Cities is not entered<br>";
			flag=false;
		}
		else if(request.getParameter("address") == "")
		{
			error="Address is not entered<br>";
			flag=false;
		}
		else if( request.getParameter("age") == "")
		{
			error="Age is not entered<br>";
		   flag=false;	
		}
		 if(flag){
			
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String password = request.getParameter("password");
				String userName = firstName+lastName;
				String id = firstName+"."+lastName+"@metacube.com";
				boolean isInserted = DBHelper.addInformation(userName,id,password);
				if(!isInserted) {
					out.print("Registration Successfull:::");
			
		}
		}
				else{
					
			request.setAttribute("msg",error );
	    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("error.jsp");  
	        requestDispatcher.forward(request, response);  
		}
	
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
			
	}


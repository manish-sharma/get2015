package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * this class is used to validate the html page
 * @author Ankur
 */


public class RegistrationForm extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		String result = "";
		boolean flag=true;
		response.setContentType("text/html");
		printWriter.println("This is servlet page.<br>");
		if(request.getParameter("firstName") == "")
		{
			result += "First Name not entered<br>";
			flag=false;
		} 
		
		if(request.getParameter("lastName")== "") 
		{
			result += "Last Name not entered<br>";
		    flag=false;
		}
		
		if(request.getParameter("password").length() < 8 )
		{
			result += "Password Length should be greater than 8 <br>";
		     flag=false;
		}
		
		if(!request.getParameter("password").equalsIgnoreCase(request.getParameter("confirmPassword"))) 
		{  
			result += "Password doesn't match<br>";
			flag=false;
		}
		
		if(request.getParameter("states")=="")
		{ 
			result += "State is not entered<br>";
			flag=false;
		}
		if(request.getParameter("cities")=="") 
		{ 
			result += "Cities is not entered<br>";
			flag=false;
		}
		if(request.getParameter("address")=="")
		{
			result += "Address is not entered<br>";
			flag=false;
		}
	   if( request.getParameter("age")=="")
		{
		   result += "Age is not entered<br>";
		   flag=false;	
		}
		if(flag==true){
			result += "Form is validated at server side<br>";
		}
		request.setAttribute("result", result);
		RequestDispatcher requestDispacher = request.getRequestDispatcher("ValidationCheck");
		requestDispacher.forward(request, response);
	}
}	

package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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

	/**
	 * this method validating the html page
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		boolean flag=true;
		response.setContentType("text/html");
		printWriter.println("This is servlet page.<br>");
		if(request.getParameter("firstName") == "")
		{
			printWriter.println("First Name not entered<br>");
			flag=false;
		} 
		
		if(request.getParameter("lastName")== "") 
		{
			printWriter.println("Last Name not entered<br>");
		    flag=false;
		}
		
		if(request.getParameter("password").length() < 8 )
		{
			printWriter.println("Password Length should be greater than 8 <br>");
		     flag=false;
		}
		
		if(!request.getParameter("password").equalsIgnoreCase(request.getParameter("confirmPassword"))) 
		{  
			printWriter.println("Password doesn't match<br>");
			flag=false;
		}
		
		if(request.getParameter("states")=="")
		{ 
			printWriter.println("State is not entered<br>");
			flag=false;
		}
		if(request.getParameter("cities")=="") 
		{ 
			printWriter.println("Cities is not entered<br>");
			flag=false;
		}
		if(request.getParameter("address")=="")
		{
			printWriter.println("Address is not entered<br>");
			flag=false;
		}
	   if( request.getParameter("age")=="")
		{
		   printWriter.println("Age is not entered<br>");
		   flag=false;	
		}
		if(flag==true){
				printWriter.println("Form is validated at server side<br>");
		        RequestDispatcher requestdDispatcher = request.getRequestDispatcher("/");  
		        requestdDispatcher.forward(request, response);  
		}
	}
}	

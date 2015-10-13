package com.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationForm
 */
//@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		boolean flag=true;
		response.setContentType("text/html");
		pw.println("This is servlet page.<br>");
		if(request.getParameter("firstname")==""){
			pw.println("First Name not entered<br>");
			flag=false;
		}
		else if(request.getParameter("lastname")==""){
			pw.println("Last Name not entered<br>");
		    flag=false;	
		}
		else if(request.getParameter("password").length() < 8 )	{
			pw.println("Password Length should be greater than 8 <br>");
		     flag=false;
		}
		
		if(!request.getParameter("password").equalsIgnoreCase(request.getParameter("confirmPassword"))) 
		{  
			pw.println("Password doesn't match<br>");
			flag=false;
		}
		
		if(request.getParameter("states")=="")
		{ 
			pw.println("State is not entered<br>");
			flag=false;
		}
		if(request.getParameter("cities")=="") 
		{ 
			pw.println("Cities is not entered<br>");
			flag=false;
		}
		if(request.getParameter("address")=="")
		{
			pw.println("Address is not entered<br>");
			flag=false;
		}
	   if( request.getParameter("age")=="")
		{
		   pw.println("Age is not entered<br>");
		   flag=false;	
		}
		if(flag==true){
				pw.println("Form is validated at server side<br>");
		      
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Name: Registration
 * @author Gaurav Saini
 * Since: 12 October,2015
 * Description: Registration validation
 **/

public class RegistrationForm extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		boolean flag=true;
		res.setContentType("text/html");
		// Validation of FirstName
		if(req.getParameter("firstName") == "")
		{
			pw.println("First Name not entered<br>");
			flag=false;
		} 
		// Validation of Second Name
		if(req.getParameter("lastName")== "") 
		{
			pw.println("Last Name not entered<br>");
			flag=false;
		}
		//Password length
		if(req.getParameter("password").length() < 8 )
		{
			pw.println("Password Length should be greater than 8 <br>");
			flag=false;
		}
		if(!req.getParameter("password").equalsIgnoreCase(req.getParameter("confirmPassword"))) 
		{  
			pw.println("Password doesn't match<br>");
			flag=false;
		}
		// States validation
		if(req.getParameter("states")=="")
		{ 
			pw.println("State is not entered<br>");
			flag=false;
		}
		// Cities validation
		if(req.getParameter("cities")=="") 
		{ 
			pw.println("City is not entered<br>");
			flag=false;
		}
		// Address Validation
		if(req.getParameter("address")=="")
		{
			pw.println("Address is not entered<br>");
			flag=false;
		}
		// Age Length
		if( req.getParameter("age")=="")
		{
			pw.println("Age is not entered<br>");
			flag=false;	
		}
		// Checking for validation
		if(flag==true){
			pw.println("Form is validated at server side<br>");
		}
	}
}	
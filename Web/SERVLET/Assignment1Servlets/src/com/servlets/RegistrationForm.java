package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegistrationForm extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		boolean flag=true;
		pw.println("This is servlet page. ");
		if(req.getParameter("firstName") == "")
		{
			pw.println("First Name not entered");
			flag=false;
		} 
		
		if(req.getParameter("lastName")== "") 
		{
			pw.println("Last Name not entered ");
		    flag=false;
		}
		
		if(req.getParameter("password").length() < 8 )
		{
			pw.println("Password Length should be greater than 8  ");
		     flag=false;
		}
		
		if(!req.getParameter("password").equalsIgnoreCase(req.getParameter("confirmPassword"))) 
		{  
			pw.println("Password doesn't match ");
			flag=false;
		}
		
		if(req.getParameter("states")=="")
		{ 
			pw.println("State is not entered ");
			flag=false;
		}
		if(req.getParameter("cities")=="") 
		{ 
			pw.println("Cities is not entered ");
			flag=false;
		}
		if(req.getParameter("address")=="")
		{
			pw.println("Address is not entered ");
			flag=false;
		}
	   if( req.getParameter("age")=="")
		{
		   pw.println("Age is not entered ");
		   flag=false;	
		}
		if(flag==true){
				pw.println("Form is validated at server side ");
		      
		}
	}
}	

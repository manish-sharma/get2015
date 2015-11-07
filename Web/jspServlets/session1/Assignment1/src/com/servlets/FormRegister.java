package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormRegister extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
		PrintWriter pw = res.getWriter();
		boolean flag=true;
		res.setContentType("text/html");
		pw.println("This is servlet page.<br>");
		if(req.getParameter("firstname") == "")
		{
			pw.println("First Name not entered<br>");
			flag=false;
		} 
		
		if(req.getParameter("lastname")== "") 
		{
			pw.println("Last Name not entered<br>");
		    flag=false;
		}
		
		if(req.getParameter("password").length() < 8 )
		{
			pw.println("Password Length should be greater than 8 <br>");
		     flag=false;
		}
		
		if(!req.getParameter("password").equalsIgnoreCase(req.getParameter("confirm-password"))) 
		{  
			pw.println("Password doesn't match<br>");
			flag=false;
		}
		
		if(req.getParameter("state")=="")
		{ 
			pw.println("State is not entered<br>");
			flag=false;
		}
		if(req.getParameter("city")=="") 
		{ 
			pw.println("Cities is not entered<br>");
			flag=false;
		}
		if(req.getParameter("address")=="")
		{
			pw.println("Address is not entered<br>");
			flag=false;
		}
	   if( req.getParameter("age")=="")
		{
		   pw.println("Age is not entered<br>");
		   flag=false;	
		}
		if(flag==true){
			pw.println("Form is validated at server side<br>");
		}
	}
}	

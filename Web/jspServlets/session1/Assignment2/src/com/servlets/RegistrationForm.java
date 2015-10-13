package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegistrationForm extends HttpServlet {



	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		String result = "";
		boolean flag=true;
		res.setContentType("text/html");
		pw.println("This is servlet page.<br>");
		if(req.getParameter("firstname") == "")
		{
			result += "First Name not entered<br>";
			flag=false;
		} 
		
		if(req.getParameter("lastname")== "") 
		{
			result += "Last Name not entered<br>";
		    flag=false;
		}
		
		if(req.getParameter("password").length() < 8 )
		{
			result += "Password Length should be greater than 8 <br>";
		     flag=false;
		}
		
		if(!req.getParameter("password").equalsIgnoreCase(req.getParameter("confirm-password"))) 
		{  
			result += "Password doesn't match<br>";
			flag=false;
		}
		
		if(req.getParameter("state")=="")
		{ 
			result += "State is not entered<br>";
			flag=false;
		}
		if(req.getParameter("city")=="") 
		{ 
			result += "Cities is not entered<br>";
			flag=false;
		}
		if(req.getParameter("address")=="")
		{
			result += "Address is not entered<br>";
			flag=false;
		}
	   if( req.getParameter("age")=="")
		{
		   result += "Age is not entered<br>";
		   flag=false;	
		}
		if(flag==true){
			result += "Form is validated at server side<br>";
		}
		req.setAttribute("result", result);
		RequestDispatcher rd = req.getRequestDispatcher("ValidationCheck");
		rd.forward(req, res);
	}
}	

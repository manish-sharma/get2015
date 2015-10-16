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
		if(req.getParameter("firstName").trim() == "")
		{
			result += "First Name not entered<br>";
			flag=false;
		} 
		
		if(req.getParameter("lastName").trim()== "") 
		{
			result += "Last Name not entered<br>";
		    flag=false;
		}
		
		if(req.getParameter("password").length() < 8 )
		{
			result += "Password Length should be greater than 8 <br>";
		     flag=false;
		}
		
		if(!req.getParameter("password").equals(req.getParameter("confirmPassword"))) 
		{  
			result += "Password doesn't match<br>";
			flag=false;
		}
		
		if(req.getParameter("states").trim()=="")
		{ 
			result += "State is not entered<br>";
			flag=false;
		}
		if(req.getParameter("cities").trim()=="") 
		{ 
			result += "Cities is not entered<br>";
			flag=false;
		}
		if(req.getParameter("address").trim()=="")
		{
			result += "Address is not entered<br>";
			flag=false;
		}
	   if( req.getParameter("age").trim()=="")
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

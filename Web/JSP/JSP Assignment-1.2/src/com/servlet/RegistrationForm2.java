package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**This servlet  validates the form data and forwards this data to the other servlet  
 * Servlet implementation class RegistrationForm2
 */

public class RegistrationForm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Sends get request to servlet 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String result = "";
		boolean flag=true;
		response.setContentType("text/html");
		pw.println("This is servlet page.<br>");
		if(request.getParameter("firstName") == "")//if firstName field id empty or not 
		{
			result += "First Name not entered<br>";
			flag=false;
		} 
		
		if(request.getParameter("lastName")== "") //if lastName field is empty or not 
		{
			result += "Last Name not entered<br>";
		    flag=false;
		}
		
		if(request.getParameter("password").length() < 8 )//if password length is less than 8
		{
			result += "Password Length should be greater than 8 <br>";
		     flag=false;
		}
		//if confirm password is not same as password
		if(!request.getParameter("password").equals(request.getParameter("confirmPassword"))) 
		{  
			result += "Password doesn't match<br>";
			flag=false;
		}
		//if states is null
		if(request.getParameter("states")=="")
		{ 
			result += "State is not entered<br>";
			flag=false;
		}
		//if cities is empty
		if(request.getParameter("cities")=="") 
		{ 
			result += "Cities is not entered<br>";
			flag=false;
		}
		//if address is null
		if(request.getParameter("address")=="")
		{
			result += "Address is not entered<br>";
			flag=false;
		}
		//if age is null
	   if( request.getParameter("age")=="")
		{
		   result += "Age is not entered<br>";
		   flag=false;	
		}
	   //if flag is true then all the data is validated and found OK on server side
		if(flag==true){
			result += "Form is validated at server side<br>";
		}
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("ValidationCheck");
		rd.forward(request, response);//forwarding the servlet
	}
	}


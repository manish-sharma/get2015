package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.login.LoginException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exception.CarDekhoSystemException;
import com.helper.DBHelper;
import com.service.LoginService;

/**
 * Servlet implementation class NewUserController
 */
@WebServlet("/NewUserController")
public class NewUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("NewUser.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag = true;
		String forwordURL = "";
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
				try{
				LoginService loginService = new LoginService();
				boolean isInserted = loginService.addUser(id, password);
				if(!isInserted) {
					request.setAttribute("message","You are Registered Successfully" );
					forwordURL = "Login.jsp";  
				       
		}	
	       		
	}catch(CarDekhoSystemException e){
		forwordURL = "NewUser.jsp";
		request.setAttribute("message", e.getMessage());
	}
	}else{
		request.setAttribute("message",error );
   	 forwordURL = "NewUser.jsp";  
	}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwordURL);
		dispatcher.forward(request, response);
 

}
}

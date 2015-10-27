package com.controller;

import java.io.IOException;

import com.helper.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String error="";
		Validation validation=new Validation();  
		   
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		String status=validation.isValidate(userid,password); 
		
	    if(status.equalsIgnoreCase("Success")){  
	    	
           
	    	if(DBHelper.isLogInCorrect(userid,password)) {
	    		HttpSession session = request.getSession();
	    		session.setAttribute("user", userid);
	    		session.setAttribute("password", password);
	        RequestDispatcher requestDispatcher=request.getRequestDispatcher("AdminHomePage.jsp");  
	        requestDispatcher.forward(request, response);  
	    } 
	    	 else {  
	 	    	
	 	    	request.setAttribute("msg","ID Password not match" );
	 	    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login-error.jsp");  
	 	        requestDispatcher.forward(request, response);  
	 	    }
	    }
	    else {  
	    	
	    	request.setAttribute("msg",status );
	    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login-error.jsp");  
	        requestDispatcher.forward(request, response);  
	    }
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

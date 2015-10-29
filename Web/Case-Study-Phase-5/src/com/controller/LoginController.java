package com.controller;

import java.io.IOException;

import javax.security.auth.login.LoginException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exception.CarDekhoSystemException;
import com.helper.DBHelper;
import com.helper.Validation;
import com.service.LoginService;

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
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String error="";
		String forwordURL ="";
		Validation validation=new Validation();  
		   
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		String status=validation.isValidate(userid,password); 
		try{
	    if(status.equalsIgnoreCase("Success")){  
	    	LoginService loginService = new LoginService();
           
        	   boolean flag =loginService.Login(userid, password);
	    	if(flag) {
	    		HttpSession session = request.getSession();
	    		session.setAttribute("user", userid);
	    		session.setAttribute("password", password);
	        forwordURL = "AdminHomePage.jsp";    
	    } 
	    	 else {  
	 	    	request.setAttribute("message","ID Password not match" );
	 	    	 forwordURL = "Login.jsp";    
	    	 }
	    }else {  
	    	request.setAttribute("message",status );
	    	 forwordURL = "Login.jsp";  
	          
	    }
	}catch(LoginException | CarDekhoSystemException e){
		forwordURL = "Login.jsp";
		request.setAttribute("message", e.getMessage());
	}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwordURL);
		dispatcher.forward(request, response);
 }
}

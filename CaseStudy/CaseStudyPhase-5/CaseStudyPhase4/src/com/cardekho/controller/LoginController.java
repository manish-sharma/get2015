package com.cardekho.controller;

import java.io.IOException;

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
	
	private static final String USER_NAME = "admin.gmail.com";
	private static final String PASSWORD = "admin";
       
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
		RequestDispatcher requestDispatcher =request.getRequestDispatcher("/view/Login.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String userPassword = request.getParameter("password");
		String forwordURL = "/view/Login.jsp";
		
		
		
		System.out.println("Name is = "+userName);
		System.out.println("password is = "+userPassword);
		
		if(userName == "" || userName == null)
		{
			request.setAttribute("message", "Name can't be Left Blank");
			
		}
		else if(userPassword == "" || userName == null)
		{
			request.setAttribute("message", "Password Can't be left blank");
			
		}
		else if(userName.equals(USER_NAME) && userPassword.equals(PASSWORD))
		{
			forwordURL = "/view/AdminHome.jsp";
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("userName", userName);
		}
		else
		{
			request.setAttribute("message", "Incorrect UserName Password");
			
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(forwordURL);
		
		requestDispatcher.forward(request, response);
			
		
		
		
	}

}

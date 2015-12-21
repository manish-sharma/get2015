package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/Login.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/AdminSearch.jsp");
		requestDispatcher.forward(request, response);
		/*if(request.getParameter("email").trim().equals("admin@gmail.com") && request.getParameter("password").trim().equals("admin")) {
			 HttpSession session = request.getSession(true); 
			 session.setAttribute("admin", "Admin");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/AdminHome.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			request.setAttribute("message", "Please Enter right username password");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/Login.jsp");
			requestDispatcher.forward(request, response);
		}*/
	}

}

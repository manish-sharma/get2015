package com.metacube.carDekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.metacube.carDekho.model.UserAuthenticator;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password =request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("user", userName);
		session.setAttribute("password", password);
		String isValidUser = UserAuthenticator.isUserValid(userName, password);
		RequestDispatcher requestDispatcher = null;
		if(isValidUser.equals("success")) {
			request.setAttribute("message", userName);
			/*
			ServletContext servletContext = getServletContext();
			requestDispatcher = request.getRequestDispatcher("/SearchController");
			requestDispatcher.include(request, response);
			*/
			response.sendRedirect("SearchController");
		} else {
			request.setAttribute("message", isValidUser);
			requestDispatcher = request.getRequestDispatcher("login.jsp");
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

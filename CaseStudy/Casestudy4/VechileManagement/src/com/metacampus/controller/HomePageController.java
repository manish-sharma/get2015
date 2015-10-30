package com.metacampus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePageController
 */
@WebServlet("/HomePageController")
public class HomePageController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageController() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	String logout = (String) request.getParameter("logout");
	
	if (logout != null) {
	    HttpSession session = request.getSession();
	    session.invalidate();
	}
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("Home.jsp");
	requestDispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {

	String userName = request.getParameter("login");
	String password = request.getParameter("password");
	
	if (userName.equalsIgnoreCase("nikhil") && password.equalsIgnoreCase("1234")) {
	    HttpSession session = request.getSession();
	    session.setAttribute("name", "session");
	}
	else {
	    request.setAttribute("message","Please Enter right username password");
	}
	RequestDispatcher requestDispatcher = request
		.getRequestDispatcher("Home.jsp");
	requestDispatcher.forward(request, response);

    }
}
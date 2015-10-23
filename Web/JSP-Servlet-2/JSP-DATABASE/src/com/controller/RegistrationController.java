package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DatabaseQueries;
import com.model.User;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("user-name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		User newUser = new User(userName,password, email);
		DatabaseQueries queryObject = new DatabaseQueries();
		boolean status = queryObject.insertUserIntoDatabase(newUser);
		if(status) {
			String success = "Thanks for registering. Please Login with your email and password.";
			request.setAttribute("error_label", success);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			String error ="Error Occurred in registration ";
			request.setAttribute("error_label", error);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}

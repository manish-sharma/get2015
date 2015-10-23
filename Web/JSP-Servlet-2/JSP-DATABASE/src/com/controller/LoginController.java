package com.controller;
import com.database.*;
import com.model.*;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user-name");
		String password = request.getParameter("password");
		User logUser = new User(userName, password);
		DatabaseQueries queryObject = new DatabaseQueries();
		boolean status = queryObject.matchUserInDatabase(logUser);
		if(status) {
			HttpSession session = request.getSession();
            session.setAttribute("user", userName);
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30*60);
            
            
            List<User> displayList = DatabaseQueries.getDataFromDatabase();
            session.setAttribute("list", displayList);
			response.sendRedirect("loginsuccess.jsp");	
		}
		else {
			String error = "Please enter correct email and password";
			request.setAttribute("error_label", error);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}

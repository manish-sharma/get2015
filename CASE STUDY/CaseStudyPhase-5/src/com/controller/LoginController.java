package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.DatabaseQueries;
import com.model.Admin;
import com.service.CarDekhoService;

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
		Admin logUser = new Admin(userName, password);
		CarDekhoService service = new CarDekhoService();
		boolean status = service.matchAdmin(logUser);
		//DatabaseQueries queryObject = new DatabaseQueries();
		//boolean status = queryObject.matchAdmin(logUser);
		if(status) {
			HttpSession session = request.getSession();
            session.setAttribute("user", userName);
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30*60);
			response.sendRedirect("admin.jsp");	
		}
		else {
			String error = "Please enter correct email and password";
			request.setAttribute("error_label", error);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}
	}
	}



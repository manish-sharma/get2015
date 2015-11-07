package com.metacampus.vehiclemanagement.controller;

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

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	    String url="login.jsp";
		String logout = request.getParameter("logout");
		if (logout != null) {
			HttpSession session = request.getSession(false);
			session.invalidate();
			url="index.jsp";
		}
		RequestDispatcher dispatcher = request
				.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "index.jsp";
		String userName = request.getParameter("user_name");
		String password = request.getParameter("password");

		if (userName != null && password != null) {

			if (userName.equalsIgnoreCase("admin@a.com")
					&& password.equalsIgnoreCase("1234")) {
				HttpSession session = request.getSession();

			} else {
				url = "login.jsp";
				request.setAttribute("message",
						"please Enter correct UserName or Password ");

			}

		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}
}

package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			UserBean user = new UserBean();// creating user bean object
			user.setUserName(request.getParameter("un"));// setting value of
															// user name
			user.setPassword(request.getParameter("pw"));// setting value of
															// password
			user = UserDAO.login(user);// sending the user login credentials to
										// the database for verification

			if (user.isValid())// checking if user credentials is valid then
			{

				HttpSession session = request.getSession(true);// create new
																// session
																// object for
																// the user
				session.setAttribute("currentSessionUser", user);
				response.sendRedirect("userLogged.jsp"); // logged-in page
			}
			// if user credentials are invalid then the error page will be
			// displayed
			else
				response.sendRedirect("invalidLogin.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

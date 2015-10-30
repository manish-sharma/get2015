package com.metacrm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.metacrm.db.helper.LoginDBHelper;
import com.metacrm.model.User;

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
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = null;
		User objOfUser = createUser(request);
		request.setAttribute("user", objOfUser);
		LoginDBHelper objOfLoginDBHelper = new LoginDBHelper();
		String result = objOfLoginDBHelper.authenticate(request);

		if (result.equals(objOfUser.getUserName())) {
			// Create a session object if it is already not created.
			HttpSession session = request.getSession();
			session.setAttribute("userName", objOfUser.getUserName());
			forwardUrl = "home.jsp";
		} else {
			forwardUrl = "login.jsp";
			request.setAttribute("msg", "Invalid Username Or Password");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

	private User createUser(HttpServletRequest request) {
		User objOfUser = new User();
		objOfUser.setUserName(request.getParameter("username"));
		objOfUser.setPassword(request.getParameter("password"));
		return objOfUser;
	}

}

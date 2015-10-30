package com.metacrm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.User;
import com.metacrm.service.MetaCRMService;

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
		// redirects to login page
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
		String result = "";
		MetaCRMService service = new MetaCRMService();
		try {
			result = service.loginAdmin(objOfUser);
			if (result.equals(objOfUser.getUserName())) {
				// Create a session object if it is already not created.
				HttpSession session = request.getSession();
				// sets the user name and attribute is get on the jsp page
				session.setAttribute("userName", objOfUser.getUserName());
				forwardUrl = "home.jsp";
			} else {
				//if the username and password doesnot match than user remains on same page and message is displayed
				forwardUrl = "login.jsp";
				request.setAttribute("msg", "Invalid Username Or Password");
			}
		} catch (MetaCRMSystemException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

	// user model class object is created
	private User createUser(HttpServletRequest request) {
		User objOfUser = new User();
		objOfUser.setUserName(request.getParameter("username"));
		objOfUser.setPassword(request.getParameter("password"));
		return objOfUser;
	}

}

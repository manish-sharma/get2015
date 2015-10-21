package com.servlets;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DatabaseHelper.UserTableQuery;
import com.Model.User;

/**
 * Servlet implementation class ValidateLogIn
 */
@WebServlet("/ValidateLogIn")
public class ValidateLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		String message="";
		Boolean isUserNameCorrect=false;
		Boolean isPasswordCorrect=false;
		int flag=0;
		if (userid.length() == 0) {
			flag = 1;
			message = "User Name field Empty";
		}
		// check for empty password field
		else if (password.length() == 0) {
			flag = 1;
			message = "Password field Empty";
		}if (flag == 1) {
			// redirecting the response to log in page
			response.sendRedirect("login.jsp?message="
					+ URLEncoder.encode(message, "UTF-8"));
		}
		else{
			
			User user=new User();
			user.setUserid(userid);
			user.setPassword(password);
			
			if(UserTableQuery.isValidUser(user)){
				
				response.sendRedirect("profile.jsp");
				
			
			}
			else{
				response.sendRedirect("login.jsp?message="
						+ URLEncoder.encode("Invalid Username or Password", "UTF-8"));
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

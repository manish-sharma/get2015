package com.servlets;

import java.io.IOException;


import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.DatabaseHelper.UserTableQuery;
import com.Model.User;

/**
 * Servlet implementation class InsertIntoDatabase
 */

public class InsertIntoDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertIntoDatabase() {
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

		
		String userid = request.getParameter("userid");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		
		User user=new User();
		user.setUserid(userid);
		user.setEmail(email);
		user.setPassword(password);
		boolean flag=UserTableQuery.insertInfo(user);
		if(flag){
			response.sendRedirect("profile.jsp");
		}
		else{
			
			response.sendRedirect("index.jsp?message="
					+ URLEncoder.encode("User name Already Exist, Try Another", "UTF-8"));
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

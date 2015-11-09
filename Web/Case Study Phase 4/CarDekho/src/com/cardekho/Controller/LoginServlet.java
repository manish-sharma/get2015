package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.LoginDBHelper;
import com.cardekho.model.User;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		/* If session is continue then invalidate the session and clear the cache */
		if(request.getSession(false) != null) 
		{
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Cache-Control", "no-store");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0);
			request.getSession(false).invalidate();
		}
		
		/* forwarding to login.jsp page */
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		LoginDBHelper loginDBHelper = new LoginDBHelper();
		try 
		{	
			/* validateLogin method of LoginDBHelper class returns object of class User if
			 * validated successfully, otherwise null/
			 */
			User admin = loginDBHelper.validateLogin(request);
			if(admin == null) 
			{
				/* in case of null, forward to login */
				requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.forward(request, response);
			}
			else 
			{
				/* if object is not null then transfer to index.jsp */
				HttpSession session = request.getSession();
				session.setAttribute("user",admin.getName());
				request.setAttribute("admin", admin);
				requestDispatcher = request.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(request, response);
			}
		} 
		catch (CarDekhoSystemException e) 
		{
			e.printStackTrace();
		}
	}
}

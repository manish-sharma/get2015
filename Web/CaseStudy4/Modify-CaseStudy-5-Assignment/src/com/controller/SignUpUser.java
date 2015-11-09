package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MetaHRMSystemException;
import com.UserAlreadyExistsException;
import com.metahrm.service.MetaHRMService;
import com.model.Gender;
import com.model.User;

/**
 * Servlet implementation class SignInUser
 */
@WebServlet("/SignUpUser")
public class SignUpUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpUser() {
        super();
        // TODO Auto-generated constructor stub
    }	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "index.jsp";
		User user =null ;
		try {
			user =createUser(request);
			MetaHRMService service = new MetaHRMService();
			User createdUser = service.createUser(user);
			request.setAttribute("message", "Created Successfully");
			request.setAttribute("email", createdUser.getEmail());
			forwardUrl = "index.jsp";
		
		} catch (MetaHRMSystemException e) {
			System.out.println("Exception while creating user" + e.getMessage());
			//forwardUrl = "index.jsp";
			request.setAttribute("message", e.getMessage());
			request.setAttribute("email",user.getEmail());
		} catch (UserAlreadyExistsException e) {
			String message ="User already have email id with  " + e.getMessage();
			System.out.println(message);
			//forwardUrl = "index.jsp";
			request.setAttribute("message",message);
			request.setAttribute("email", user.getEmail());
		}
		request.getRequestDispatcher(forwardUrl).forward(request, response);
		
	}

	private User createUser(HttpServletRequest request) throws NullPointerException ,NumberFormatException{
		
		User user  = new User() ;
		user.setFirstName(request.getParameter("firstName").trim());
		user.setLastName(request.getParameter("lastName").trim());
		user.setPassword(request.getParameter("password").trim());
		user.setEmail(request.getParameter("emailId").trim());
		user.setAddress(request.getParameter("address").trim());
		user.setGender(Gender.valueOf(request.getParameter("gender").trim()));
		user.setPhoneNo(request.getParameter("phoneNo").trim());
		
		return user;
	}

}

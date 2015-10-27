package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ContactusController
 */
@WebServlet("/ContactusController")
public class ContactusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactusController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean flag =false;		
		String error="";
		if(request.getParameter("name") == null){
			error ="Enter Your Name";
			flag = false;
		}
		else if(request.getParameter("email") == ""){
			error ="Enter Your Email";
			flag = false;
		}else if(request.getParameter("message") == ""){
			error ="Enter Your message";
			flag = false;
		}else{
			flag= true;
		}
		if(flag){
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("HomePage.jsp");  
		       requestDispatcher.forward(request, response);
			
		}else{
		request.setAttribute("msg",error );
   	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("Contactuserror.jsp");  
       requestDispatcher.forward(request, response);  
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

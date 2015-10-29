package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Anjita
 * Servlet implementation class LogOutController
 */
public class LogOutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * Default constructor
     * @see HttpServlet#HttpServlet()
     */
    public LogOutController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LOGOUT");
		HttpSession session = request.getSession(false);
		session.removeAttribute("admin");
		if(session!=null) {
			session.invalidate();
		}
		response.sendRedirect("/CaseStudy5/view/Login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printer = response.getWriter();
		boolean flag = true;
		response.setContentType("text/html");
		printer.println("This is servlet page.<br>");
		if (request.getParameter("firstName") == "") {
			printer.println("First Name not entered<br>");
			flag = false;
		}

		if (request.getParameter("lastName") == "") {
			printer.println("Last Name not entered<br>");
			flag = false;
		}

		if (request.getParameter("password").length() < 8) {
			printer.println("Password Length should be greater than 8 <br>");
			flag = false;
		}

		if (!request.getParameter("password").equalsIgnoreCase(
				request.getParameter("conformpassword"))) {
			printer.println("Password doesn't match<br>");
			flag = false;
		}

		if (request.getParameter("states") == "") {
			printer.println("State is not entered<br>");
			flag = false;
		}
		if (request.getParameter("cities") == "") {
			printer.println("Cities is not entered<br>");
			flag = false;
		}
		if (request.getParameter("address") == "") {
			printer.println("Address is not entered<br>");
			flag = false;
		}
		if (request.getParameter("age") == "") {
			printer.println("Age is not entered<br>");
			flag = false;
		}
		if (flag == true) {
			printer.println("Form is validated at server side<br>");
		
		}
	}
}

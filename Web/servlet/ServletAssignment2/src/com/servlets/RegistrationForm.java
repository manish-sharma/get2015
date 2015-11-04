package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printer = response.getWriter();
       String result="";
		boolean flag = true;
		response.setContentType("text/html");
		printer.println("This is servlet page.<br>");
		if (request.getParameter("firstName") == "") {
			result=result+"First Name not entered<br>";
			flag = false;
		}

		if (request.getParameter("lastName") == "") {
			result=result+"Last Name not entered<br>";
			flag = false;
		}

		if (request.getParameter("password").length() < 8) {
			result=result+"Password Length should be greater than 8 <br>";
			flag = false;
		}

		if (!request.getParameter("password").equalsIgnoreCase(
				request.getParameter("conformpassword"))) {
			result=result+"Password doesn't match<br>";
			flag = false;
		}

		if (request.getParameter("states") == "") {
			result=result+"State is not entered<br>";
			flag = false;
		}
		if (request.getParameter("cities") == "") {
			result=result+"Cities is not entered<br>";
			flag = false;
		}
		if (request.getParameter("address") == "") {
			result=result+"Address is not entered<br>";
			flag = false;
		}
		if (request.getParameter("age") == "") {
			result=result+"Age is not entered<br>";
			flag = false;
		}
		if(flag==true){
			result += "Form is validated at server side<br>";
			}
		
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
			rd.forward(request, response);
			
	}
}

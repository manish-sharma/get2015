package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeCache;
import com.helper.RegistrationAuthentication;
import com.model.Employee;
/**
 * servlet
 * @author Sumitra
 * this servlet register a employee
 *
 */

@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		try {
			PrintWriter pw = res.getWriter();
			RequestDispatcher requestDispatcher ;
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			int Id =(Integer.parseInt(req.getParameter("Id")));
			int age =(Integer.parseInt(req.getParameter("age")));
			String registrationDate = new Date().toString();
			if(RegistrationAuthentication.check(Id)) {
				Employee employee = new Employee(name, email, Id, age, registrationDate);
				EmployeeCache employeeCache = EmployeeCache.getInstance();
				employeeCache.addEmployee(employee);
				req.setAttribute("list", employeeCache.getAllEmployees());
				requestDispatcher = req.getRequestDispatcher("EmployeeList.jsp");
				requestDispatcher.forward(req, res);
			} else {
				
				req.setAttribute("msg","Id Already Present");
				requestDispatcher = req.getRequestDispatcher("Registration.jsp");
				requestDispatcher.forward(req, res);
			}
		
		}
		catch(Exception e) {
						
			RequestDispatcher requestDispatcher ;
			req.setAttribute("msg","Id Already Present");
			requestDispatcher = req.getRequestDispatcher("Registration.jsp");
			requestDispatcher.forward(req, res);
		}
	}	
}	

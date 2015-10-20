package com.controller;
import javax.servlet.http.*;
import javax.servlet.*;

import com.helper.EmployeeCache;
import com.model.Employee;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;

public class Registration extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		Integer id = Integer.parseInt(request.getParameter("id"));
		String email = request.getParameter("email");
		Integer age = Integer.parseInt(request.getParameter("age"));
		
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		Date date = new Date();
		String today = dateFormat.format(date);
		
		Employee employee = new Employee(id,name,email,age,today);
		
		EmployeeCache employeeCache = new EmployeeCache();
		employeeCache.setEmployee(employee);
		response.sendRedirect("view/employeelist.jsp");
		
				
	}
		
}
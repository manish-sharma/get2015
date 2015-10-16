package com.controller;
import javax.servlet.http.*;
import javax.servlet.*;

import com.model.Employee;
import com.model.EmployeeCache;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;

public class Update extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		Integer id = Integer.parseInt(request.getParameter("id"));
		String email = request.getParameter("email");
		Integer age = Integer.parseInt(request.getParameter("age"));
		
		EmployeeCache employeeCache = new EmployeeCache();
		employeeCache.updateEmployee(id, name, email, age);
		response.sendRedirect("view/employeelist.jsp");
		
				
	}
		
}
package com.metacube.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacube.EmployeeSystemException;
import com.metacube.db.helper.EmployeeDBHelper;
import com.metacube.model.Employee;

/**
 * Servlet implementation class EmployeeDetail
 */
@WebServlet("/EmployeeDetail")
public class EmployeeDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		try {
			request.setAttribute("employeeList", employeeDBHelper.getEmployeeList());
		} catch (EmployeeSystemException e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("errorpage.jsp");
			requestDispatcher.forward(request, response);
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("EmployeeDetails.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDBHelper employeeDBHelper = new EmployeeDBHelper();
		try {
			Employee employee = employeeDBHelper.getEmployeeById(id);
			String detail = "Name : "+employee.getName()+"<br/>Email : "
			+employee.getEmail()+"<br/>Date Of Birth : "+
					employee.getDateOfBirth()+"<br/>Address : "+
			employee.getAddress();
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(detail);
		} catch (EmployeeSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

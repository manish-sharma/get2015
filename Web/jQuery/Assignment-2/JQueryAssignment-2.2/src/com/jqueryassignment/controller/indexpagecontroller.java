package com.jqueryassignment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.jqueryassignment.helper.EmployeeDAO;
import com.jqueryassignment.model.Employee;

/**
 * Servlet implementation class indexpagecontroller
 */
@WebServlet("/indexpagecontroller")
public class indexpagecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexpagecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   List<Employee> employeeList = null;
	   try{
	   employeeList = EmployeeDAO.getEmployee();
	   request.setAttribute("employeeList", employeeList);
	   }catch(Exception e){
		   RequestDispatcher requestDispatcher = request.getRequestDispatcher("errorpage.jsp");
		   requestDispatcher.forward(request ,response);
	   }
	   RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
	   requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO employeeDAO = new EmployeeDAO();
		try{
			Employee employee = employeeDAO.getEmployeeById(id);
			String details = "Name : "+employee.getName()+"<br/>Email: " +
					employee.getEmailId() +"<br/>Date of Birth: " + employee.getDateOfBirth()+
					"<br/>Address: " + employee.getAddress();
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(details);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

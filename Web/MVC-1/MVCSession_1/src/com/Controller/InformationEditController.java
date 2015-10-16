package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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
 * Servlet implementation class InformationEditController
 * this servlet edit information of a selected employee and save 
* @author Ravika
 * @since 10/15/2015
 */
@WebServlet("/InformationEditController")
public class InformationEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformationEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		RequestDispatcher requestDispatcher ;
		String name = request.getParameter("name1");
		String email = request.getParameter("email1");
		int id =(Integer.parseInt(request.getParameter("id1")));
		int age =(Integer.parseInt(request.getParameter("age1")));
		String registrationDate = request.getParameter("dateOfRegistration1");
		
			
			EmployeeCache employeeCache = EmployeeCache.getInstance();
			
			Employee employee = new Employee(name, email, id, age, registrationDate);
			employeeCache.addEmployee(employee);
			request.setAttribute("list", employeeCache.getAllEmployees());
			requestDispatcher = request.getRequestDispatcher("List.jsp");
			requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

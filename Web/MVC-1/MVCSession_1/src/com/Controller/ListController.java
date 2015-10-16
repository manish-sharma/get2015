package com.Controller;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeCache;
import com.model.Employee;

/**
 * Servlet implementation class ListController
 */


@WebServlet("/ListController")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static boolean flag = false;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeCache employeeCache = EmployeeCache.getInstance();
		if(!flag) {
			employeeCache.addEmployee(new Employee("Sanjay", "Sanjay@mail.com", 1, 25, "25-4-89"));
			employeeCache.addEmployee(new Employee("vijay", "vijay@mail.com", 2, 28, "14-05-98"));
			employeeCache.addEmployee(new Employee("ajay", "ajay@mail.com", 4, 25, "12-01-99"));
			flag = true;
		}
		RequestDispatcher requestDispatcher;
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

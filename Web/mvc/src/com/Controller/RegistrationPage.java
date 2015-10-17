package com.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.EmployeeListMain;
import com.modal.Employee;

/**
 * Servlet implementation class RegistrationPage
 * @author Ankur
 */
@WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public RegistrationPage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int value = 0;

		ConcurrentHashMap<Integer, Employee> employeeMapNew = EmployeeListMain.getAllEmployees();
		List<Employee> employeeList = new ArrayList<Employee>();

		for (Integer i : employeeMapNew.keySet()) {
			employeeList.add(employeeMapNew.get(i));
			value = i;
		}

		if(id == -1) {
			request.setAttribute("newUser", (value+1));
			getServletContext().getRequestDispatcher("/view/RegistrationPage.jsp").forward(request, response);
		} else {
			request.setAttribute("employeeDetails", employeeList.get(id));
			getServletContext().getRequestDispatcher("/view/RegistrationPage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

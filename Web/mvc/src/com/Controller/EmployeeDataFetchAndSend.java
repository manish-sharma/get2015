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
 * Servlet implementation class EmployeeDataFetchAndSend
 * @author Ankur
 */

public class EmployeeDataFetchAndSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDataFetchAndSend() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ConcurrentHashMap<Integer, Employee> employeeMapNew = EmployeeListMain.getAllEmployees();
		List<Employee> employeeList = new ArrayList<Employee>();

		for (Integer i : employeeMapNew.keySet()) {
			employeeList.add(employeeMapNew.get(i));
		}

		request.setAttribute("employeeList",employeeList);
		getServletContext().getRequestDispatcher("/view/EmployeeListPage.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}

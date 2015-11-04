package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import DBHelper.EmployeeHelper;

/**
 * Servlet implementation class EmployeeDetailController
 */
@WebServlet("/EmployeeDetailController")
public class EmployeeDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDetailController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String empName = request.getParameter("name");

		EmployeeHelper employeeHelper = new EmployeeHelper();
		//getting the employee detail from db
		Employee employee = employeeHelper.get(empName);
		String detail = "";
		detail = "Name = " + employee.getName() + "<br>Contact No. = "
				+ employee.getContantNo() + "<br>Address = "
				+ employee.getAddress();

		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(detail);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
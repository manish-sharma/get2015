package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Employee;
import ModelHelper.EmployeeHelper;

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

		String employeeName = request.getParameter("name");

		EmployeeHelper employeeHelper = new EmployeeHelper();
		// getting the employee detail from db
		Employee employee = employeeHelper.get(employeeName);

		String detail = "";
		detail = "Name = " + employee.getName() + "<br>Email ID is. = "
				+ employee.getEmailId() + "<br>Contact Info is. = "
				+ employee.getPhoneNo();

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
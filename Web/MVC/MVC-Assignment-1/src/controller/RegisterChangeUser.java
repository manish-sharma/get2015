package controller;

import helper.EmployeeCache;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

/**
 * Servlet implementation class RegisterNewUser
 */
@WebServlet("/RegisterChangeUser")
public class RegisterChangeUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterChangeUser() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			EmployeeCache employeeCache = EmployeeCache.getCacheObject();
			Employee employee = new Employee();
			if(request.getParameter("registerUser") != null) {
					employee.setId(Integer.parseInt(request.getParameter("employeeId")));
					employee.setName(request.getParameter("name"));
					employee.setEmail(request.getParameter("email"));
					Date date = new Date();
					employee.setDateOfRegistration(date.toString());
					employee.setAge(Integer.parseInt(request.getParameter("age")));
					employeeCache.createEmployee(employee);
					response.sendRedirect("FetchRecords");
				
			} else { 
				if(request.getParameter("id") != null) {
					employee = employeeCache.getEmployee(Integer.parseInt(request.getParameter("id")));
					request.setAttribute("employee", employee);
				} else {
					request.setAttribute("employeeId", employeeCache.getNextId());
				}
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/register.jsp");
				requestDispatcher.forward(request, response);
				
			}
		} catch(NullPointerException e) {
			response.sendRedirect("view/register.jsp");
		} catch(NumberFormatException e) {
			response.sendRedirect("view/error.jsp?error=400");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

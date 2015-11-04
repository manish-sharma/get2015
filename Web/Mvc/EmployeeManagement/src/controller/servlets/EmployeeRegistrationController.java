package controller.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import modelHelper.EmployeeCache;
import modelHelper.EmployeeHelper;
import modelHelper.PageHeading;

/**
 * Servlet implementation class EmployeeRegistrationController
 */

public class EmployeeRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
	
	 
	 
	
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeRegistrationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         String url="";
     	RequestDispatcher requestDispatcher;
   
     
		 String heading = PageHeading.heading("EmployeeRegistration");
		 request.setAttribute("heading", heading);
		 String eId = request.getParameter("id");
		 String sample=request.getParameter("editId");
		
	        
		 
		if (eId == null && request.getParameter("name") == null) {
				     	
			url=EmployeeRegistrationController.EmployeeRegistration(request);
			requestDispatcher = request.getRequestDispatcher(url);
			requestDispatcher.forward(request, response);
		}

		else if (eId != "" && request.getParameter("name") == null) {
			 url=EmployeeRegistrationController.EmployeeEdit(request,eId);
	       requestDispatcher = request.getRequestDispatcher(url);
	       requestDispatcher.forward(request, response);
		} 
		else if (sample.equals("0")) {
			 url=EmployeeRegistrationController.EmployeeCreation(request);
			 requestDispatcher = request.getRequestDispatcher(url);
		 	 requestDispatcher.forward(request, response);
			
		} else {
			  url=EmployeeRegistrationController.EmployeeUpdation(request);
			 requestDispatcher = request.getRequestDispatcher(url);
			 requestDispatcher.forward(request, response);
		}

	}

	private static String EmployeeRegistration(HttpServletRequest request) {
		String url = "view/EmployeeRegistration.jsp";
        return url;
	}


	private static String EmployeeCreation(HttpServletRequest request) {
		String url = "EmployeeListController";
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		Date date = new Date();
		int id = EmployeeCache.employeeCache.size() + 1;
		Employee employee = EmployeeHelper.createEmployee(id, name,age,
		formatter.format(date), email);
		EmployeeCache.add(employee);
        return url;
	}
	

	private static String EmployeeUpdation(HttpServletRequest request) {
		String url = "EmployeeListController";
		String id = request.getParameter("editId");
		int empId = Integer.parseInt(id);
		Employee emp = EmployeeCache.getByEmpId(empId);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		EmployeeHelper.updateEmployee(emp, name, age, email);
        return url;
	}
	private static String EmployeeEdit(HttpServletRequest request, String EmployeeId) {
		int empId = Integer.parseInt(EmployeeId);
		String url = "view/EmployeeRegistration.jsp";
		Employee employee = EmployeeCache.getByEmpId(empId);
		request.setAttribute("id", empId);
		request.setAttribute("employee", employee);
        return url;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

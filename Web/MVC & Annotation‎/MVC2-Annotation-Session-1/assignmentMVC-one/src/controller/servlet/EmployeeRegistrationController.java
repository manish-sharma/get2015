package controller.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import modelHelper.EmployeeCache;
import modelHelper.EmployeeHelper;

/**
 * Servlet implementation class EmployeeRegistrationController
 */
@WebServlet("/EmployeeRegistrationController")
public class EmployeeRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String id =  request.getParameter("id");
	    String editId = request.getParameter("editId");
	    System.out.println("id   ="+id);
	    System.out.println("edit id ="+editId);
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("EmployeeRegistration.jsp");
		if(id==null && editId==null)
		{
			System.out.println("one");
			requestDispatcher.forward(request, response);
			
		}
		else if(id!=null && editId==null)
		{
			System.out.println("Two");
			Employee employee = EmployeeCache.getEmployeeById(Integer.parseInt(id));
			request.setAttribute("employee", employee);
			request.setAttribute("id", Integer.parseInt(id));
			requestDispatcher.forward(request, response);
			
		}
		else
		{
			System.out.println("Three");
			
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String email = request.getParameter("email");
			String dateOfRegistration= request.getParameter("dateOfRegistration");
		
			if(editId=="")
			{
				System.out.println("1");
				int empIdNew = EmployeeCache.employeeCache.size();
				EmployeeCache.addEmployee(EmployeeHelper.createEmployee(name, age, dateOfRegistration, email, ++empIdNew));
				
			}
			else
			{
				System.out.println("2");
				Employee employeeNew = EmployeeCache.getEmployeeById(Integer.parseInt(editId));
				EmployeeHelper.editEmployee(employeeNew, age, name, email);
				EmployeeCache.addEmployee(employeeNew);
				
				
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeListController");
			rd.forward(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

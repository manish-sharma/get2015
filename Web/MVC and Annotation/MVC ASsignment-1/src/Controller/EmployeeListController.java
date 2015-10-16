package Controller;

import helper.EmployeeModelHelper;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

/**
 * Servlet implementation class EmployeeListController
 * Controller Servlet for the JSP Page of view List 
 */
@WebServlet("/EmployeeListController")
public class EmployeeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Function to get the list and pass it on to the page for viewing
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Collection<Employee> employeeCollection=EmployeeModelHelper.getAllEmployees();
	    request.setAttribute("employeeList",employeeCollection);
	    RequestDispatcher rd=request.getRequestDispatcher("/view/EmployeeList.jsp");
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

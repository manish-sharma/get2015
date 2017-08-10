package Controller;

import helper.EmployeeModelHelper;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

/**
 * Servlet implementation class EditDetailsController
 */
@WebServlet("/EditDetailsController")
public class EditDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDetailsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Function to get the employee details from the form url and updating it in the cache
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("EmployeeID"));
		Employee employee=EmployeeModelHelper.getEmployeeById(id);
		String updateName=request.getParameter("Name");
		String updateEmail=request.getParameter("Email");
		int updateAge=Integer.parseInt(request.getParameter("Age"));
		employee.setName(updateName);
		employee.setEmailID(updateEmail);
		employee.setAge(updateAge);
		String status=EmployeeModelHelper.updateEmployee(employee);
		System.out.print(status);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

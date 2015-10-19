package controller.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import model.TextGeneric;
import modelHelper.EmployeeCache;
import modelHelper.EmployeeDefault;
import modelHelper.PageSelector;

/**
 * Servlet implementation class HeadingController
 */

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
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDefault s = EmployeeDefault.getInstance();
		PageSelector pageSelector = new PageSelector();
		List<TextGeneric> list = pageSelector.selector("EmployeeList");
		String heading ="";
		System.out.println(list.isEmpty());
		for(TextGeneric t : list) {
			heading += t.getContent();
		}
		list.clear();
		
		 
		List<Employee> employeeList	= EmployeeCache.getAllEmployee();
		
		
		request.setAttribute("employeeList", employeeList);
		request.setAttribute("heading", heading);
		RequestDispatcher rd = request.getRequestDispatcher("view/EmployeeList.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

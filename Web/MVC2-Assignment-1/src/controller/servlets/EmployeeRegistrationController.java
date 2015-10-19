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
import modelHelper.EmployeeHelper;
import modelHelper.PageSelector;

/**
 * Servlet implementation class EmployeeRegistrationController
 */

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
		PageSelector pageSelector = new PageSelector();
		List<TextGeneric> list = pageSelector.selector("EmployeeRegistration");
		String heading ="";
		System.out.println(list.isEmpty());
		for(TextGeneric t : list) {
			heading += t.getContent();
		}
		list.clear();
		request.setAttribute("heading", heading);
		
		String eId =  request.getParameter("id");
		//System.out.println("id = "+eId);
		if(eId==null &&  request.getParameter("name")==null ) {
			RequestDispatcher rd = request.getRequestDispatcher("view/EmployeeRegistration.jsp");
			rd.forward(request, response);}
		
		else if(eId!="" && request.getParameter("name")==null){
				int empId = Integer.parseInt(eId);
				Employee emp = EmployeeCache.getByEmpId(empId);
				request.setAttribute("id", empId);
				request.setAttribute("employee", emp);
				RequestDispatcher rd = request.getRequestDispatcher("view/EmployeeRegistration.jsp");
				rd.forward(request, response);
			}
			else if(request.getParameter("editId")=="" && request.getParameter("name")!=null){ 
				
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				int age = Integer.parseInt(request.getParameter("age"));
				String dor = request.getParameter("dor");
				int id = EmployeeCache.employeeCache.size()+1; 
				Employee employee = EmployeeHelper.createEmployee(id, name, age, dor, email);
				EmployeeCache.add(employee);
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeListController");
				rd.forward(request, response);
				//System.out.println("id  = "+id);
			}
			else {
				String id = request.getParameter("editId");
				System.out.println("editId = "+id);
				int empId = Integer.parseInt(id);
				Employee emp = EmployeeCache.getByEmpId(empId);
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				int age = Integer.parseInt(request.getParameter("age"));
				String dor = request.getParameter("dor");
				EmployeeHelper.updateEmployee(emp, name, age, dor, email);
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeListController");
				rd.forward(request, response);
			}
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

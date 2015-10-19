package controller.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import model.TextGeneric;
import modelHelper.EmployeeCache;
import modelHelper.PageSelector;

/**
 * Servlet implementation class EmployeeDetailController
 */

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageSelector pageSelector = new PageSelector();
		List<TextGeneric> list = pageSelector.selector("EmployeeDetails");
		String heading ="";
		System.out.println(list.isEmpty());
		for(TextGeneric t : list) {
			heading += t.getContent();
		}
		list.clear();
		request.setAttribute("heading", heading);
		int eId = Integer.parseInt(request.getParameter("id"));
	
      Employee e = EmployeeCache.getByEmpId(eId);
      request.setAttribute("employee", e);
      RequestDispatcher rd = request.getRequestDispatcher("view/EmployeeDetails.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

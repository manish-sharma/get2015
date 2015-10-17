package controller;

import helper.EmployeeCache;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;

/**
 * Servlet implementation class ViewDetails
 */
@WebServlet("/ViewDetails")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			if( request.getParameter("id") != null) {
				EmployeeCache cache = EmployeeCache.getCacheObject();
				Employee employee = cache.getEmployee(Integer.parseInt(request.getParameter("id")));
				RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterChangeUser");
				request.setAttribute("readonly", true);
				dispatcher.forward(request, response);
			} else {
				response.sendRedirect("FetchRecords");
			}
		} catch(NullPointerException e) {
			response.sendRedirect("view/error.jsp");
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

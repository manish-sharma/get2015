package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.helper.EmployeeModelHelper;
import com.example.model.EmployeeBean;

/**
 * Servlet implementation class UpdateDetailsController
 */
@WebServlet("/UpdateDetailsController")
public class UpdateDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateDetailsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		EmployeeBean objEmployeeBean = new EmployeeBean();
		objEmployeeBean.setEmployeeId(Integer.parseInt(request.getParameter("empID")));
		objEmployeeBean.setName(request.getParameter("empName"));
		objEmployeeBean.setEmail(request.getParameter("empEmail"));
		objEmployeeBean.setAge(Integer.parseInt(request.getParameter("empAge")));
		objEmployeeBean.setDateOfRegistration(request.getParameter("empDate"));
		boolean result = EmployeeModelHelper.updateEmployee(objEmployeeBean);
		if(result)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/ListController");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/Error");
			rd.forward(request, response);
		}
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

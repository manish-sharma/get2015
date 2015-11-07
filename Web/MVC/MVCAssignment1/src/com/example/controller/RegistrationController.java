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
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /* registers user */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeBean objEmployeeBean=new EmployeeBean();
		objEmployeeBean.setName(request.getParameter("empName"));
		objEmployeeBean.setEmail(request.getParameter("empEmail"));
		objEmployeeBean.setAge(Integer.parseInt(request.getParameter("empAge")));
		objEmployeeBean.setDateOfRegistration(request.getParameter("empDate"));
		EmployeeModelHelper.addEmployee(objEmployeeBean);
		RequestDispatcher rd = request.getRequestDispatcher("/ListController");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

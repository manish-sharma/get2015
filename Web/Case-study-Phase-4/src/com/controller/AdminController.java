package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.DBHelper;
import com.helper.VehicleHelper;
import com.model.Car;
import com.model.Vehicle;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("CreateCar") != null){
			request.setAttribute("vehicle", null);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminCreate.jsp");
		requestDispatcher.forward(request, response);
		}
		if(request.getParameter("SearchCar") != null){
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminSearch.jsp");
		requestDispatcher.forward(request, response);
		}
		else{
			int id = Integer.parseInt(request.getParameter("id"));
			RequestDispatcher requestDispatcher;
			List<Car>  list =new ArrayList<Car>();
			list = DBHelper.searchById(id);
				request.setAttribute("vehicle", list);
				request.setAttribute("id", id);
				requestDispatcher = request.getRequestDispatcher("AdminCreate.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

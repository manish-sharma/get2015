package com.metacube.carDekho.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacube.carDekho.db.helper.VehicleJDBCHelper;
import com.metacube.carDekho.factory.CarDekhoService;
import com.metacube.carDekho.model.Vehicle;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchPageController")
public class SearchPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPageController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("dropdown");
		List<Vehicle> list = null;
		CarDekhoService carDekhoService = new CarDekhoService();
		if(value.equals("1")) {
			list = carDekhoService.searchAllCar();
		} else {
			list = carDekhoService.searchCarsByMake(value);
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
			
		request.setAttribute("list", list);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.exception.CarDekhoSystemException;
import com.cardekho.model.Vehicle;
import com.cardekho.service.CarDekhoService;

/**
 * @author Anjita
 * Servlet implementation class UserSearchResultController
 */
public class UserSearchResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 /**
     * Default constructor  
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchResultController() {
        super();
     }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int vehicleId = Integer.parseInt(request.getParameter("vehicleId"));
		CarDekhoService carDekhoService = new CarDekhoService();
		try {
			Vehicle vehicle = carDekhoService.getCarByVehicleId(vehicleId);
			request.setAttribute("vehicle", vehicle);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/CarSpecification.jsp");
			requestDispatcher.forward(request, response);
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

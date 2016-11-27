package com.metacampus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Exception.VehicleException;

import com.metacampus.model.Car;
import com.metacampus.model.Vehicle;
import com.metacampus.service.VehicleService;

/**
 * Servlet implementation class DetailPageController
 */
@WebServlet("/DetailPageController")
public class DetailPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetailPageController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "Detail.jsp";
		String vehicleId = request.getParameter("id");
		if (vehicleId != null) {
			Vehicle vehicle = new Car();

			int id = Integer.parseInt(vehicleId);
			vehicle.setVehicleId(id);
			VehicleService vehicleService = new VehicleService();
			try {
				vehicle = vehicleService.getVehicleById(vehicle);
			} catch (VehicleException e) {
				e.printStackTrace();
			}
			request.setAttribute("vechile", vehicle);
		}
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher(forwardUrl);
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

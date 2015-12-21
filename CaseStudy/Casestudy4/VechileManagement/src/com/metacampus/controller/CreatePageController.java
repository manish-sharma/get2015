package com.metacampus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Exception.VehicleException;

import com.metacampus.db.helper.VechileDBHelper;
import com.metacampus.model.Car;
import com.metacampus.model.Vehicle;
import com.metacampus.model.helper.VehicleHelper;
import com.metacampus.service.VehicleService;

/**
 * Servlet implementation class EditPageController
 */
@WebServlet("/CreatePageController")
public class CreatePageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreatePageController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
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
		RequestDispatcher rd = request.getRequestDispatcher("Create.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "";
		VehicleService vehicleService = new VehicleService();
		String vehicleId = request.getParameter("id");
		try {
			if (vehicleId != null) {
				Vehicle vehicle = null;

				vehicle = createCar(request, response);
				int id = Integer.parseInt(vehicleId);
				vehicle.setVehicleId(id);
				forwardUrl="DetailPageController?id="+id;
			
				vehicleService.updatesVehicle(vehicle);

			} else {
				Vehicle vehicle = createCar(request, response);

				vehicleService.createVehicle(vehicle);
				request.setAttribute("message", "Created Successfully");
				forwardUrl = "SearchPageController";

			}
		} catch (VehicleException e) {
		
			e.printStackTrace();
		}
		System.out.println("forUrl is"+forwardUrl);
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

	public Vehicle createCar(HttpServletRequest request,
			HttpServletResponse response) throws VehicleException {
		String make = request.getParameter("company");
		String model = request.getParameter("model");
		int engineInCC = Integer.parseInt(request.getParameter("engine"));
		int fuelCapacity = Integer.parseInt(request.getParameter("fuel"));
		int mileage = Integer.parseInt(request.getParameter("milage"));
		float price = Float.parseFloat(request.getParameter("showroomprice"));
		float roadTax = Float.parseFloat(request.getParameter("roadtax"));
		String features[] = request.getParameterValues("features");
		boolean ac = false;
		boolean powerSteering = false;
		String accessoryKit = "No";
		for (String value : features) {
			if (value.equalsIgnoreCase("Ac")) {
				ac = true;
				continue;
			}
			if (value.equalsIgnoreCase("PowerSteering")) {
				powerSteering = true;
				continue;
			}

		}
		String accessory[] = request.getParameterValues("Assessory_kit");
		if(accessory!=null)
		{		
		for (String value : accessory) {
			if (value.equalsIgnoreCase("yes"))
				accessoryKit = "Yes";

		}
		}
		Vehicle vehicle = VehicleHelper.createCar(make, model, engineInCC,
				fuelCapacity, mileage, price, roadTax, "nikhil", ac,
				powerSteering, accessoryKit);
		return vehicle;

	}
}

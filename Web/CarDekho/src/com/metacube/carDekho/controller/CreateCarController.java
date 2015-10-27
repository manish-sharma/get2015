package com.metacube.carDekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacube.carDekho.helper.CreateVehicle;
import com.metacube.carDekho.helper.VehicleHelper;
import com.metacube.carDekho.helper.VehicleJDBCHelper;
import com.metacube.carDekho.helper.VehicleType;
import com.metacube.carDekho.model.Car;
import com.metacube.carDekho.model.Vehicle;


/**
 * Servlet implementation class CreateCarController
 */
@WebServlet("/CreateCarController")
public class CreateCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		String type = request.getParameter("type");
		if(type.equals("create")) {
			String make = request.getParameter("make");
			String model = request.getParameter("model");
			int engineInCC = Integer.parseInt(request.getParameter("engineInCC"));
			int fuelCapacity = Integer.parseInt(request.getParameter("fuelCapacity"));
			int millage = Integer.parseInt(request.getParameter("millage"));
			int price = Integer.parseInt(request.getParameter("price"));
			int roadTax = Integer.parseInt(request.getParameter("roadTax"));
			boolean ac = Boolean.getBoolean(request.getParameter("ac"));
			boolean powerSteering = Boolean.getBoolean(request.getParameter("powerSteering"));
			String accessoryKit = request.getParameter("accessoryKit");
			String message = CreateVehicle.createVehicle(make, model, engineInCC, fuelCapacity, millage, price, roadTax, ac, powerSteering, accessoryKit);
			if(message.equals("success")) {
				requestDispatcher = request.getRequestDispatcher("Home.jsp");
				requestDispatcher.forward(request, response);
			} else {
				request.setAttribute("message", message);
				requestDispatcher = request.getRequestDispatcher("create.jsp");
				requestDispatcher.forward(request, response);
			}
		} else {
			Car car = createCar(request);
			int updated = VehicleJDBCHelper.update(car);
			if(updated == 1) {
				requestDispatcher = request.getRequestDispatcher("Home.jsp");
				requestDispatcher.forward(request, response);
			} else {
				requestDispatcher = request.getRequestDispatcher("error.jsp");
				requestDispatcher.forward(request, response);
			}
		} 
	}

	private static Car createCar(HttpServletRequest request) {
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		int engineInCC = Integer.parseInt(request.getParameter("engineInCC"));
		int fuelCapacity = Integer.parseInt(request.getParameter("fuelCapacity"));
		int millage = Integer.parseInt(request.getParameter("millage"));
		int price = Integer.parseInt(request.getParameter("price"));
		int roadTax = Integer.parseInt(request.getParameter("roadTax"));
		boolean ac = Boolean.getBoolean(request.getParameter("ac"));
		boolean powerSteering = Boolean.getBoolean(request.getParameter("powerSteering"));
		String accessoryKit = request.getParameter("accessoryKit");
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, make, model);
		Car car = VehicleHelper.createCar((Car)vehicle, engineInCC, fuelCapacity, millage, price, roadTax, ac, powerSteering, accessoryKit);
		return car;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

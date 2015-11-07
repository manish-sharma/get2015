package com.metacampus.vehiclemanagement.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacampus.vehiclemanagement.CarAlreadyExistsException;
import com.metacampus.vehiclemanagement.MetacampusException;
import com.metacampus.vehiclemanagement.helper.VehicleHelper;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.model.VehicleType;
import com.metacampus.vehiclemanagement.service.MetacampusService;

/**
 * Servlet implementation class createCar
 */
@WebServlet("/createCar")
public class createCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		System.out.println("inget id is "+id);
		if(id!=null)
		{  	MetacampusService service = new MetacampusService();
			int vehicleId=Integer.parseInt(id);
			List<Vehicle> vehicleList = new ArrayList<Vehicle>();
			Vehicle vehicle=new Car();
			vehicle.setId(vehicleId);
			try {
				vehicleList = service.searchVehicle(vehicle);
				System.out.println("inget"+vehicleList);
			} catch (MetacampusException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      		
			request.setAttribute("vehicleList",vehicleList);
		}	
		RequestDispatcher dispatcher = request.getRequestDispatcher("add-car.jsp");
		System.out.println("getend");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println("inpost1 id is "+id);
		Vehicle vehicle  = getVehicle(request);
		MetacampusService service = new MetacampusService();
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		System.out.println("inpost2 id is "+id);
		if(id != null) {
			vehicle.setId(Integer.parseInt(id));
			try {
				System.out.println("in update if");
				vehicleList = service.updateVehicle(vehicle);
			} catch (CarAlreadyExistsException e) {
				e.printStackTrace();
			} catch (MetacampusException e) {
				e.printStackTrace();
			}
			request.setAttribute("vehicleList", vehicleList);
		} 
		else {
			System.out.println("in create else");
			try {
				vehicleList = service.createVehicle(vehicle);
			} catch (CarAlreadyExistsException e) {
				e.printStackTrace();
			} catch (MetacampusException e) {
				e.printStackTrace();
			}
			request.setAttribute("vehicleList", vehicleList);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("carDetails.jsp");
		dispatcher.forward(request, response);
	}
	public Car getVehicle(HttpServletRequest request)
	{
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String engineInCC = request.getParameter("engineInCC");
		int fuelCapacity = Integer.parseInt(request.getParameter("fuelCapacity"));
		String mileage = request.getParameter("mileage");
		Float price = Float.parseFloat(request.getParameter("ex-showroom-price"));
		Float roadTax = Float.parseFloat(request.getParameter("roadTax"));
		boolean AC = false;
		boolean powerSteering = false;
		boolean accessoryKit = false;
		if(request.getParameter("AC").equals("Yes")) {
			AC = true;
		}
		if(request.getParameter("power-steering").equals("Yes")) {
			powerSteering = true;
		}
		if(request.getParameter("accessory-kit").equals("Yes")) {
			accessoryKit = true;
		}
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, "admin", new java.sql.Date(new java.util.Date().getTime()), make, model, engineInCC, fuelCapacity, mileage, price, roadTax);
		Car car = null;
		if(vehicle instanceof Car){
			car = VehicleHelper.createCar(vehicle, AC, powerSteering, accessoryKit);
		}
		System.out.println(car.toString());
		return car;
	}
}

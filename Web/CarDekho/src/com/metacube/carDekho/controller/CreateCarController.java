package com.metacube.carDekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacube.carDekho.CarDekhoException;
import com.metacube.carDekho.CarIsNotExistException;
import com.metacube.carDekho.ModelAlreadyExists;
import com.metacube.carDekho.db.helper.VehicleJDBCHelper;
import com.metacube.carDekho.factory.*;
import com.metacube.carDekho.helper.VehicleHelper;
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
		Car car = createCar(request);
		CarDekhoService service = new CarDekhoService();
		if(type.equals("create")) {
			try {
				Car createdCar = CarDekhoService.createCar(car);
			} catch (CarDekhoException | ModelAlreadyExists  e) {
				request.setAttribute("message", e.getMessage());
				requestDispatcher = request.getRequestDispatcher("create.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			requestDispatcher = request.getRequestDispatcher("Home.jsp");
			requestDispatcher.forward(request, response);
		} else {
			Car updated = null;
			try {
				updated = service.update(car);
			} catch (CarIsNotExistException
					| ModelAlreadyExists e) {
				request.setAttribute("message", e.getMessage());
				requestDispatcher = request.getRequestDispatcher("create.jsp");
				requestDispatcher.forward(request, response);
			}
			if(updated != null) {
				requestDispatcher = request.getRequestDispatcher("Home.jsp");
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
		Car car = VehicleFactory.createCar(make, model, engineInCC, fuelCapacity,
				millage, price, roadTax, ac, powerSteering, accessoryKit);
		return car;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

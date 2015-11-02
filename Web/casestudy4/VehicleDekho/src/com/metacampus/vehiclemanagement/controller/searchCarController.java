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
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.service.MetacampusService;

/**
 * Servlet implementation class searchCarController
 */
@WebServlet("/searchCarController")
public class searchCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchCarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MetacampusService service = new MetacampusService();
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		System.out.println("insearchcarcontroller");
		if(request.getParameter("form-type")!=null && request.getParameter("form-type").equalsIgnoreCase("bymodel")) {
			System.out.println("inmodel");
			Vehicle vehicle  = searchVehicle(request);
			System.out.println("incontroler"+vehicle.getMake() + vehicle.getModel());
			try {
				vehicleList = service.searchVehicle(vehicle);
			} catch (MetacampusException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(request.getParameter("form-type")!=null && request.getParameter("form-type").equalsIgnoreCase("bybudget")) {
			System.out.println("inbudget");
			String budgetValue = request.getParameter("budget");
			try {
				vehicleList = service.searchVehicle(budgetValue);
			} catch (MetacampusException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			Vehicle vehicle  = searchVehicle(request);
			System.out.println("incontroler"+vehicle.getMake() + vehicle.getModel());
			try {
				vehicleList = service.searchVehicle(vehicle);
			} catch (MetacampusException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(vehicleList.toString());
		request.setAttribute("vehicleList", vehicleList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("carDetails.jsp");
		dispatcher.forward(request, response);
		System.out.println(vehicleList.toString());
	}
	
	public Vehicle searchVehicle(HttpServletRequest request) {
		System.out.println("form type is: " + request.getParameter("form-type"));
		System.out.println("incontrolerfunction"+ request.getParameter("make"));
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		Vehicle vehicle = new Vehicle();
		vehicle.setMake(make);
		vehicle.setModel(model);
		return vehicle;
	}
}

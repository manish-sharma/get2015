package com.cardekho.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class UserSearchController
 */
public class UserSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * Default constructor
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarDekhoService carDekhoService = new CarDekhoService();
		List<Vehicle> vehicleList=null;
		try {
			vehicleList = carDekhoService.getVehicleBrands();
			request.setAttribute("brandList", vehicleList);
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/UserSearch.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vehicle> vehicleList = getVehicleList(request);
		request.setAttribute("vehicleList", vehicleList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/UserSearchResult.jsp");
		requestDispatcher.forward(request, response);
	}
	
	/**
	 * provides list of vehicles according to request
	 * @param request
	 * @return vehicleList 
	 */
	private List<Vehicle> getVehicleList(HttpServletRequest request){
		String selectedCatagory;
		String filter = null;
		List<Vehicle> vehicleList=null;
		CarDekhoService carDekhoService = new CarDekhoService();
		filter = request.getParameter("filter");
		try {
			if(filter!=null){
				if(filter.equals("byBudget")) {
					selectedCatagory=request.getParameter("budget");
					vehicleList = carDekhoService.getVehiclesByBudget(selectedCatagory);
				}
				else {
					selectedCatagory=request.getParameter("brand");
					vehicleList = carDekhoService.getVehiclesByBrand(selectedCatagory);
				}
			}
			else{
				vehicleList = carDekhoService.getAllVehicle();
			}
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
}


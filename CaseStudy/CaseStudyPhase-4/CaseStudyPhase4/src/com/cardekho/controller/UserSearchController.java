package com.cardekho.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.VehicleDBHelper;
import com.cardekho.model.Vehicle;

/**
 * Servlet implementation class UserSearchController
 */

@WebServlet("/UserSearchController")
public class UserSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
		List<Vehicle> vehicleList=null;
		try {
			vehicleList = vehicleDBHelper.getVehicleBrands();
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
	 * 
	 * @param request
	 * @return vehicleList 
	 */
	private List<Vehicle> getVehicleList(HttpServletRequest request){
		String selectedCatagory;
		String filter = null;
		List<Vehicle> vehicleList=null;
		VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
		filter = request.getParameter("filter");
		try {
			if(filter!=null){
				if(filter.equals("byBudget")) {
					selectedCatagory=request.getParameter("budget");
					vehicleList = vehicleDBHelper.getVehiclesByBudget(selectedCatagory);
				}
				else {
					selectedCatagory=request.getParameter("brand");
					vehicleList = vehicleDBHelper.getVehiclesByBrand(selectedCatagory);
				}
			}
			else{
				vehicleList = vehicleDBHelper.getAllVehicle();
			}
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
}


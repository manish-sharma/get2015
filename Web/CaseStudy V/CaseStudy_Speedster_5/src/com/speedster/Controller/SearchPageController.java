package com.speedster.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.speedster.db.helper.VehicleDAO;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.model.Vehicle;
import com.speedster.service.SpeedsterService;

/**
 * Servlet implementation class SearchPageController
 */
@WebServlet("/SearchPageController")
public class SearchPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SpeedsterService speedsterService = new SpeedsterService();
		List<Vehicle> vehicleList=null;
		try {
			vehicleList = speedsterService.getVehicleBrands();
			request.setAttribute("brandList", vehicleList);
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Searchpage.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vehicle> vehicleList = getVehicleList(request);
		request.setAttribute("vehicleList", vehicleList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SearchResult.jsp");
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
	    SpeedsterService speedsterService = new SpeedsterService();
		filter = request.getParameter("filter");
		try {
			if(filter!=null){
				if(filter.equals("byBudget")) {
					selectedCatagory=request.getParameter("budget");
					vehicleList = speedsterService.getVehiclesByBudget(selectedCatagory);
				}
				else {
					selectedCatagory=request.getParameter("brand");
					vehicleList = speedsterService.getVehiclesByBrand(selectedCatagory);
				}
			}
			else{
				vehicleList = speedsterService.getAllVehicle();
			}
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
}

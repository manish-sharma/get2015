package com.cardekho.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.model.Vehicle;
import com.cardekho.service.CarDekhoService;

/**
 * Servlet implementation class AdminSearchController
 */

@WebServlet("/AdminSearchController")
public class AdminSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSearchController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("userName")==null) {
			response.sendRedirect("/CaseStudyPhase4/view/Login.jsp");
		}
		else{
		
			CarDekhoService service = new CarDekhoService();
			List<Vehicle> vehicleList=null;
			try {
				vehicleList = service.getVehicleBrands();
				request.setAttribute("brandList", vehicleList);
			} catch (CarDekhoSystemException e) {
				e.printStackTrace();
			}
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/AdminSearch.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("userName")==null) {
			response.sendRedirect("/CaseStudyPhase4/view/Login.jsp");
		}
		else{
			List<Vehicle> vehicleList = getVehicleList(request);
			request.setAttribute("vehicleList", vehicleList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/AdminSearchResult.jsp");
			requestDispatcher.forward(request, response);
		}
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
	//	VehicleDBHelper vehicleDBHelper = new VehicleDBHelper();
		CarDekhoService service = new CarDekhoService();
		filter = request.getParameter("filter");
		try {
			if(filter!=null){
				if(filter.equals("byBudget")) {
					selectedCatagory=request.getParameter("budget");
					if(selectedCatagory == null) {
						return null;
					}		
					vehicleList = service.getVehicleByBudget(selectedCatagory);
				}
				else {
					selectedCatagory=request.getParameter("brand");
					vehicleList = service.getVehicleByBrand(selectedCatagory);
				}
			}
			else{
				vehicleList = service.getAllVehicles();
			}
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
}

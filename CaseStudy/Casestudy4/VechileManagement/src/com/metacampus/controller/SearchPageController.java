          package com.metacampus.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Exception.VehicleException;

import com.metacampus.model.Vehicle;
import com.metacampus.model.helper.VehicleHelper;
import com.metacampus.service.VehicleService;

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
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {

	RequestDispatcher requestDispatcher = request.getRequestDispatcher("Search.jsp");
	requestDispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	String forwardUrl = "List.jsp";
	String brand = request.getParameter("brand");
	String price = request.getParameter("budget");
	String result = VehicleHelper.search(brand, price);

	VehicleService vehicleService = new VehicleService();
	List<Vehicle> vehicleList = null;
	try {
	    vehicleList = vehicleService.SearchVehicle(result);
	    request.setAttribute("vechileLists", vehicleList);
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher(forwardUrl);
	    requestDispatcher.forward(request, response);
	} catch (VehicleException e) {
	    e.printStackTrace();
	}

    }
}

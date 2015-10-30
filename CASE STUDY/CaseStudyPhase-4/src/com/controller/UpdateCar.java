package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DatabaseQueries;
import com.model.vehicle;
import com.service.CarDekhoService;

/**
 * Servlet implementation class UpdateCar
 */
@WebServlet("/UpdateCar")
public class UpdateCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		vehicle newcar = CarDekhoService.searchCarById(id);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update-car.jsp");
		request.setAttribute("newObject", newcar);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String id = request.getParameter("id");
		System.out.println("amit" + id);
		int engine_cc = Integer.parseInt(request.getParameter("engine_cc"));
		int fuel_capacity= Integer.parseInt(request.getParameter("fuel_capacity"));
		int mileage= Integer.parseInt(request.getParameter("mileage"));
		int price= Integer.parseInt(request.getParameter("price"));
		int road_tax = Integer.parseInt(request.getParameter("road_tax"));
		int emi = Integer.parseInt(request.getParameter("emi"));
		vehicle newVehicle = new vehicle(make, model, engine_cc, fuel_capacity, mileage, price, road_tax, emi);
		boolean flag = CarDekhoService.updateCar(newVehicle,id);
		if(flag){
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("new-car.jsp");
			request.setAttribute("newObject", newVehicle);
			requestDispatcher.forward(request, response);
		}
	}

}

package com.controller;

import java.awt.List;
import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.database.DatabaseQueries;
import com.model.vehicle;
import com.service.CarDekhoService;

/**
 * Servlet implementation class AddNewCar
 */
@WebServlet("/AddNewCar")
public class AddNewCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		int engine_cc = Integer.parseInt(request.getParameter("engine_cc"));
		int fuel_capacity= Integer.parseInt(request.getParameter("fuel_capacity"));
		int mileage= Integer.parseInt(request.getParameter("mileage"));
		int price= Integer.parseInt(request.getParameter("price"));
		int road_tax = Integer.parseInt(request.getParameter("road_tax"));
		int emi = Integer.parseInt(request.getParameter("emi"));
		vehicle newVehicle = new vehicle(make, model, engine_cc, fuel_capacity, mileage, price, road_tax, emi);
		CarDekhoService carDekhoService = new CarDekhoService();
		boolean status = carDekhoService.insertUserIntoDatabase(newVehicle);
		if(status) {
			request.setAttribute("newObject", newVehicle);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("new-car.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			String error = "Please enter correct details";
			request.setAttribute("error_label", error);
			
		}
		
		
		
	}

}

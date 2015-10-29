package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.exception.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;
import com.cardekho.model.helper.ModelHelper;
import com.cardekho.service.CarDekhoService;

/**
 * @author Anjita
 * Servlet implementation class AdminEditController
 */
public class AdminEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * Default constructor
     * @see HttpServlet#HttpServlet()
     */
    public AdminEditController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("admin")==null) {
			response.sendRedirect("/CaseStudy5/view/Login.jsp");
		}
		else {
			int vehicleId = Integer.parseInt(request.getParameter("vehicleId"));
			CarDekhoService carDekhoService = new CarDekhoService();
			try {
				Vehicle vehicle = carDekhoService.getCarByVehicleId(vehicleId);
				request.setAttribute("vehicle", vehicle);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/AdminCarEdit.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("admin")==null) {
			response.sendRedirect("/CaseStudy5/view/Login.jsp");
		}
		else {
			String forwardUrl = "/UserSearchResultController";
			Car car = ModelHelper.createCar(request);
			CarDekhoService carDekhoService = new CarDekhoService();
			try {
				carDekhoService.update(car);
				request.setAttribute("message", "Updated Successfully");
			} catch (CarDekhoSystemException e) {
				System.out.println("Exception while updating car " + e.getMessage());
				forwardUrl = "/view/AdminCarEdit.jsp";
				request.setAttribute("message", e.getMessage());
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
			dispatcher.forward(request, response);
	
		}
	}
}

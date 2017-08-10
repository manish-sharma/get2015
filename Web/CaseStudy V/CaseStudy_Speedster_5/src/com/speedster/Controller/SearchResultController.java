package com.speedster.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.speedster.db.helper.CarDAO;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.model.Vehicle;
import com.speedster.service.SpeedsterService;

/**
 * Servlet implementation class SearchResultController
 */
@WebServlet("/SearchResultController")
public class SearchResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResultController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int vehicleId = Integer.parseInt(request.getParameter("vehicleId"));
		SpeedsterService speedsterService = new SpeedsterService();
		try {
			Vehicle vehicle = speedsterService.getCarByVehicleId(vehicleId);
			request.setAttribute("vehicle", vehicle);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/CarSpecification.jsp");
			requestDispatcher.forward(request, response);
		} catch (CarDekhoSystemException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

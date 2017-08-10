package com.speedster.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.speedster.db.helper.CarDAO;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.model.Car;
import com.speedster.model.Vehicle;
import com.speedster.model.helper.ModelHelper;
import com.speedster.service.SpeedsterService;

/**
 * Servlet implementation class AdminCarEdit
 */
@WebServlet("/AdminCarEdit")
public class AdminCarEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCarEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("currentSessionUser")==null) {
			response.sendRedirect("/login.jsp");
		}
		else {
			int vehicleId = Integer.parseInt(request.getParameter("vehicleId"));
			SpeedsterService speedsterService = new SpeedsterService();
			try {
				Vehicle vehicle = speedsterService.getCarByVehicleId(vehicleId);
				request.setAttribute("vehicle", vehicle);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/AdminCarEdit.jsp");
				requestDispatcher.forward(request, response);
			} catch (CarDekhoSystemException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("currentSessionUser")==null) {
			response.sendRedirect("/login.jsp");
		}
		else {
			String forwardUrl = "/SearchResultController";
			Car car = ModelHelper.createCar(request);
			System.out.println(request.getParameter("vehicleId"));
			car.setId(Integer.parseInt(request.getParameter("vehicleId")));
			request.setAttribute("car", car);
			SpeedsterService speedsterService = new SpeedsterService();
			try {
				speedsterService.update(car);
				System.out.println("car = = "+car);
				request.setAttribute("message", "Updated Successfully");
			} catch (CarDekhoSystemException e) {
				System.out.println("Exception while updating car " + e.getMessage());
				forwardUrl = "/AdminCarEdit.jsp";
				request.setAttribute("message", e.getMessage());
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
			dispatcher.forward(request, response);
	
		}
	}

}

package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;
import com.cardekho.model.helper.ModelHelper;
import com.cardekho.service.CarDekhoService;

/**
 * Servlet implementation class AdminEditController
 */
@WebServlet("/AdminEditController")
public class AdminEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("userName")==null) {
			response.sendRedirect("/CaseStudyPhase4/view/Login.jsp");
		}
		else {
			int vehicleId = Integer.parseInt(request.getParameter("vehicleId"));
			CarDekhoService service = new CarDekhoService();
		
			try {
			
				Vehicle vehicle = service.getCarByVehicleID(vehicleId);
				request.setAttribute("vehicle", vehicle);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/AdminCarEdit.jsp");
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
		if(session.getAttribute("userName")==null) {
			response.sendRedirect("/CaseStudyPhase4/view/Login.jsp");
		}
		else {
			String forwardUrl = "/UserSearchResultController";
			Car car = ModelHelper.createCar(request);
			car.setId(Integer.parseInt(request.getParameter("vehicleId")));
			request.setAttribute("car", car);
			CarDekhoService service = new CarDekhoService();
			
			try {
				service.update(car);
				System.out.println("car = = "+car);
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

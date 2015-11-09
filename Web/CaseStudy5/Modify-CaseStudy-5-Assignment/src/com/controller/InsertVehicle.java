package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







import javax.servlet.http.HttpSession;

import com.CarAlreadyExistsException;
import com.MetaHRMSystemException;
import com.metahrm.service.MetaHRMService;
import com.model.Car;

/**
 * Servlet implementation class InsertVehicle
 */
@WebServlet("/InsertVehicle")
public class InsertVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertVehicle() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("console.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "failure.jsp";
		Car car =null;
		String message = "";
		try {
			car =createCar(request);
			MetaHRMService service = new MetaHRMService();
			Car createdCar = service.createCar(car);
			message ="Car has been created Successfully of model "+createdCar.getModel();
			System.out.println(message);
			request.setAttribute("message",message);
			forwardUrl = "console.jsp";
		
		} catch (MetaHRMSystemException e) {
			System.out.println("Exception while creating car" + e.getMessage());
			forwardUrl = "failure.jsp";
			request.setAttribute("message", e.getMessage());
		} catch (CarAlreadyExistsException e) {
			message ="car already exists  with model "+car.getModel();
			System.out.println(message);
			forwardUrl = "failure.jsp";
			request.setAttribute("message",message);
		}
		request.getRequestDispatcher(forwardUrl).forward(request, response);
		
		 
	}
	
	
	
	private Car createCar(HttpServletRequest request)throws NumberFormatException ,NullPointerException {
		
		Car car = new Car();
		car.setMake(request.getParameter("make"));
		car.setModel(request.getParameter("model"));
		car.setEngineInCC(Double.parseDouble(request.getParameter("engineInCC")));
		car.setFuelCapacity(Double.parseDouble(request.getParameter("fuelCapacity")));
		car.setMilage(Double.parseDouble(request.getParameter("milage")));
		car.setPrice(Double.parseDouble(request.getParameter("price")));
		car.setRoadTax(Double.parseDouble(request.getParameter("roadTax")));
		HttpSession session =request.getSession(false);
		car.setCreatedBy((String) session.getAttribute("createdBy"));
		
		car.setHasAC(getIsAvailable(request.getParameter("hasAC")));
		car.setHasaccessoryKit(getIsAvailable(request.getParameter("hasaccessoryKit")));
		car.setPowerSteering(getIsAvailable(request.getParameter("powerSteering")));
		car.setCreatedTime(Calendar.getInstance().getTime());
		return car;
	}
	
	private boolean getIsAvailable(String input) {
		if(input == null )
			return false;
		return true;
	}

}

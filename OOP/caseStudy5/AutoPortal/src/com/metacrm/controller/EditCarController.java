package com.metacrm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;
import com.metacrm.service.MetaCRMService;


/**
 * Servlet implementation class EditCarController
 */
@WebServlet("/EditCarController")
public class EditCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCarController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//redirects to edit jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
		HttpSession session=request.getSession();
		Car objCar=(Car)session.getAttribute("objOfCar");
		request.setAttribute("objOfCar", objCar);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "";
		String oldMake = request.getParameter("oldMake");
		String oldModel = request.getParameter("oldModel");	
		Car objCar = createCar(request);
		MetaCRMService service = new MetaCRMService();
		try {
			if(service.editCar(objCar,oldMake,oldModel)>0){
				//creates a session object if not created
				HttpSession session = request.getSession(false);
				//sets the object of the updated car in session attribute
				session.setAttribute("objOfCar", objCar);
				forwardUrl = "details.jsp";
			}else
			{
				//if the car details are not edited than user remains on same page and message is displayed
				request.setAttribute("message", "Could not Edit Car details, Please enter again");
				forwardUrl = "edit.jsp";
			}
		} catch (MetaCRMSystemException e) {
			forwardUrl = "edit.jsp";
			request.setAttribute("message", 
					 e.getMessage() );
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

	// object is created of car model class
	private Car createCar(HttpServletRequest request) throws IOException,
			ServletException {
		Car objCar = new Car();
		objCar.setMake(request.getParameter("make"));
		objCar.setModel(request.getParameter("model"));
		objCar.setAC(Boolean.parseBoolean(request
				.getParameter("ac")));
		objCar.setPowerSteering(Boolean.parseBoolean(request
				.getParameter("powerSteering")));
		objCar.setAccessoryKit(Boolean.parseBoolean(request
				.getParameter("accessoryKit")));
		objCar.setEngineInCC(request.getParameter("engineIncc"));
		objCar.setFuelCapacity(Double.parseDouble(request
				.getParameter("fuelCapacity")));
		objCar.setMilage(Double.parseDouble(request.getParameter("milage")));
		objCar.setPrice(Double.parseDouble(request.getParameter("price")));
		objCar.setRoadTax(Double.parseDouble(request.getParameter("roadTax")));
		objCar.setImagePath("images/"+request.getParameter("uploadPhoto"));
		
		return objCar;
	}

}

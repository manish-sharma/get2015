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
		// redirects to edit jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
		HttpSession session = request.getSession();
		Car objCar = (Car) session.getAttribute("objOfCar");
		String type=request.getParameter("type");
		if(type == "create"){
			objCar = null;
		}
		
		if (objCar == null) {
			request.setAttribute("objOfCar", null);
		} else {
			request.setAttribute("objOfCar", objCar);
		}
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String forwardUrl = "";
		int id = Integer.parseInt(request.getParameter("id"));
		Car objCar = createCar(request);
		MetaCRMService service = new MetaCRMService();
		try {
			if (id == 0) {
				if (service.createCar(objCar) > 0) {
					// if more than zero rows are affected than the updated car
					// object is set and forwarded to details.jsp
					request.setAttribute("objOfCar", objCar);
					forwardUrl = "details.jsp";
				} else {
					// if car not updated than remains at same page and error
					// message is displayed
					forwardUrl = "edit.jsp";
					request.setAttribute("message", "Enter correct values");
				}
			} else {
				if (service.editCar(objCar, id) > 0) {
					// creates a session object if not created
					HttpSession session = request.getSession(false);
					// sets the object of the updated car in session attribute
					request.setAttribute("objOfCar", objCar);
					forwardUrl = "details.jsp";
				} else {
					// if the car details are not edited than user remains on
					// same
					// page and message is displayed
					request.setAttribute("message",
							"Could not Edit Car details, Please enter again");
					forwardUrl = "edit.jsp";
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
			dispatcher.forward(request, response);
		} catch (MetaCRMSystemException e) {
			forwardUrl = "edit.jsp";
			request.setAttribute("message", e.getMessage());
		}
	}

	// object is created of car model class
	private Car createCar(HttpServletRequest request) throws IOException,
			ServletException {
		Car objCar = new Car();
		objCar.setId(Integer.parseInt(request.getParameter("id")));
		objCar.setMake(request.getParameter("make"));
		objCar.setModel(request.getParameter("model"));
		objCar.setAC(Boolean.parseBoolean(request.getParameter("ac")));
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
		objCar.setImagePath("images/" + request.getParameter("uploadPhoto"));

		return objCar;
	}

}

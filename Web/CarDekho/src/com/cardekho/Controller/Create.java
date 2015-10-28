package com.cardekho.Controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.CarDBHelper;
import com.cardekho.model.Car;

/**
 * Servlet implementation class Create
 * @author Ankur
 * @since 26 october 2015
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession(false).getAttribute("user") == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}
	
		String forwardUrl = "create.jsp";
		Car car = createCar(request);
		request.setAttribute("car", car);
		CarDBHelper carDBHelper = new CarDBHelper();
		try {
			if(request.getParameter("type").equals("create")) {
				carDBHelper.create(car);
				request.setAttribute("msg", "Car created successfully");
			}
			else if(request.getParameter("type").equals("update")) {
				System.out.println(request.getParameter("id"));
				carDBHelper.updateByModel(car, Integer.parseInt(request.getParameter("id")));
				request.setAttribute("msg", "Car Updated successfully");
			}
			//forwardUrl = "FullSpecification?model="+car.getModel();
			
		} catch (CarDekhoSystemException e) {
			System.out.println("Exception while creating car " + e.getMessage());
			//forwardUrl = "";
			request.setAttribute("msg", e.getMessage());
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}
	
	private Car createCar(HttpServletRequest request) {
		Car car = new Car();
		car.setMake(request.getParameter("make"));
		car.setModel(request.getParameter("model"));
		car.setEngineCC(request.getParameter("engineCC"));
		car.setFuelCapacity(request.getParameter("fuelCapacity"));
		car.setMileage(request.getParameter("mileage"));
		car.setPrice(Integer.parseInt(request.getParameter("price")));
		car.setRoadTax(Integer.parseInt(request.getParameter("roadTax")));
		car.setAC(request.getParameter("ac"));
		car.setPowerSteering(request.getParameter("powerSteering"));
		car.setAccessoryKit(request.getParameter("accessoryKit"));
		car.setCreatedBy((String)request.getSession().getAttribute("user"));
		if(((String)request.getParameter("type")).equals("create"))
			car.setCreatedTime(Calendar.getInstance().getTime());
		car.setLastModifiedTime(Calendar.getInstance().getTime());
		car.setImagePath(request.getParameter("carimage"));
		return car;
	}
}

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
import com.cardekho.model.Car;
import com.cardekho.service.CarDekhoService;

/**
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Create() 
	{
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("parul");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/* if user is not logged in then send him to login.jsp page */
		if(request.getSession(false).getAttribute("user") == null) 
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}

		String forwardUrl = "create.jsp";

		/* Creating car object */
		Car car = createCar(request);
		
		CarDekhoService service = new CarDekhoService();
		
		try 
		{	
			/* if create request arrives then transfer control to create method of CarDBHelper */
			if(request.getParameter("type").equals("create")) 
			{
				/* this code will be executed when same model appears again */
				if(service.createCar(car))
				{
					request.setAttribute("msg", "Model Already Exists");
				}
				else
				{
					request.setAttribute("msg", "Car created successfully");
				}
			}

			/* if create request arrives then transfer control to updateByModel method of CarDBHelper */
			else if(request.getParameter("type").equals("update")) 
			{
				service.updateByModel(car, Integer.parseInt(request.getParameter("id")));
				request.setAttribute("msg", "Car Updated successfully");
			}

		} 
		catch (CarDekhoSystemException e) 
		{
			System.out.println("Exception while creating car " + e.getMessage());
			request.setAttribute("msg", e.getMessage());
		}

		/* Forwarding request to create.jsp page again */ 
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

	/** private method to create object of car according the form attributes */
	private Car createCar(HttpServletRequest request) 
	{
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
		{
			car.setCreatedTime(Calendar.getInstance().getTime());
		}
		
		car.setLastModifiedTime(Calendar.getInstance().getTime());
		car.setImagePath(request.getParameter("carimage"));
		return car;
	}
}

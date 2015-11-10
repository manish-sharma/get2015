package com.cardekho.Controller;

import java.io.IOException;

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
 * Servlet implementation class UpdateCar
 */
@WebServlet("/UpdateCar")
public class UpdateCar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateCar() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher requestDispatcher ;

		/* id user is not logged in then forward to login.jsp */
		if(request.getSession(false).getAttribute("user") == null) 
		{
			requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}

		/* getting id from request */
		int id = Integer.parseInt(request.getParameter("id"));
		CarDekhoService service = new CarDekhoService();
		try 
		{
			/* getting car details based on id */
			Car car = service.getCarDetails(id);
			request.setAttribute("Vehicle", car);
			request.setAttribute("id", id);

			/* forwarding to Create servlet that will forward to create.jsp */
			requestDispatcher = request.getRequestDispatcher("Create");
			requestDispatcher.forward(request, response); 
		}
		catch (CarDekhoSystemException e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}

package com.cardekho.Controller;

import java.io.IOException;

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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher ;

		/* id user is not logged in then forward to login.jsp */
		if(request.getSession(false).getAttribute("user") == null) 
		{
			requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}

		/* getting id from request */
		int id = Integer.parseInt(request.getParameter("id"));
		CarDBHelper carDBHelper = new CarDBHelper();
		try 
		{
			/* getting car details based on id */
			Car car = carDBHelper.getCarDetails(id);
			request.setAttribute("Vehicle", car);
			request.setAttribute("id", id);

			/* forwarding to Create servlet that will forward to create.jsp */
			requestDispatcher = request.getRequestDispatcher("Create");
			requestDispatcher.forward(request, response); 
		}
		catch (CarDekhoSystemException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.model.Vehicle;
import com.cardekho.service.CarDekhoService;
/**
 * Servlet implementation class FullSpecification
 */
@WebServlet("/FullSpecification")
public class FullSpecification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FullSpecification() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/* initializing object of request dispatcher */ 
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("fullSpecification.jsp");
		CarDekhoService service = new CarDekhoService();
		try
		{
			int id = Integer.parseInt(request.getParameter("id"));
			/* getting details of car based on id */
			Vehicle vehicle = service.getCarDetails(Integer.parseInt(request.getParameter("id")));
			if(vehicle != null)
			{
				/* if car is found then transfer to fullSpecification.jsp */
				request.setAttribute("Vehicle", vehicle);
				System.out.println("Hello");
			}
			else
			{
				request.setAttribute("message", "No car Found");
				requestDispatcher = request.getRequestDispatcher("Search");
			}
			requestDispatcher.forward(request, response);
		}
		catch(NumberFormatException e) {
			response.sendRedirect("Search");
		}
		catch (CarDekhoSystemException e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

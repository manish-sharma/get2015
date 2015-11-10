package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;

import com.cardekho.service.CarDekhoService;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/* code to forward to search.jsp */
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
		CarDekhoService service = new CarDekhoService();
		try 
		{
			request.setAttribute("carList", service.populateList());
		}
		catch (CarDekhoSystemException e) 
		{
			System.out.println("Cannot Show the list of cars ["+e.getMessage()+" ]");
		}
		
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher requestDispatcher = null;
		CarDekhoService service = new CarDekhoService();
		
		try 
		{
			if(request.getParameter("budgetBrand").equals("brand")) {
				String makeModel = request.getParameter("selectCarBrand");
				String make = makeModel.substring(0, makeModel.indexOf('-'));
				String model = makeModel.substring(makeModel.indexOf('-')+1, makeModel.length());
				request.setAttribute("vehicleList", service.searchCar(make, model));
				
				}
				else if(request.getParameter("budgetBrand").equals("budget")) {
				String budget = request.getParameter("selectCarBudget");
				int minBudget = Integer.parseInt(budget.substring(0, budget.indexOf('-')));
				int maxBudget = Integer.parseInt(budget.substring(budget.indexOf('-')+1, budget.length()));
				request.setAttribute("vehicleList", service.searchCarByBudget(minBudget, maxBudget));
				
				}
			
		} 
		catch (CarDekhoSystemException e) 
		{
			System.out.println("Cannot Show the Result ["+e.getMessage()+" ]");
			requestDispatcher = request.getRequestDispatcher("search.jsp");
		}
		requestDispatcher = request.getRequestDispatcher("searchResult.jsp");
		requestDispatcher.forward(request, response);
	}

}

package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DatabaseQueries;
import com.model.vehicle;
import com.service.CarDekhoService;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> makes = CarDekhoService.searchMakes();
		List<String> models = CarDekhoService.searchModels();
		int minPrice = CarDekhoService.findMinPrice();
		int maxPrice = CarDekhoService.findMaxPrice();
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
		request.setAttribute("makes", makes);
		request.setAttribute("model", models);
		request.setAttribute("minPrice", minPrice);
		request.setAttribute("maxPrice", maxPrice);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String make =  request.getParameter("make");
		String model = request.getParameter("model");
		int minPrice = CarDekhoService.findMinPrice();
		int maxPrice = CarDekhoService.findMaxPrice();
		
		
		
		vehicle newcar = CarDekhoService.searchCarByMakeAndModel(make, model);
		if(newcar == null){
			String message = "There is no car with such make and model";
			request.setAttribute("message", message);
			List<String> makes = CarDekhoService.searchMakes();
			List<String> models = CarDekhoService.searchModels();
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
			request.setAttribute("makes", makes);
			request.setAttribute("model", models);
			request.setAttribute("minPrice", minPrice);
			request.setAttribute("maxPrice", maxPrice);
			requestDispatcher.forward(request, response);
			
		}
		else{
			request.setAttribute("newObject",newcar);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("new-car.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}

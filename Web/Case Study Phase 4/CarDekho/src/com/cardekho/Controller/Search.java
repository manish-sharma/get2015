package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cardekho.CarDekhoSystemException;
import com.cardekho.db.helper.SearchDBHelper;
import com.cardekho.model.Vehicle;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/* code to forward to search.jsp */
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		try {
			request.setAttribute("carList", searchDBHelper.populateList());
		} catch (CarDekhoSystemException e) {
			System.out.println("Cannot Show the list of cars ["+e.getMessage()+" ]");
		}
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		SearchDBHelper searchDBHelper = new SearchDBHelper();
		String makeModel = request.getParameter("selectCar");
		String make = makeModel.substring(0, makeModel.indexOf('-'));
		String model = makeModel.substring(makeModel.indexOf('-')+1, makeModel.length());
		try {
			/* searching car based on make and model */
			request.setAttribute("vehicleList", searchDBHelper.searchCar(make, model));
			/* forwarding to searchResult.jsp */
			requestDispatcher = request.getRequestDispatcher("searchResult.jsp");
			
		} catch (CarDekhoSystemException e) {
			System.out.println("Cannot Show the Result ["+e.getMessage()+" ]");
			requestDispatcher = request.getRequestDispatcher("search.jsp");
		}
		requestDispatcher.forward(request, response);
	}

}

package com.metacrm.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;
import com.metacrm.service.MetaCRMService;

/**
 * Servlet implementation class SearchCarController
 */
@WebServlet("/SearchCarController")
public class SearchCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String value = request.getParameter("search");
		ArrayList<Car> carList = null;
		MetaCRMService service= new MetaCRMService();
		try {
			//returns the list of cars returned by the search query
			carList = service.searchCar(make, model, value);
		} catch (MetaCRMSystemException e) {
			try {
				throw new MetaCRMSystemException("Could not search Car, ["
						+ e.getMessage() + "]");
			} catch (MetaCRMSystemException e1) {
				e1.printStackTrace();
			}
		}
		request.setAttribute("carList", carList);
		RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
		rd.forward(request, response);
	}

}

package com.metacrm.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacrm.db.helper.SearchDBHelper;
import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;
import com.metacrm.service.MetaCRMService;

/**
 * Servlet implementation class DetailsCarController
 */
@WebServlet("/DetailsCarController")
public class DetailsCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsCarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		ArrayList<Car> carList = null;
		MetaCRMService service = new MetaCRMService();
		try {
			carList = service.carDetails(make, model);
		} catch (MetaCRMSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("objOfCar", carList.get(0));
		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

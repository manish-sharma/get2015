package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exception.CarDekhoSystemException;
import com.helper.DBHelper;
import com.model.Car;
import com.service.CarDekhoService;

/**
 * Servlet implementation class CarList
 */
@WebServlet("/CarList")
public class CarList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String forwardURL = "";
		List<Car>  list =new ArrayList<Car>();
		Car car;
		try{
		   CarDekhoService carDekhoService = new CarDekhoService();
		   car = carDekhoService.searchById(id);
		request.setAttribute("vehicle", car);
		forwardURL = "carDetail.jsp";
		}catch(CarDekhoSystemException e){
			forwardURL = "AdminSearch.jsp";
			request.setAttribute("message", e.getMessage());
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(forwardURL);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

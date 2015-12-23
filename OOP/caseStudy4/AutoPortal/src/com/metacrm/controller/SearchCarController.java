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
		try {
			if(value.equals("brand")){
				carList = SearchDBHelper.getDetailsByBrand(make, model);
			}
			else if(value.equals("budget")){
				carList = SearchDBHelper.getDetailsByBudget(make, model);
			}
		} catch (MetaCRMSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("carList", carList);
		RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
		rd.forward(request, response);
	}

}

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
import com.model.Vehicle;
import com.service.CarDekhoService;

/**
 * Servlet implementation class AdminSearchController
 */
@WebServlet("/AdminSearchController")
public class AdminSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vehicle>  list =new ArrayList<Vehicle>();
		boolean flag = true;
		String forwardURL  = "";
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String error="";
		if(request.getParameter("make") == "")
		{  
			error="make is not entered<br>";
			flag=false;
		} 
		
		else if(request.getParameter("model")== "") 
		{
			error="model not entered<br>";
		    flag=false;
		}
		if(flag){
			try{
				   CarDekhoService carDekhoService = new CarDekhoService();
		    list = carDekhoService.searchByMakeAndModel(make,model);
			request.setAttribute("list", list);
			forwardURL = "SearchSuccess.jsp";  
	       			
		}catch(CarDekhoSystemException e){
			forwardURL = "AdminSearch.jsp";
			request.setAttribute("message", e.getMessage());
		}
		}
		else{
			
			request.setAttribute("message",error );
	    	forwardURL = "AdminSearch.jsp";   
		}
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher(forwardURL);  
	        requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

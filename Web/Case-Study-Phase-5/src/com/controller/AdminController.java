package com.controller;

import java.io.IOException;
import java.sql.Timestamp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.exception.CarDekhoSystemException;
import com.helper.VehicleHelper;
import com.model.Car;
import com.model.Vehicle;
import com.service.CarDekhoService;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardURL= "";
		if(request.getParameter("CreateCar") != null){
			
			request.setAttribute("vehicle", null);
			forwardURL = "AdminCreate.jsp";
		}
		else if(request.getParameter("SearchCar") != null){
			
			forwardURL = "AdminSearch.jsp";
				}
		else{
			int id = Integer.parseInt(request.getParameter("id"));
			Car car;
			try{
			   CarDekhoService carDekhoService = new CarDekhoService();
			   car = carDekhoService.searchById(id);
				request.setAttribute("vehicle", car);
				request.setAttribute("id", id);
				forwardURL = "AdminCreate.jsp";
			}catch(CarDekhoSystemException e){
				forwardURL = "AdminSearch.jsp";
				request.setAttribute("message", e.getMessage());
			}
		}
		
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher(forwardURL);  
        requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag = true;
		String forwardURL = "";
		String ac = request.getParameter("AC");
		String powerSteering = request.getParameter("powerSteering");
				
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
		else if(request.getParameter("millage")== "") 
		{
			error="millage not entered<br>";
		    flag=false;
		}
		
		else if(request.getParameter("engineInCC") == "" )
		{
			error="engineInCC not entered  <br>";
		     flag=false;
		}
		
		else if(request.getParameter("FuelCapacity") == "") 
		{  
			error="FuelCapacity not entered<br>";
			flag=false;
		}
		
		else if(request.getParameter("price") == "")
		{ 
			error="price  not entered<br>";
			flag=false;
		}else if(request.getParameter("roadTax") == "") { 
			error="roadTax  not entered<br>";
			flag=false;
		}
		else if(!(ac.equalsIgnoreCase("true") || ac.equalsIgnoreCase("false")))
		{
			error="Enter AC is provided or not<br>";
			flag=false;
		}else if(!(powerSteering.equalsIgnoreCase("true") || powerSteering.equalsIgnoreCase("false")))
		{
			error="Enter powerSteering is provided or not<br>";
			flag=false;
		}
		else if( request.getParameter("accessoryKit") == "")
		{
			error="accessoryKit is not entered<br>";
		   flag=false;	
		}
		 if(flag){
			   
				String make = request.getParameter("make");
				String model = request.getParameter("model");
				
				int millage = Integer.parseInt(request.getParameter("millage"));
				int engineInCC = Integer.parseInt(request.getParameter("engineInCC"));
				int FuelCapacity = Integer.parseInt(request.getParameter("FuelCapacity"));
				long price = Long.parseLong(request.getParameter("price"));
				int roadTax = Integer.parseInt(request.getParameter("roadTax"));
				boolean AC = Boolean.parseBoolean(request.getParameter("AC"));
				boolean PowerSteering = Boolean.parseBoolean(request.getParameter("powerSteering"));
				String accessoryKit = request.getParameter("accessoryKit");
				Car car=(Car) VehicleHelper.createVehicle(make, model);
				 java.util.Date today = new java.util.Date();
				 Timestamp date = new java.sql.Timestamp(today.getTime());
				 Vehicle vehicle = VehicleHelper.createCar(car,0, make, date, model, engineInCC, FuelCapacity, millage, price, roadTax, AC, PowerSteering,accessoryKit);
				 if(request.getParameter("type").equals("create")) {
					 try{
				 
					 CarDekhoService carDekhoService = new CarDekhoService();
					   Vehicle vehicle2 = carDekhoService.createVehicle(vehicle, car);
						

				if(vehicle2 != null) {
					
					request.setAttribute("message","Created Successfully" );
			    	forwardURL = "AdminSearch.jsp";  
				}else{
					
			request.setAttribute("message",error );
	    	 forwardURL = "AdminCreate.jsp";  
		}
	 }catch(CarDekhoSystemException e){
			forwardURL = "AdminCreate.jsp";
			request.setAttribute("message", e.getMessage());
		}
		}
		 if(request.getParameter("type").equals("update")) {
			 try{
			 CarDekhoService carDekhoService = new CarDekhoService();
			int  isInserted=carDekhoService.updateByModel(vehicle, car,Integer.parseInt(request.getParameter("id")));
			forwardURL = "AdminSearch.jsp";
				request.setAttribute("message", "Car Updated successfully");
				
			}catch(CarDekhoSystemException e){
				forwardURL = "AdminCreate.jsp";
				request.setAttribute("message", e.getMessage());
			}
		 }
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher(forwardURL);  
	        requestDispatcher.forward(request, response);
	}

}
}

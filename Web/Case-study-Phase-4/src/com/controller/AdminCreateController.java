package com.controller;

import java.io.IOException;
import java.sql.Timestamp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.helper.*;
import com.model.Car;
import com.model.Vehicle;


/**
 * Servlet implementation class AdminCreateController
 */
@WebServlet("/AdminCreateController")
public class AdminCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean flag = true;
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
						int isInserted = DBHelper.addInformation(vehicle,car);

				if(isInserted == 1) {
					
					request.setAttribute("msg","Created Successfully" );
			    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("CreateSuccess.jsp");  
			        requestDispatcher.forward(request, response); 
		}
		
				else{
					
			request.setAttribute("msg",error );
	    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("CreateError.jsp");  
	        requestDispatcher.forward(request, response);  
		}
				 }
		 if(request.getParameter("type").equals("update")) {
			int  isInserted1=DBHelper.updateByModel(vehicle, car,Integer.parseInt(request.getParameter("id")));
				request.setAttribute("msg", "Car Updated successfully");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("AdminHomePage.jsp");  
		        requestDispatcher.forward(request, response);
			}
		 }
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

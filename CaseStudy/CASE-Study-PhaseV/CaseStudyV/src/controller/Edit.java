/**
 * Servlet implementation class Edit for editing car
 * @author Banwari Kevat
 */
package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CarService;
import model.Car;
public class Edit extends HttpServlet {
	public void doPost( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		    
		     String createdBy ="admin";
		 
		     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		     //get current date time with Date()
		     Date date = new Date();
		     String createdTime =  dateFormat.format(date);
		     String make = request.getParameter("make");
			 String model = request.getParameter("model");
			 String enginInCC = request.getParameter("engincc");
			 String fuelCapacity = request.getParameter("capacity");
			 String milage = request.getParameter("engincc") ;
			 String price = request.getParameter("price");
			 String roadTax = request.getParameter("roadtax");
		     String ac = request.getParameter("ac");
	     	 String powerSteering =request.getParameter("powersteering");
		     String accessoryKit = request.getParameter("accesorykit");
		     
		     
		     Car car = new Car();
		     car.setCreatedBy(createdBy);
		     car.setCreatedTime(createdTime);
		     car.setMake(make);
		     car.setModel(model);
		     car.setEnginInCC(enginInCC);
		     car.setFuelCapacity(fuelCapacity);
		     car.setMilage(milage);
		     car.setPrice(price);
		     car.setRoadTax(roadTax);
		     car.setAc(ac);
		     car.setPowerSteering(powerSteering);
		     car.setAccessoryKit(accessoryKit);
		     String message = CarService.editCar(car);
		     
		    request.setAttribute("message", message);
			RequestDispatcher rd=request.getRequestDispatcher("view/admin/edit.jsp?model="+model);  
			rd.forward(request, response);
		     
		     
	}
		
}
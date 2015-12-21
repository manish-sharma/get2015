package com.cardekho.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;


public class ModelHelper {
	private static List<Vehicle> vehicleList;;
	
	/**
	 * @param resultset that contains vehicle information
	 * @return vehicleList List of Vehicles
	 */
	public static List<Vehicle> createVehicleList(ResultSet resultSet ) {
		vehicleList=null;
		try {
			while (resultSet.next()) {
				if(vehicleList==null) {
					vehicleList = new LinkedList<Vehicle>();
				}
				Car car = new Car();
				car.setId(resultSet.getInt(1));
				car.setMake(resultSet.getString(2));
				car.setModel(resultSet.getString(3));
				car.setPrice(resultSet.getDouble(4));
				car.setImageUrl(resultSet.getString(5));
				vehicleList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
	
	/**
	 * @param resultset that contains vehicle make or company name
	 * @return vehicleList List of Vehicles
	 */
	public static List<Vehicle> makeVehicleList(ResultSet resultSet ) {
		vehicleList = null;
		try {
			while (resultSet.next()) {
				if(vehicleList==null) {
					vehicleList = new LinkedList<Vehicle>();
				}
				Car car = new Car();
				car.setMake(resultSet.getString(1));
				vehicleList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}
	
	/**
	 * 
	 * @param request
	 * @return Car Object
	 */
	public static Car createCar(HttpServletRequest request){
		double price;
		double roadTax;
		double onRoadPrice;
		Car car = new Car();
		car.setMake(request.getParameter("make"));
		car.setModel(request.getParameter("model"));
		car.setEngineInCC(Integer.parseInt(request.getParameter("engineInCc")));
		car.setFuelCapacity(Integer.parseInt(request.getParameter("fuelCapacity")));
		car.setMilage(Integer.parseInt(request.getParameter("mileage")));
		price=Double.parseDouble(request.getParameter("price"));
		car.setPrice(price);
		roadTax = price*0.05;
		onRoadPrice = price+roadTax;
		car.setRoadTax(roadTax);
		car.setOnRoadPrice(onRoadPrice);
		car.setAc(request.getParameter("ac"));
		car.setPowerSteering(request.getParameter("powerSteering"));
		car.setAccessoryKit(request.getParameter("accessorykit"));
		car.setCreatedBy("Admin");
		car.setCreatedTime(Calendar.getInstance().getTime());
		car.setImageUrl(request.getParameter("imageUrl"));
		return car;
	}
	
	/**
	 * 
	 * @param resultSet
	 * @return Vehicle object
	 */
	public static Vehicle createCar(ResultSet resultSet) {
		Car car = null;
		try {
			while (resultSet.next()) {
				car = new Car();
				car.setId(resultSet.getInt(1));
				car.setMake(resultSet.getString(2));
				car.setModel(resultSet.getString(3));
				car.setEngineInCC(resultSet.getInt(4));
				car.setFuelCapacity(resultSet.getInt(5));
				car.setMilage(resultSet.getInt(6));
				car.setPrice(resultSet.getDouble(7));
				car.setRoadTax(resultSet.getDouble(8));
				car.setOnRoadPrice(resultSet.getDouble(9));
				car.setImageUrl(resultSet.getString(10));
				car.setAc(resultSet.getString(11));
				car.setPowerSteering(resultSet.getString(12));
				car.setAccessoryKit(resultSet.getString(13));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return car;
	}
}

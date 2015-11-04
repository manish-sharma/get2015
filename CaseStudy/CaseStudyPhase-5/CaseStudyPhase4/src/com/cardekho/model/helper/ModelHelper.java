package com.cardekho.model.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.cardekho.model.Car;
import com.cardekho.model.Vehicle;

public class ModelHelper 
{
	private static List<Vehicle> vehicleList;
	public static Car createCar(HttpServletRequest request)
	{
		
		double price;
		double onRoadPrice;
		double roadTax;
		
		Car car = new Car();
		car.setMake(request.getParameter("make"));
		car.setModel(request.getParameter("model"));
		car.setEngineInCC(Integer.parseInt(request.getParameter("engineInCC")));
		car.setMilage(Integer.parseInt(request.getParameter("milage")));
		car.setFuelCapacity(Integer.parseInt(request.getParameter("fuelCapacity")));
		car.setAc(request.getParameter("ac"));
		car.setAccessoryKit(request.getParameter("accessorykit"));
		car.setPowerSteering(request.getParameter("powerSteering"));
		
		price = Double.parseDouble(request.getParameter("price"));
		roadTax = .5 * price;
		onRoadPrice = price + roadTax;
		
		car.setOnRoadPrice(onRoadPrice);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		
		car.setCreatedBy("Admin");
		car.setCreatedTime(Calendar.getInstance().getTime());
		
		
		return car;
		
		
		
	}
	
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
				car.setAc(resultSet.getString(10));
				car.setPowerSteering(resultSet.getString(11));
				car.setAccessoryKit(resultSet.getString(12));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return car;
	}

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
				vehicleList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vehicleList;
	}

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

}

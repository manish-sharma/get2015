package com.metacampus.vehiclemanagement.helper;

import com.metacampus.vehiclemanagement.Bike;
import com.metacampus.vehiclemanagement.Car;
import com.metacampus.vehiclemanagement.Vehicle;
/**
 * Vehicle Helper class which is used to create Vehicle object and calls setter function for every attribute
 * @author Riddhi
 *
 */
public class VehicleHelper {

	public static Vehicle createVehicle(String vehicleType, String model,
			String make) {
		
		Vehicle vehicle;
		
		if (vehicleType.equals("Car")) {     //Creates a Car class object is it is of car type
			vehicle = new Car();
			vehicle.setMake(make);
			vehicle.setModel(model);
		} else {                                 
			vehicle = new Bike();            //Creates a Bike class object is it is of Bike type
			vehicle.setMake(make);
			vehicle.setModel(model);
		}
		
		return vehicle;                     //return vehicle object

	}
}

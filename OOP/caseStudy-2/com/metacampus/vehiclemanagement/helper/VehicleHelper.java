package com.metacampus.vehiclemanagement.helper;

import com.metacampus.vehiclemanagement.Bike;
import com.metacampus.vehiclemanagement.Car;
import com.metacampus.vehiclemanagement.Vehicle;
import com.metacampus.vehiclemanagement.VehicleType;

/**
 * Vehicle Helper class which is used to create Vehicle object and calls setter
 * function for every attribute
 * 
 * @author Riddhi
 *
 */
public class VehicleHelper {

	public static Vehicle createVehicle(VehicleType type, String model,
			String make) {
		if(type.equals(VehicleType.Car)) { // Creates a Car class object is it is of car type
			Car car = new Car(make, model);
			return car;

		} else {
			Bike bike = new Bike(make, model); // Creates a Bike class object 
			return bike;
		} // return vehicle object
	}
}

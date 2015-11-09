package com.metacampus.vehiclemanagement;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;



public class VehicleHelper {
	

	public static Vehicle createVehicle(VehicleType vehicleType, String model,
			String make)
	{
		String s = String.valueOf(vehicleType);
		if (s.equalsIgnoreCase("Car"))
		{
			return createCar(model, make);
		} 
		else
		{
			return createBike(model, make);
		}
	}

	/**
	 * @param model
	 * @param make
	 * @return bike type
	 */
	static Vehicle createBike(String model, String make) {
		Vehicle vehicle = new Bike();
		vehicle.setModel(model);
		vehicle.setMake(make);
		return vehicle;
	}

	/**
	 * @param model
	 * @param make
	 * @return car type 
	 */
	static Vehicle createCar(String model, String make) {
		Vehicle vehicle = new Car();
		vehicle.setModel(model);
	    vehicle.setMake(make);
		return vehicle;
	}
	
}

package com.metacampus.vehiclemanagement.printer;

import com.metacampus.vehiclemanagement.model.Vehicle;

public class VehiclePrinter {
	
	/** This method returns details of a vehicle in string representation */
	public static String printVehicleSpecification(Vehicle vehicle) {
		return vehicle.toString();
	}

	/** This method returns on road price of a vehicle */
	public static int printOnRoadPrice(Vehicle vehicle) {
		return vehicle.calculateOnRoadPrice();
	}
}
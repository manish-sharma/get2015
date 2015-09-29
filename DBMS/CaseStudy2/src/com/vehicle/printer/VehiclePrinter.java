package com.vehicle.printer;

import com.vehicle.core.Vehicle;

/** This class prints the details of the Vehicle objects **/
public class VehiclePrinter {
	/**
	 * This function accepts the vehicle type reference variable and prints its
	 * respective details
	 **/
	public static String printVehicleSpecification(Vehicle vehicle) {
		return vehicle.toString();
	}
}

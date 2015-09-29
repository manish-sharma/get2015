package com.metacampus.vehiclemanagement;

import com.metacampus.vehiclemanagement.model.Vehicle;


public class VehiclePrinter {
	/**
	 * @param vehicle
	 * @return string of vehicle
	 */
	public static String printVehicleSpecification(Vehicle vehicle) {
		String str=vehicle.toString();
		return str;
	}
}

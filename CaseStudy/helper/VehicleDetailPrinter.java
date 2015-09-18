package com.vehiclemanagement.helper;
import com.vehiclemanagement.model.Vehicle;


public class VehicleDetailPrinter {
	/**
	 * @param vehicle
	 * @return string of vehicle
	 */
	public static String printVehicleSpecification(Vehicle vehicle) {
		String str=vehicle.toString();
		return str;
	}
}

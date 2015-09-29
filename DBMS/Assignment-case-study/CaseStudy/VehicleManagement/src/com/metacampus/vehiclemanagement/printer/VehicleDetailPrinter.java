package com.metacampus.vehiclemanagement.printer;

import com.metacampus.vehiclemanagement.model.Vehicle;

public class VehicleDetailPrinter {

	/** printing the specification of vehicle
	 * @param vehicle type of vehicle
	 * @return
	 */
	public static String printVehicleSpecification(Vehicle vehicle) {
		return vehicle.toString();
	}
	
}


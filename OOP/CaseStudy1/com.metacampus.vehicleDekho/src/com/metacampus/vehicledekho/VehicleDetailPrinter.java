package com.metacampus.vehicledekho;

import com.metacampus.vehicledekho.model.Vehicle;
import com.metacampus.vehicledekho.model.Car;
import com.metacampus.vehicledekho.model.Bike;

public class VehicleDetailPrinter {

	/** printing the specification of vehicle
	 * @param vehicle type of vehicle
	 * @return
	 */
	public static String printVehicleSpecification(Vehicle vehicle) {
		return vehicle.toString();
	}
	
}

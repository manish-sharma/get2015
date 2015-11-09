package com.metacampus.vehiclemanagement;

import java.util.HashSet;
import java.util.Set;

import com.metacampus.vehiclemanagement.model.Vehicle;

public class VehicleCollection {

	private static Set<Vehicle> employeeSet=new HashSet<Vehicle>();

	public static void main(String args[]) {
		Vehicle developer1 = VehicleHelper.createVehicle(VehicleType.Car,"City", "Honda");
		employeeSet.add(developer1);
		Vehicle developer2=VehicleHelper.createVehicle(VehicleType.Bike,"Pulsar", "Tvs");
		employeeSet.add(developer2);
		
		System.out.println(employeeSet.size());

	}
}

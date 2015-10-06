package com.metacampus.vehiclemanagement.xml;

import java.util.List;

import com.metacampus.vehiclemanagement.model.Vehicle;

public class XmlMain {
	
	public static void main(String args[]) {
		ReadVehicleData read = new ReadVehicleData();
		List<Vehicle> vehiclesList = read.readData("VehicleData.xml");
		
		for (Vehicle vehicle : vehiclesList) {
			System.out.println(vehicle);
		}
	}
}
package com.metacube.carDekho.helper;

import com.metacube.carDekho.model.Car;
import com.metacube.carDekho.model.Vehicle;

public class CreateVehicle {
	public static String createVehicle(String make,String model, int engineInCC, int fuelCapacity, int milage , int price, int roadTax, Boolean AC, Boolean powerSteering, String accessoryKit) {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, make, model);
		Car car = VehicleHelper.createCar((Car)vehicle, engineInCC, fuelCapacity, milage, price, roadTax, AC, powerSteering, accessoryKit);
		Vehicle carPresent = VehicleJDBCHelper.searchByModel(model);
		if(carPresent == null) {
			if(VehicleJDBCHelper.createCar(car)){
				return "success";
			} else {
				return "There is some error in insertion";
			}
		} else {
			return "The Model Already Present";
		}
		
	}
}

package com.metacube.carDekho.factory;

import com.metacube.carDekho.helper.VehicleHelper;
import com.metacube.carDekho.helper.VehicleType;
import com.metacube.carDekho.model.Car;
import com.metacube.carDekho.model.Vehicle;

public class VehicleFactory {
	public static Car createCar(String make, String model, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			Boolean AC,Boolean powerSteering,String accessoryKit ) {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.CAR, make, model);
		Car car = VehicleHelper.createCar((Car)vehicle, engineInCC, fuelCapacity, milage, price, roadTax, AC, powerSteering, accessoryKit);
		return car;
	}
}

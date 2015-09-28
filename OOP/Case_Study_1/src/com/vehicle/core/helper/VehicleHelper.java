package com.vehicle.core.helper;

import com.vehicle.core.Bike;
import com.vehicle.core.Car;
import com.vehicle.core.Vehicle;
/*This class sets the respective values for the bike and car regarding its attributes
 * @author Shishir Pareek
 * Date 23rd August 2015
 */
public class VehicleHelper {
	/*function to initialize the type of vehicle object*/
	public static Vehicle createVehicle(String vehicleType, String model,
			String make) {
		/*condition to check if the vehicle type is car or bike*/ 
		if (vehicleType.equalsIgnoreCase("car")) {
			return createCar(model, make);
		} else {
			return carBike(model, make);
		}
	}
    /*function to create bike object and set the attributes of the car*/
	private static Vehicle carBike(String model, String make) {
		Bike bike = new Bike();
		bike.setModel(model);
		bike.setMake(make);
		bike.setSelfStart(true);
		bike.setHelmetPrice(500.80);
		bike.setEngineInCC(125);
		bike.setFuelCapacity(40);
		bike.setRoadTax(2400);
		bike.setMileage(60.0);
		bike.setPrice(80000);
		return bike;
	}
    /*function to create car object and set its attributes*/
	private static Vehicle createCar(String model, String make) {
		Car car = new Car();
		car.setModel(model);
		car.setMake(make);
		car.setIsAcAvailable(true);
		car.setPowerSteering(true);
		car.setAccessoryKits(true);
		car.setEngineInCC(1225);
		car.setFuelCapacity(400);
		car.setRoadTax(5400);
		car.setMileage(17.25);
		car.setPrice(650000);
		return car;
	}

}

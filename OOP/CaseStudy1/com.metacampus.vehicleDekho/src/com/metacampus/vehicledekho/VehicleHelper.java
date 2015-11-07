package com.metacampus.vehicledekho;

import com.metacampus.vehicledekho.model.Vehicle;
import com.metacampus.vehicledekho.model.Car;
import com.metacampus.vehicledekho.model.Bike;

public class VehicleHelper {

	/** create the bike with given argument
	 * @param make company of bike
	 * @param model
	 * @param engineInCC
	 * @param fuelCapacity
	 * @param milage
	 * @param price
	 * @param roadTax
	 * @param selfStart
	 * @param helmetPrice
	 * @return
	 */
	public static Bike createBike(String make, String model, String engineInCC, int fuelCapacity, 
			String milage, float price, float roadTax, boolean selfStart, float helmetPrice) {
		Bike bike = new Bike();
		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		bike.setMake(make);
		bike.setModel(model);
		bike.setEngineInCC(engineInCC);
		bike.setFuelCapacity(fuelCapacity);
		bike.setMilage(milage);
		bike.setPrice(price);
		bike.setRoadTax(roadTax);
		return bike;
	}
	
	/** creating the car with given specification
	 * @param make company of car
	 * @param model
	 * @param engineInCC
	 * @param fuelCapacity
	 * @param milage
	 * @param price
	 * @param roadTax
	 * @param AC
	 * @param powerSteering
	 * @param accessoryKit
	 * @return
	 */
	public static Car createCar(String make, String model, String engineInCC, int fuelCapacity, 
			String milage, float price, float roadTax, boolean AC, boolean powerSteering, boolean accessoryKit) {
		Car car = new Car();
		car.setAC(AC);
		car.setPowerSteering(powerSteering);;
		car.setAccessoryKit(accessoryKit);
		car.setMake(make);
		car.setModel(model);
		car.setEngineInCC(engineInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		return car;
	}
	
}

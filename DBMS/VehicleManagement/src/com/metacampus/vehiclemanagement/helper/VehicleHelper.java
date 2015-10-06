package com.metacampus.vehiclemanagement.helper;

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;

/** This class helps in creating objects of Car and Bike. In this class
 * We have overloaded method create() to create objects of Bike and Car
 */
public class VehicleHelper {
	
	/** Method to create object of Vehicle
	 * 
	 * @param make : Company Name
	 * @param model : Model Name
	 * @param engineCC : Engine CC
	 * @param fuelCapacity : Fuel Capacity
	 * @param mileage : Mileage 
	 * @param price : price
	 * @param roadTax : road tax
	 * @return Vehicle Object
	 */
	public static Vehicle create(String make, String model, String engineCC,
			String fuelCapacity, String mileage, int price, int roadTax) {
		Vehicle vehicle = new Vehicle();
		setSpecifications(make, model, engineCC, fuelCapacity, mileage, price, roadTax, vehicle);
		return vehicle;
	}
	
	/** Private method to insert basic vehicle details
	 * 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param price
	 * @param raodTax
	 * @param vehicle
	 */
	private static void setSpecifications(String make, String model, String engineCC,
			String fuelCapacity, String mileage, int price, int roadTax, Vehicle vehicle) {
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setEngineCC(engineCC);
		vehicle.setFuelCapacity(fuelCapacity);
		vehicle.setMileage(mileage);
		vehicle.setPrice(price);
		vehicle.setRoadTax(roadTax);
	}
	
	/** Method to create object of Bike
	 * 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param price
	 * @param roadTax
	 * @param selfStart
	 * @param helmetPrice
	 *
	 * @return Bike Object
	 */
	public static Bike create(String make, String model, String engineCC,
			String fuelCapacity, String mileage, int price, int roadTax,
			String selfStart, int helmetPrice) {
		Bike bike = new Bike();
		setSpecifications(make, model, engineCC, fuelCapacity, mileage, price, roadTax, bike);
		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		return bike;
	}
	
	/** Method to create object of Car
	 * 
	 * @param make
	 * @param model
	 * @param engineCC
	 * @param fuelCapacity
	 * @param mileage
	 * @param price
	 * @param roadTax
	 * @param aC
	 * @param powerSteering
	 * @param accessoryKit
	 * 
	 * @return Car Object
	 */
	public static Car create(String make, String model, String engineCC,
			String fuelCapacity, String mileage, int price, int roadTax,
			String aC, String powerSteering, String accessoryKit) {
		Car car = new Car();
		setSpecifications(make, model, engineCC, fuelCapacity, mileage, price, roadTax, car);
		car.setAC(aC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		return car;
	}

}
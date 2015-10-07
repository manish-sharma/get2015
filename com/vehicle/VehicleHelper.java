/**
 * @author Pooja Khandelwal
 * @createdDate 15/09/2015
 * @name   VehicleHelper 
 * @description this class have 3 methods createVehicle(),createCar(),createBike() to set the attributes of vehicle based on its type 
 */
package com.vehicle;

public class VehicleHelper {
	/**
	 * @name createVehicle()
	 * @description this method will set 2 attributes make and model for vehicle
	 *              and find the type of vehicle whether it is car or bike and
	 *              return either Car or Bike class object
	 * @param vehicleType
	 *            (type of vehicle, may be either car or bike)
	 * @param make
	 *            (name of compny for a vehicle)
	 * @param model
	 *            (model name for a vehicle)
	 * @return either car or bike which are objects of Car class and Bike class
	 *         respectively
	 */
	public static Vehicle createVehicle(String vehicleType, String make,
			String model) {
		if (vehicleType.equalsIgnoreCase("car")) {
			Car car = new Car();
			car.setModel(model);
			car.setMake(make);
			return car;
		} else if (vehicleType.equalsIgnoreCase("bike")) {
			Bike bike = new Bike();
			bike.setModel(model);
			bike.setMake(make);
			return bike;
		} else
			return null;
	}

	/**
	 * @name createCar()
	 * @description this method will set the attributes for car return Car class
	 *              object
	 * @param car
	 * @param engineInCC
	 * @param fuelCapacity
	 * @param milage
	 * @param price
	 * @param roadTax
	 * @param AC
	 * @param powerSteering
	 * @param accessoryKit
	 * @return car(object of Car class)
	 */
	public static Car createCar(Car car, int engineInCC, int fuelCapacity,
			int milage, long price, int roadTax, Boolean AC,
			Boolean powerSteering, String accessoryKit) {
		car.setEngineInCC(engineInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setAC(AC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		car.calculateOnRoadPrice();
		return car;
	}

	/**
	 * @name createBike()
	 * @description this method will set the attributes for car return Bike
	 *              class object
	 * @param bike
	 * @param engineInCC
	 * @param fuelCapacity
	 * @param milage
	 * @param price
	 * @param roadTax
	 * @param selfStart
	 * @param helmetPrice
	 * @return bike(object of Bike class)
	 */
	public static Bike createBike(Bike bike, int engineInCC, int fuelCapacity,
			int milage, long price, int roadTax, Boolean selfStart,
			long helmetPrice) {
		bike.setEngineInCC(engineInCC);
		bike.setFuelCapacity(fuelCapacity);
		bike.setMilage(milage);
		bike.setPrice(price);
		bike.setRoadTax(roadTax);
		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		bike.calculateOnRoadPrice();
		return bike;
	}
}

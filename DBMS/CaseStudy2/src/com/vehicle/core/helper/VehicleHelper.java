package com.vehicle.core.helper;

import com.vehicle.core.Bike;
import com.vehicle.core.Car;
import com.vehicle.core.Vehicle;
import com.vehicle.core.type.VehicleType;

/**
 * This class is used for creating the objects of type vehicle,car or bike based
 * on type of data returned in xml
 * 
 * @author Shishir Date 22nd September 2015
 */
public class VehicleHelper {

	/**
	 * This function creates the vehicle object depending upon the type in xml
	 * and creates the objects basede on type and sets attributes based on that
	 * type
	 **/
	public static Vehicle createVehicle(Vehicle vehicleType, String make,
			String model, int engineInCC, int fuelCapacity, double mileage,
			double price, double roadTax) {
		if (vehicleType.equals(VehicleType.CAR)) {// if type is car then prepare
			// the car object and set
			// attributes of car ussing
			// setter
			Car car = new Car();
			car.setMake(make);
			car.setModel(model);
			car.setEngineInCC(engineInCC);
			car.setFuelCapacity(fuelCapacity);
			car.setMileage(mileage);
			car.setPrice(price);
			car.setRoadTax(roadTax);
			return car;
		} else if (vehicleType.equals(VehicleType.BIKE)) {// if vehicle type is
			// bike then create
			// a new bike objec
			// and set its
			// attributes using
			// setter functions
			Bike bike = new Bike();
			bike.setMake(make);
			bike.setModel(model);
			bike.setEngineInCC(engineInCC);
			bike.setFuelCapacity(fuelCapacity);
			bike.setMileage(mileage);
			bike.setPrice(price);
			bike.setRoadTax(roadTax);
			return bike;
		}

		else {
			return null; // if both the type doesnt exists then return null
		}
	}

	/** This function sets the attributes specific to the car type **/
	public static Car createCar(Vehicle vehicle, boolean aC,
			boolean powerSteering, String accessoryKit) {

		Car car = (Car) vehicle;

		car.setAC(aC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		return car;
	}

	/** This function sets the attributes specific to the bike type **/
	public static Bike createBike(Vehicle vehicle, boolean selfStart,
			int helmetPrice) {

		Bike bike = (Bike) vehicle;

		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		return bike;
	}
}

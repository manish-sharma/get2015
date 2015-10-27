package com.metacube.carDekho.helper;

import com.metacube.carDekho.model.*;

/**
 * Create the Car/Bike based on vehicleType and return it
 * @author Ravika
 * @since 9/15/2015
 */
public class VehicleHelper {
	/**
	 * Create the Car/Bike based on vehicleType and return it
	 * @param bike2 = type of vehicle bike or car
	 * @param make = make of vehicle
	 * @param model = model of vehicle
	 * @return = Car/Bike
	 */
	public static Vehicle createVehicle( VehicleType vehicleType,String make,String model){
		if(vehicleType.equals(VehicleType.CAR)){
			Car car=new Car();
			car.setModel(model);
			car.setMake(make);
			return car;
		} else {
			return null;
		}
	}
   /**
    * set all the attributes of the car
    * @param car
    * @param engineInCC
    * @param fuelCapacity
    * @param milage
    * @param price
    * @param roadTax
    * @param AC
    * @param powerSteering
    * @param accessoryKit
    * @return = object of car
    */
	public static Car createCar(Car car, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			Boolean AC,Boolean powerSteering,String accessoryKit){
	
		car.setEngineInCC(engineInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setAC(AC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		return car;
	}
	
	
}

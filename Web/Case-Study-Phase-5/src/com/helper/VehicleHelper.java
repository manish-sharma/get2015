package com.helper;

import java.sql.Timestamp;

import com.model.*;

/**
 * @purpose this class use to create vehicle method according to user's requirement
 * @author Sumitra
 *
 */
public class VehicleHelper {
/**
* 
* @param car2 this take value of vehicle type either car or bike
* @param make this store brand name of particular vehicle
* @param model this is the model name of vehicle
* @return it return object of vehicle type either car or bike
* 
*/
public static Vehicle createVehicle(String make,String model){

	
		Car car=new Car();
		car.setModel(model);
		car.setMake(make);
		return car;
	
			
	}
/**
 * 
 * @param car this is  object of vehicle according to vehicle type  class
 * @param engineInCC this hold engine IN CC
 * @param fuelCapacity fuel capacity of vehicle
 * @param milage this hold milage of vehicle
 * @param price this hold price of vehicle
 * @param roadTax this hold road tax of vehicle
 * @param AC this hold is AC in vehicle or not
 * @param powerSteering  this hold is powerSteering in vehicle or not
 * @param accessoryKit what elements in kit
 * @return return object of vehicle child class car
 */
	public static Car createCar(Car car,int id , String make,Timestamp createdTime,String model, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			                      Boolean AC,Boolean powerSteering ,String accessoryKit){
	    car.setVehicleId(id);
		car.setMake(make);
		car.setCreateDTime(createdTime);
		car.setModel(model);
		car.setEngineInCC(engineInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setAC(AC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		car.setOnRoadPrice(car.getPrice());
		return car;
}
}
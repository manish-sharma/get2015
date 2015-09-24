package Com.HelperClasses;

import java.sql.Timestamp;

import Com.Vehicle.*;

/**
 * @purpose this class use to create vehicle method according to user's requirement
 * @author Ankur
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
	public static Vehicle createVehicle(VehicleTypes car2,String make,String model){

		if(car2.equals(VehicleTypes.Car)){
			Car car=new Car();
			car.setModel(model);
			car.setMake(make);
			return car;
		}

		else if(car2.equals(VehicleTypes.Bike)){
			Bike bike=new Bike();
			bike.setModel(model);
			bike.setMake(make);
			return bike;
		}
		else
			return null;		
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
	public static Car createCar(Car car,String make,Timestamp createdTime,String model, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			Boolean AC,Boolean powerSteering,String accessoryKit){

		car.setMake(make);
		car.setCreatedTime(createdTime);
		car.setModel(model);
		car.setEngineInCC(engineInCC);
		car.setFuelCapacity(fuelCapacity);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setAc(AC);
		car.setPowerSteering(powerSteering);
		car.setAccessoryKit(accessoryKit);
		car.calculateOnRoadPrice(car.getPrice());
		return car;
	}
	/**
	 * 
	 * @param bike   this is  object of vehicle according to vehicle type  class
	 * @param engineInCC engineInCC this hold engine IN CC
	 * @param fuelCapacity fuelCapacity fuel capacity of vehicle
	 * @param milage  this hold milage of vehicle
	 * @param price  this hold price of vehicle
	 * @param roadTax this hold road tax of vehicle
	 * @param selfStart this hold true or false value according to hold attribute
	 * @param helmetPrice this hold helmet price 
	 * @return  return object of vehicle child class car
	 */
	public static Bike createBike(Bike bike,String make,Timestamp createdTime,String model, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			Boolean selfStart,long helmetPrice){
		bike.setMake(make);
		bike.setCreatedTime(createdTime);
		bike.setModel(model);
		bike.setEngineInCC(engineInCC);
		bike.setFuelCapacity(fuelCapacity);
		bike.setMilage(milage);
		bike.setPrice(price);
		bike.setRoadTax(roadTax);
		bike.setSelfStart(selfStart);
		bike.setHelmetPrice(helmetPrice);
		bike.calculateOnRoadPrice((int) price);
		return bike;


	}

}

package Com.Vehicle;
/**
 * this class is used to create vehicle method according to user's requirement
 * @author Ankur
 * @since 14-09-2015
 */
public class VehicleHelper {
	/**
	 * method to set all the attributes of the vehicle
	 *@param vehicleType this take value of vehicle type either car or bike
	 *@param make this store brand name of particular vehicle
	 *@param model this is the model name of vehicle
	 *@return it return object of vehicle type either car or bike
	 */
	public static Vehicle createVehicle(String vehicleType,String make,String model){

		if(vehicleType.equalsIgnoreCase("car")){
			Car car=new Car();
			car.setModel(model);
			car.setMake(make);
			return car;
		}

		else if(vehicleType.equalsIgnoreCase("bike")){
			Bike bike=new Bike();
			bike.setModel(model);
			bike.setMake(make);
			return bike;
		}
		else
			return null;		
	}
	/**
	 * method to set all the attributes of the car
	 * @param car this is  object of vehicle according to vehicle type  class
	 * @param engineInCC this hold engine IN CC
	 * @param fuelCapacity fuel capacity of vehicle
	 * @param milage this hold mileage of vehicle
	 * @param price this hold price of vehicle
	 * @param roadTax this hold road tax of vehicle
	 * @param AC this hold is AC in vehicle or not
	 * @param powerSteering  this hold is powerSteering in vehicle or not
	 * @param accessoryKit what elements in kit
	 * @return return object of vehicle child class car
	 */
	public static Car createCar(Car car, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			Boolean AC,Boolean powerSteering,String accessoryKit){


		car.setEnginenInCC(engineInCC);
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
	 * method to set all the attributes of the bike
	 * @param bike   this is  object of vehicle according to vehicle type  class
	 * @param engineInCC engineInCC this hold engine IN CC
	 * @param fuelCapacity fuelCapacity fuel capacity of vehicle
	 * @param milage  this hold mileage of vehicle
	 * @param price  this hold price of vehicle
	 * @param roadTax this hold road tax of vehicle
	 * @param selfStart this hold true or false value according to hold attribute
	 * @param helmetPrice this hold helmet price 
	 * @return  return object of vehicle child class car
	 */
	public static Bike createBike(Bike bike, int engineInCC,int fuelCapacity, int milage,long price,int roadTax,
			Boolean selfStart,long helmetPrice){

		bike.setEnginenInCC(engineInCC);
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

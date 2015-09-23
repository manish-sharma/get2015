package com.vehicaldekho.vehical.model;
enum VehicleType {BIKE , CAR};  //It define type of vehicle is bike or car

/* Starting of VehicleHelper class */
public class VehicleHelper 
{
	/* Starting of createVehicle class function */
	public static Vehicle createVehicle(VehicleType vehicleType, String model , String makeYear) 
	{
		if (vehicleType.equals(VehicleType.CAR)) 
			return createCar(model, makeYear);
		 
		else 
			return createBike(model, makeYear);
	}
	/* Ending of createVehicle class function */

	/* Starting of createCar function */
	public static Car createCar(String model, String  makeYear )
	{
		Car car = new Car();
		car.setModel(model);
		car.setMake(makeYear);
		car.setEngineInCC(1500);
		car.setFuelCapacity(500);
		car.setRoadTax(5400);
		car.setMilage(21.5);
		car.setPrice(8_00_000);
		car.setHasAC(true);
		car.setHasPowerSteering(true);
		car.setHasAccesoriesKit(true);
		
		return car;
	}
	/* Ending of createCar function */
	
	/* Starting of createBike function */
	public static Bike createBike( String model , String makeYear)
	{
		Bike bike = new Bike();
		bike.setModel(model);
		bike.setMake(makeYear);
		bike.setEngineInCC(150);
		bike.setFuelCapacity(40);
		bike.setRoadTax(2400);
		bike.setMilage(35.0);
		bike.setPrice(90_000);
		bike.setHelmetPrice(1101);
		bike.setIsSelfStart(true);
		
		return bike;
	}
	/* Ending of createBike function */
	
	/* Starting of displayVehicleSpecification function */
	public static String displayVehicleSpecification(Vehicle vehicle) {
		return vehicle.toString();
	}
	/* Ending of displayVehicleSpecification function */

}
/* End of VehicleHelper class */

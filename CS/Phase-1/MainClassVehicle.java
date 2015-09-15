/**
 * @author Girdhari
 * MainClass for vehicle system  
 */
package com.vehicaldekho.vehical.model;

/* Starting of MainClassVehicle */
class MainClassVehicle {

	/* Starting of main function */
	public static void main(String[] args) 
	{
		Car car = (Car) VehicleHelper.createVehicle(VehicleType.CAR, "TVS" , "2010");
		System.out.println(car); // display car specification
		System.out.println( "On road Price : "+car.calculateOnRoadPrice());
		
		Bike bike =(Bike) VehicleHelper.createVehicle(VehicleType.BIKE, "Honda", "2008");
		System.out.println(bike); // display bike specification
		System.out.println( "On road Price : "+bike.calculateOnRoadPrice());

	}
	/* End of main function */
}
/* Ending of MainClassVehicle */

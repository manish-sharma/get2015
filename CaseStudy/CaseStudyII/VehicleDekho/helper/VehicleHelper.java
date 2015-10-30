package helper;

/**
 * this class create Vehicle object and set its attributes value
 * @author Banwari
 */

import model.Bike;
import model.Car;
import model.Vehicle;

public class VehicleHelper {

	public static Vehicle createVehicle(VehicleType vehicleType, String model,String make)
	{

		if (vehicleType.equals(VehicleType.Car))
		{  // if vehicle type is car than call createCar
			return createCar(model, make);

		} 
		else 
		{
			// else call method createBike
			return createBike(model, make);	

		}

	}

	private static Vehicle createCar(String model, String make)
	{   
		//object of vehicle and reference of Car
		Vehicle vehicle = new Car();		 
		// set the variables of car
		java.util.Date today = new java.util.Date();
		java.sql.Date date = new java.sql.Date(today.getTime());
		vehicle.setCreated_By("Banwari");
		vehicle.setCreated_Time(date);
		vehicle.setEnginInCC(500);
		vehicle.setFuelCapacity(50);
		vehicle.setMake(make);
		vehicle.setMilage(17);
		vehicle.setModel(model);
		vehicle.setPrice(800000.00);
		vehicle.setRoadTax(10000);
		((Car) vehicle).setAC(true);
		((Car) vehicle).setAccessoryKit(true);
		((Car) vehicle).setPowerSteering(true);

		return vehicle;

	}

	private static Vehicle createBike(String model, String make) 
	{   //object of vehicle and reference of Bike
		Vehicle vehicle = new Bike();	
		// set the variables of Bike
		java.util.Date today = new java.util.Date();
		java.sql.Date date = new java.sql.Date(today.getTime());
		vehicle.setCreated_By("Banwari");
		vehicle.setCreated_Time(date);
		vehicle.setEnginInCC(500);
		vehicle.setFuelCapacity(50);
		vehicle.setMake(make);
		vehicle.setMilage(17);
		vehicle.setModel(model);
		vehicle.setPrice(800000.00);
		vehicle.setRoadTax(10000);
		((Bike) vehicle).setHelmetPrize(100);
		((Bike) vehicle).setSelfStart(true);

		return vehicle;

	}
}

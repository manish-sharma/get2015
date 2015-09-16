/**	Helper class to create objects of vehicle type and
 *	return the objects
 *         
 * @author Gaurav Saini 
 * Date : 13/09/2015
 */

public class VehicleHelper {
	
	public static Vehicle createVehicle(String vehicleType, String make,
			String model) {
		if (vehicleType.equalsIgnoreCase("Car")) {					// checking if vehicle type = car
			Car car = new Car(make, model);							// calling constructor to create new car
			return car;
		} else if (vehicleType.equalsIgnoreCase("Bike")) {					// checking if vehicle type = bike
			Bike bike = new Bike(make, model);								// calling constructor to create new bike
			return bike;
		} else {
			Vehicle vehicle = new Vehicle(null, null);
			return vehicle;
		}
	}
}
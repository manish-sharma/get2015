/**
 * @author Sumitra this is vehicle helper class and will return according to
 *         type
 */
enum vehicleTypeList {
	Car, Bike
}

public class VehicleHelper {
	public static Vehicle createVehicle(String vehicleType, String make,
			String model) {
		if (vehicleType.equalsIgnoreCase(vehicleTypeList.Car.toString())) {
			// checking for car type
			Car car = new Car(make, model);
			// calling constructor
			return car;
		} else if (vehicleType
				.equalsIgnoreCase(vehicleTypeList.Bike.toString())) {
			// checking for bike type

			Bike bike = new Bike(make, model);
			// calling constructor
			return bike;
		} else {
			Vehicle vehicle = new Vehicle(null, null);
			return vehicle;

		}
	}

}

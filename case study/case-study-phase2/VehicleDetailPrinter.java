package Com.Vehicle;
/**
 * @author  Ankur
 * @description this class will create string format for all vehicle attributes based on car or bike type 
 */


public class VehicleDetailPrinter {
	private static String vehicleAttributes;

	/**
	 * @name printVehicleSpecification()
	 * @description this method will create string format for all vehicle
	 *              attributes based on car or bike type by calling toString()
	 *              method of car and bike class and then return that string
	 * @param vehicle
	 * @return vehicleAttributes(String format of all vehicle attributes;vehicle
	 *         may be either car or bike)
	 */
	public static String printVehicleSpecification(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			Car car = (Car) vehicle;
			vehicleAttributes = car.toString();
			return vehicleAttributes;
		} else if (vehicle instanceof Bike) {
			Bike bike = (Bike) vehicle;
			vehicleAttributes = bike.toString();
			return vehicleAttributes;
		} else {
			return null;
		}
	}
}

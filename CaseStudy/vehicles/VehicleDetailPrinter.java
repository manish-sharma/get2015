// prints objects of various vehicle classes

package vehicles;

public class VehicleDetailPrinter {

	public static String printVehicleSpecification ( Vehicle vehicleObj ) {
		System.out.println(vehicleObj);
		return vehicleObj.toString();
	}
	
	public static String printCarSpecification ( Car carObj ) {
		System.out.println(carObj);
		return carObj.toString();
	}
	
	public static String printBikeSpecification ( Bike bikeObj ) {
		System.out.println(bikeObj);
		return bikeObj.toString();
	}
	
}
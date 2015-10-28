package vehicles;

import java.util.Iterator;
import java.util.List;
/**
 * to perform all the operations on data base
 * @author Ravika
 *
 */

public class MainForVehicle {

	public static void main(String[] args) {
		StaXParserForVehicle staXParserForVehicle = new StaXParserForVehicle();
		List<Vehicle> vehicles = staXParserForVehicle.readConfig("C:/Users/Ravika/Desktop/vehicle.xml");
		System.out.println(vehicles);
		Iterator<Vehicle> itr = vehicles.iterator();
		Vehicle vehicle= null;
		VehicleJDBCHelper vehicleJDBCHelper = new VehicleJDBCHelper();
		while(itr.hasNext()) {
			vehicle = itr.next();
			vehicleJDBCHelper.create(vehicle);
		}
		 
	} 
}

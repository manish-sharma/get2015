package vehicle.vehicleHelper;

import vehicle.pojoClasses.*;
import vehicle.vehicleEnum.VehicalType;

public class VehicleHelper {
	public Vehicle createVehicle(VehicalType vehicleType, String make,
			String model, int engineInCC, int fuelCapacity, int milage,
			int price, int roadTax) {
		/*method for creating object of vehicle*/
		Vehicle vehicle;

		if (VehicalType.CAR.equals(vehicleType)) {

			vehicle = new Car();
			vehicleData(make, model, engineInCC, fuelCapacity, milage, price,
					vehicle, roadTax);
		} else if (VehicalType.BIKE.equals(vehicleType)) {
			vehicle = new Bike();
			vehicleData(make, model, engineInCC, fuelCapacity, milage, price,
					vehicle, roadTax);
		} else {
			return null;
		}

		return vehicle;
	}

	private static void vehicleData(String make, String model, int engineInCC,
			int fuelCapacity, int milage, int price, Vehicle vehicle,
			int roadTax) {
		/*method setting values of vehicle*/
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setEngineInCC(engineInCC);
		vehicle.setFuelCapacity(fuelCapacity);
		vehicle.setMilage(milage);
		vehicle.setPrice(price);
		vehicle.setRoadtax(roadTax);
	}

}

package vehicle;

public class VehicleHelper {
	public Vehicle createVehicle(String vehicleType, String make,
			String model, int engineInCC, int fuelCapacity, int milage,
			int price, int roadTax) {

		Vehicle vehicle;

		if (vehicleType.equalsIgnoreCase("Car")) {

			vehicle = new Car();
			vehicleData(make, model, engineInCC, fuelCapacity, milage, price,
					vehicle,roadTax);
		} else {
			vehicle = new Bike();
			vehicleData(make, model, engineInCC, fuelCapacity, milage, price,
					vehicle,roadTax);
		}

		return vehicle;
	}

	private static void vehicleData(String make, String model, int engineInCC,
			int fuelCapacity, int milage, int price, Vehicle vehicle, int roadTax) {
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setEngineInCC(engineInCC);
		vehicle.setFuelCapacity(fuelCapacity);
		vehicle.setMilage(milage);
		vehicle.setPrice(price);
		vehicle.setRoadtax(roadTax);
	}

}

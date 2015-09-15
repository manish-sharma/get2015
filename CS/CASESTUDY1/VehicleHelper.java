
public class VehicleHelper {

	public static Vehicle createVehicle(String vehicleType, String model, String make) { // constructor

		if (vehicleType.equals("car")) {    // if vehicle type is car than call createCar
			return createCar(model, make);

		} else {
			return createBike(model, make); // else call method createBike

		}

	}

	private static Vehicle createCar(String model, String make) { 
		Vehicle vehicle = new Car(); // make object of vehicle and give it to reference of Car
		// set the variables of car
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

	private static Vehicle createBike(String model, String make) {
		Vehicle vehicle = new Bike(); // make object of vehicle and give it to reference of Bike
		// set the variables of Bike
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

// creates instance of various vehicle classes
package vehicles;

public class VehicleHelper {
	
	// creates instance of vehicle class
	Vehicle createVehicle( String vehicleType) {
		if ( vehicleType.equals("car") )
			return createCar();
		else if ( vehicleType.equals("bike") )
			return createBike();
		Vehicle vehicleObj = new Vehicle();
		vehicleObj.setEngineInCC("10");
		vehicleObj.setFuelCapacity(11.0);
		vehicleObj.setMake("Make1");
		vehicleObj.setMilage(12.0);
		vehicleObj.setModel("Model1");
		vehicleObj.setPrice(50000);
		vehicleObj.setRoadTax(1000);
		return vehicleObj;
	}
	
	
	// creates instance of car class
	Vehicle createCar() {
		Car carObj = new Car();
		carObj.setEngineInCC("20");
		carObj.setFuelCapacity(21.0);
		carObj.setMake("Make2");
		carObj.setMilage(22.0);
		carObj.setModel("Model2");
		carObj.setPrice(700000);
		carObj.setRoadTax(2000);
		carObj.setAC("yes");
		carObj.setAccessoryKit("yes");
		carObj.setPowerSteering("yes");
		return carObj;
	}
	

	// creates instance of bike class
	Bike createBike() {
		Bike bikeObj = new Bike();
		bikeObj.setEngineInCC("30");
		bikeObj.setFuelCapacity(31.0);
		bikeObj.setMake("Make3");
		bikeObj.setMilage(32.0);
		bikeObj.setModel("Model3");
		bikeObj.setPrice(60000);
		bikeObj.setRoadTax(500);
		bikeObj.setSelfStart("yes");
		bikeObj.setHelmetPrice(1200);
		return bikeObj;
	}
	
}

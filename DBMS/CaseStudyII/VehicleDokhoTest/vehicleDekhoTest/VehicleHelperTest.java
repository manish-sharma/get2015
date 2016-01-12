package vehicleDekhoTest;

import helper.VehicleHelper;
import helper.VehicleType;
import model.Bike;
import model.Car;
import model.Vehicle;

import org.junit.Test;

public class VehicleHelperTest {

	@Test
	public void testVehicleHelperForBike() {

		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.Bike, "ApacheRTR",
				"TVS");
		assert (vehicle instanceof Bike);

	}

	@Test
	public void testVehicleHelperForCar() {

		Vehicle vehicle = VehicleHelper.createVehicle(VehicleType.Car, "EchoSports",
				"Ford");
		assert (vehicle instanceof Car);

	}

}

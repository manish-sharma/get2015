package VehicleDekhoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Helper.VehicleHelper;
import Model.Bike;
import Model.Car;
import Model.Vehicle;

public class VehicleHelperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVehicleHelperForBike() {

		Vehicle vehicle = VehicleHelper.createVehicle("bike", "ApacheRTR",
				"TVS");
		assert (vehicle instanceof Bike);

	}

	@Test
	public void testVehicleHelperForCar() {

		Vehicle vehicle = VehicleHelper.createVehicle("car", "EchoSports",
				"Ford");
		assert (vehicle instanceof Car);

	}


}

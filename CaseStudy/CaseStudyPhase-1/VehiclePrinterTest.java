package CaseStudy1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiclePrinterTest {

	@Test
	public void VehicleHelperTestForCarInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleTypeEnum.Car, "Sedan", "2008");
		assertEquals(true, vehicle instanceof Car);
	}

	@Test
	public void VehicleHelperTestForBikeInstance() {
		Vehicle vehicle = VehicleHelper.createVehicle( VehicleTypeEnum.Bike, "CafeRacer",
				"2008");
		assertEquals(true, vehicle instanceof Bike);
	}

}

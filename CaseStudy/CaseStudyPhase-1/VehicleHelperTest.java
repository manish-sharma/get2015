package CaseStudy1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleHelperTest {
	@Test
	public void testCreateCar() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleTypeEnum.Car, "XUV", "2008");
		assertNotNull(vehicle);
		assertEquals("XUV", vehicle.getModel());
	}

	@Test
	public void testCreateBike() {
		Vehicle vehicle = VehicleHelper.createVehicle(VehicleTypeEnum.Bike, "Pulsar", "2013");
		assertEquals("Pulsar", vehicle.getModel());
	}

}

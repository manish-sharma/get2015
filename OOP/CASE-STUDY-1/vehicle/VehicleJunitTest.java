package vehicle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleJunitTest {

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
	public void createVehicleTest() {
		VehicleHelper vehicleHelper=new VehicleHelper();
		Vehicle vehicle=vehicleHelper.createVehicle("Bike", "Bajaj", "cdx120", 120, 15,98, 50000, 2000);
		assertEquals("Bajaj", vehicle.getMake());
	}

	@Test
	public void calculateOnRoadPriceTest() {
		VehicleHelper vehicleHelper=new VehicleHelper();
		Vehicle vehicle=vehicleHelper.createVehicle("Bike", "Bajaj", "cdx120", 120, 15,98, 50000, 2000);
		assertEquals(52000,vehicle.calculateOnRoadPrice(vehicle));
	}

}

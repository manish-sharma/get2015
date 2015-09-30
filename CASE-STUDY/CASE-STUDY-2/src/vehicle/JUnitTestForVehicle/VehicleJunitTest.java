package vehicle.JUnitTestForVehicle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import vehicle.pojoClasses.Vehicle;
import vehicle.vehicleEnum.VehicalType;
import vehicle.vehicleHelper.VehicleHelper;

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
		/*Test createVehicle method*/
		VehicleHelper vehicleHelper=new VehicleHelper();
		Vehicle vehicle=vehicleHelper.createVehicle(VehicalType.BIKE, "Bajaj", "cdx120", 120, 15,98, 50000, 2000);
		assertEquals("Bajaj", vehicle.getMake());
	}

	@Test
	public void calculateOnRoadPriceTest() {
		/*Testing calculateOnRoadPrice method*/
		VehicleHelper vehicleHelper=new VehicleHelper();
		Vehicle vehicle=vehicleHelper.createVehicle(VehicalType.BIKE, "Bajaj", "cdx120", 120, 15,98, 50000, 2000);
		assertEquals(52000,vehicle.calculateOnRoadPrice(vehicle));
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleDetailPrinterTest {

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
	public void testForVehiclePrinter() {
		// checking for object of car
		String object2 = "make:Verna,model:verna23";
		String object1 = VehiclePrinter.printVehicleSpecification(VehicleHelper
				.createVehicle("Car", "Verna", "verna23"));
		assertEquals(object1, object2);
	}

}

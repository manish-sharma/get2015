/**To test vehicle helper class
 * 
 * @author Gaurav Saini
 * Date : 13/09/2015
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleHelperTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	// checking for car type object
	public void test() {
		assertNotNull(VehicleHelper.createVehicle("Car", "Verna", "verna23"));
	}

	@Test
	// checking for bike type object
	public void test1() {
		assertNotNull(VehicleHelper.createVehicle("Bike", "Honda", "honda23"));
	}

}
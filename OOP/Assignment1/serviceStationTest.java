import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class serviceStationTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	/* when in main class input is given eg : SUV, Sedan, SUV    then values get stored in serviceCars.txt then according to it these test cases run  */
	
	@Test
	public void testNumOfSedanCars()   /* tests total number of sedan cars that came for service */
	{
		car objCarSedan = new car("Sedan");
		int countCarSedan = objCarSedan.numOfCarType();
		int expected = 1;
		assertEquals("Matched", expected, countCarSedan);
	}
	
	@Test
	public void testNumOfSedanServiced () /* Tests total number of sedan cars that can be serviced */
	{
		int countCarSedan = 1, countMechanicSedan = 2;
		serviceStation objServiceStation = new serviceStation();
		int numOfSedanServiced = objServiceStation.numOfCarServiced(countCarSedan, countMechanicSedan);
		assertEquals("Matched", 1, numOfSedanServiced);
	}
	
	@Test
	public void testEarningOfSingleSedan() /* Tests total earning form service */
	{
		int countMechanicSedan = 1;
		mechanic objMechanicSedan = new mechanic("Sedan");
		int earningBySedan = objMechanicSedan.costOfCarServiced(countMechanicSedan);
		int expectedEarning = 3000;
		assertEquals("Matched", expectedEarning, earningBySedan);
	}

}

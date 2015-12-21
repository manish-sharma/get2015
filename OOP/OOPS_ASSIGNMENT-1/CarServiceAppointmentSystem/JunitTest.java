package CarServiceAppointmentSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest {

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
	public void testFoTatalEarning()   //Test case for total earning function
	{
		int expected=10000;
		
		int actual=Main.toatalEarning(1,1,1);
         assertEquals(expected,actual);  
	}
	/*@Test
	/*public void testForNagative()
	{
         int expected=11000;
		
		 int actual=Main.toatalEarning(3000, 5000, 2000);
         assertEquals(expected,actual);  
	   
	}*/


}

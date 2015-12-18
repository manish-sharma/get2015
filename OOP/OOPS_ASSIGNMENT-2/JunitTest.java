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
	public void testFoTatalEarning()   //Positive Test case for percentage report for each option
	{
		int expected=50;
		
		int actual=Survey.reportPercant(4,2);
         assertEquals(expected,actual);  
	}
	/*@Test
	/*public void testForNagative()   //Negative Test case for percentage report for each option
	{
         int expected=51;
		
		int actual=Survey.reportPercant(4,2);
         assertEquals(expected,actual);  
	   
	}*/

}

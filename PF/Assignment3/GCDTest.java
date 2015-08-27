import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GCDTest 
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

	@Test
	public void testCorrect1()                         // positive test case
	{
		GCD obj = new GCD () ;
		int gcd = obj.gcd (2, 1);
		assertEquals ("Correct", 1, gcd);
	}
	
	@Test
	public void testCorrect2()                         // positive test case
	{
		GCD obj = new GCD () ;
		int gcd = obj.gcd (12, 18);
		assertEquals ("Correct", 6, gcd);
	}
	
	@Test
	public void testCorrect3()                         // positive test case
	{
		GCD obj = new GCD () ;
		int gcd = obj.gcd (100, 3);
		assertEquals ("Correct", 1, gcd);
	}
	
//	@Test
//	public void testInCorrect1()                       // negative test case
//	{
//		GCD obj = new GCD () ;
//		int gcd = obj.gcd (100, 3);
//		assertEquals ("Incorrect", 2, gcd);
//	}
}

/****************************************************************************************
Name            : GreatestCommanDivisor
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test find gcd of two number.
                :
****************************************************************************************/


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GCDTest {

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
	public void test() {
		GCD objectGcd=new GCD(); 
		assertEquals(1,objectGcd.greatestcommondivisor(2, 1));
	}
	
	@Test
	public void test1() {
		GCD objectGcd=new GCD(); 
		assertEquals(6,objectGcd.greatestcommondivisor(12, 18));
	}
	
	@Test
	public void test2() {
		GCD objectGcd=new GCD(); 
		assertEquals(1,objectGcd.greatestcommondivisor(100,3));
	}

}

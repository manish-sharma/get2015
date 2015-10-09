package gcd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GreatestCommonDivisorTest {

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
	public void gcdTest1() {
		GreatestCommonDivisior gcdObject = new GreatestCommonDivisior();
		int result = gcdObject.gcd(2, 0);
		assertEquals(1,result);
		
	}
	@Test
	public void gcdTest2() {
		GreatestCommonDivisior gcdObject = new GreatestCommonDivisior();
		int result = gcdObject.gcd(12, 18);
		assertEquals(6,result);
		
	}
	@Test
	public void gcdTest3() {
		GreatestCommonDivisior gcdObject = new GreatestCommonDivisior();
		int result = gcdObject.gcd(100, 3);
		assertEquals(1,result);
		
	}

}

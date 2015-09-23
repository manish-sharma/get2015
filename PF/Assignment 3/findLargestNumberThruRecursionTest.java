import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class findLargestNumberThruRecursionTest {

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
	public void test1() {
		findLargestNumberThruRecursion testObj1 = new findLargestNumberThruRecursion();
		assertEquals(2, testObj1.largestDigit(2));
	}
	
	@Test
	public void test2() {
		findLargestNumberThruRecursion testObj2 = new findLargestNumberThruRecursion();
		assertEquals(9, testObj2.largestDigit(1257369));
	}
	
	@Test
	public void test3() {
		findLargestNumberThruRecursion testObj3 = new findLargestNumberThruRecursion();
		assertEquals(4, testObj3.largestDigit(444));
	}

}

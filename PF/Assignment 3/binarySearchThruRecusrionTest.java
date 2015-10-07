import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class binarySearchThruRecusrionTest {

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
		binarySearchThruRecursion testObj1 = new binarySearchThruRecursion();
		int[] array = {2, 5, 8, 9, 10, 55, 77};
		assertEquals(-1, testObj1.binarySearch(array, 0, 6, 88));
	}
	
	@Test
	public void test1() {
		binarySearchThruRecursion testObj2 = new binarySearchThruRecursion();
		int[] array = {2, 5, 8, 9, 10, 55, 77};
		assertEquals(6, testObj2.binarySearch(array, 0, 6, 77));
	}

}

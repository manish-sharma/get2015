import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
		BinarySearch testObj1 = new BinarySearch();
		int[] array = {2, 5, 8, 9, 10, 55, 77};
		assertEquals(-1, testObj1.binarySearch(88, array, 0, 6));
	}
	
	@Test
	public void test1() {
		BinarySearch testObj2 = new BinarySearch();
		int[] array = {2, 5, 8, 9, 10, 55, 77};
		assertEquals(6, testObj2.binarySearch(77, array, 0, 6));
	}

}

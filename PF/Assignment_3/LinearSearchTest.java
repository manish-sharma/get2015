import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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
	
	//NEGATIVE TEST CASE
	@Test
	public void test() {
		LinearSearch L = new LinearSearch();
		int[] arr = {2, 5, 8, 9, 10, 77, 55};
		int output = L.linearSearch(arr, 88);
		assertEquals("the no. is not persent in array ", -2, output);
				
	}
	
	//POSITIVE TEST CASE
	@Test
	public void test1() {
		LinearSearch L = new LinearSearch();
		int[] arr1 = {2, 5, 8, 9, 10, 77, 55, 11};
		int output = L.linearSearch(arr1, 77);
		assertEquals(6, output);
	}
}

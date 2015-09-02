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
 //positive test case
	@Test
	public void positiveTest() {
		int[] array = {1,1,1,2,3,4};
		int elementToSearch = 1;
		BinarySearch binarySearch = new BinarySearch();
		int[] result = binarySearch.binarySearch(array, elementToSearch);
		int[] expected = {0, 2};
		assertArrayEquals(expected, result);
	}
	
	//negative test case
	
	@Test
	public void negativeTest() {
		int[] array = {1,1,1,2,3,4};
		int elementToSearch = 5;
		BinarySearch binarySearch = new BinarySearch();
		int[] result = binarySearch.binarySearch(array, elementToSearch);
		int[] expected = {0, 2};
		assertArrayEquals(expected, result);
	}
}

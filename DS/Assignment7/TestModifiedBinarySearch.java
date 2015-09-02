/**
 * @author Girdhari
 * Test case for modified binary search program
 */
package question1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestModifiedBinarySearch {

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
	public void testModifiedBinarySearch() {
		ModifiedBinarySearch binarySearchObject = new ModifiedBinarySearch();
		int array[] = {2,3,3,3,3,4};
		int value = 4;
		int location = binarySearchObject.binarySearch(array, value);
		assertEquals(5, location);
	}
	
	@Test
	public void testModifiedBinarySearch1() {
		ModifiedBinarySearch binarySearchObject = new ModifiedBinarySearch();
		int array[] = {1,2,3,5,5,5};
		int value = 60;
		int location = binarySearchObject.binarySearch(array, value);
		assertEquals(-1, location);
	}

}

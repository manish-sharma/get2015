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
	public void binarysearchTest() {

		int arr[] = {1,1,1,2,3};
		int index = object.binarySearch(arr, 0, 4, 1);
		int left = object.getLeftMostOccurence(arr,0,index,1);
		int right = object.getRightMostOccurence(arr,index,5,1);
		assertEquals(2,index);
		assertEquals(left, 0);
		assertEquals(right, 2);
		}

}

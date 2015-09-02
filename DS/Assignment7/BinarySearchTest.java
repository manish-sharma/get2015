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
	public void testLeftMostOccurrence() {
		int arr[]={1,2,2,3,4,5,6,6,6,6,6,6,6,6,6,6,7,7,7};
		int value=7;
		BinarySearch object=new BinarySearch();
		int actualOutput=object.leftMostOccurrence(arr, 0, arr.length, value);
		int expectedOutput=16;
		assertEquals(expectedOutput,actualOutput);
	}
	
	@Test
	public void testRightMostOccurrence() {
		int arr[]={1,2,2,2,3,3,3,3,3,4,4,4,4};
		int value=3;
		BinarySearch object=new BinarySearch();
		int actualOutput=object.rightMostOccurrence(arr, 0, arr.length, value);
		int expectedOutput=8;
		assertEquals(expectedOutput,actualOutput);
	}

}

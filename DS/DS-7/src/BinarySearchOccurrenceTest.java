import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchOccurrenceTest {

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
	public void binarySearchTest() {
		
		int array[]={0,2,2,3,3,3,3,10,10};
		int expected[]={3,6};
		assertArrayEquals(expected, BinarySearch.leftRightOccurence(array, 3));
	}
	@Test
	public void binarySearchTest2() {
		int array[]={};
		int expected[]={-1,-1};
		assertArrayEquals(expected, BinarySearch.leftRightOccurence(array, 0));
	}
	@Test
	public void binarySearchTest3() {
		int array[]={0,1,34,56,8,10,9};
		int expected[]={-1,-1};
		assertArrayEquals(expected, BinarySearch.leftRightOccurence(array, 10));
	}

}

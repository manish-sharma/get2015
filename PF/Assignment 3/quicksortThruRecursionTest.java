import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class quicksortThruRecursionTest {

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
	public void testQuickSort1() {
		 quicksortThruRecursion testObj = new quicksortThruRecursion();
		int[] array = {2, 5, 8, 9, 10, 55, 77, 11};
		int[] expectedArray={2, 5, 8, 9, 10, 11, 55, 77};
		assertArrayEquals(expectedArray, testObj.quicksortRecursive(array, 0, 7));
	}
	
	@Test
	public void testQuickSort2()
	{
		 quicksortThruRecursion testObj=new quicksortThruRecursion();
		 int[] array={};
		 int[] expectedArray={};
		 assertArrayEquals(expectedArray, testObj.quicksortRecursive(array,0,0));
	}

}

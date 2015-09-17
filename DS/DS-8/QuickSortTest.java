import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortTest {

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

	/**
	 * Normal Test Case 1
	 */
	@Test
	public void test() {
		QuickSort testObject = new QuickSort();
		int[] expectedArray={11,12,13,14,15};
		int[] actualArray={12,15,13,14,11};
		assertArrayEquals(expectedArray,testObject.sort(actualArray));
	}
	
	/**
	 * Normal Test Case 2
	 * Test Case containing negative values
	 */
	@Test
	public void test2() {
		QuickSort testObject = new QuickSort();
		int[] expectedArray={-5,-4,0,4,5};
		int[] actualArray={5,4,-4,-5,0};
		assertArrayEquals(expectedArray,testObject.sort(actualArray));
	}
	
	
	/**
	 * Normal Test Case 3
	 * Negative values and values containing numbers like 01 and 004
	 */
	@Test
	public void test3() {
		QuickSort testObject = new QuickSort();
		int[] expectedArray={-52,1,4,12,14,14,25,36,58,125};
		int[] actualArray={14,12,01,125,25,36,14,-52,004,58};
		assertArrayEquals(expectedArray,testObject.sort(actualArray));
	}

	
	/**
	 * Normal Test Case 4
	 * To sort the given array {2,5,8,9,10, 77, 55, 11}

	 */
	@Test
	public void test4() {
		QuickSort testObject = new QuickSort();
		int[] expectedArray={2,5,8,9,10,11,55,77};
		int[] actualArray={2,5,8,9,10, 77, 55, 11};
		assertArrayEquals(expectedArray,testObject.sort(actualArray));
	}

}

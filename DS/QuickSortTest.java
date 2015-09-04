package sorting;

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

	
	  //Normal Test Case 1
	 
	@Test
	public void test() {
		QuickSort testObject = new QuickSort();
		int[] expectedArray={11,12,13,14,15};
		int[] actualArray={12,15,13,14,11};
		testObject.quickSort(actualArray,0,4);
		assertArrayEquals(expectedArray,actualArray);
	}
	
	
	 // Normal Test Case 2
	 //Test Case containing negative values
	 
	@Test
	public void test2() {
		QuickSort testObject = new QuickSort();
		int[] expectedArray={-5,-4,0,4,5};
		int[] actualArray={5,4,-4,-5,0};
		testObject.quickSort(actualArray,0,4);
		assertArrayEquals(expectedArray,actualArray);
	}
	
	

}

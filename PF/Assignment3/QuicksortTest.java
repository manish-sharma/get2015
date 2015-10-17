package QuickSort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuickSort {

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
	public void testQuickSort() {
		QuickSort quickSort=new QuickSort();
		int inputArray[]={33,2,1,44,66,23,22,2};
		int lowerIndex=0,higherIndex=inputArray.length-1;
		int afterSorting[]=quickSort.quickSorting(inputArray ,lowerIndex,higherIndex);
		int expected[]={1,2,2,22,23,33,44,66};
		assertArrayEquals(expected, afterSorting);
	}

	@Test
	public void testQuickSort1() {
		QuickSort quickSort=new QuickSort();
		int inputArray[] = {};
		int lowerIndex = 0 , higherIndex = inputArray.length-1;
		int afterSorting[] = quickSort.quickSorting(inputArray , lowerIndex , higherIndex);
		int expected[] = {};
		assertArrayEquals(expected , afterSorting);
	}

	@Test
	public void testQuickSort2() {
		QuickSort quickSort = new QuickSort();
		int inputArray[] = {2,4,7,10,12,13,45};
		int lowerIndex = 0 , higherIndex = inputArray.length-1;
		int afterSorting[] = quickSort.quickSorting(inputArray , lowerIndex , higherIndex);
		int expected[] = {2,4,7,10,12,13,45};
		assertArrayEquals(expected , afterSorting);
	}


}

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

	// positive case as per given in assignment;
	@Test
	public void testQuickSort() {
		int[] arr = {1,3,4,5,6};
		int[] arr1 = {6,5,1,3,4};
		new QuickSort().quickSort(arr1, 0, 4);
		assertArrayEquals(arr, arr1);
	}
	
	// positive case as per given in assignment;
	@Test
	public void testQuickSort1() {
		int[] arr = {1,3,5,4,6};
		int[] arr1 = {6,5,1,3,4};
		new QuickSort().quickSort(arr1, 0, 4);
		assertArrayEquals(arr, arr1);
	}
	
}

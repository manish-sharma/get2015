import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Quick_Sort1Test {

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
	public void test() {
		int[] input={2,5,8,9,10,11,55,77};
		int[] arr1 = {2,5,8,9,10,77,55,11};
		new QuickSort().quickSort(arr1,0,7);
		assertArrayEquals(input, arr1);
		}
	// positive case as per given in assignment;
	@Test
	public void test1() {
		int[] input={};
		int[] arr1 = {};
		new QuickSort().quickSort(arr1,0,0);
		assertArrayEquals(input, arr1);
		}
	// negative case as per given in assignment;
	@Test
	public void test2() {
		int[] input={2,5,8,9,10,11,55,77};
		int[] arr = {2,5,8,9,10,55,77,11};
		new Quick_Sort1().quickSort(arr,0,7);
		assertArrayEquals(input, arr);
		}
	
}

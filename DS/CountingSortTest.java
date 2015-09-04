package sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountingSortTest {

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
//Positive Test case
	@Test
	public void testCountingSort() {
		int array[] = {8,9,4,7,9,0};
		
		CountingSort.countingSort(array);
		int[] expected = {0,4,7,8,9,9};
		assertArrayEquals(expected, array);
	}
	
	//negative test case

	@Test
	public void testNegativeCountingSort() {
		int array[] = {-8,9,4,7,9,0};
		
		CountingSort.countingSort(array);
		int[] expected = {-8,0,4,7,9,9};
		assertArrayEquals(expected, array);
	}
}

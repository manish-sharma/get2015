package sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RadixSortTest {

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
	//positive test case
	@Test
	public void testRadixSort() {
		int array[] = {3,7,8,6,5,4};
		new RadixSort().radixSort(array);
		int expected[] = {3,4,5,6,7,8};
		assertArrayEquals(expected, array);
	}
	
	//negative test case
	@Test
	public void testNegativeRadixSort() {
		int array[] = {3,7,8,6,5,4};
		new RadixSort().radixSort(array);
		int expected[] = {3,7,8,6,5,4};
		assertArrayEquals(expected, array);
	}
	
	//positive test case
	@Test
	public void testRadixSort1() {
		int array[] = {-3,7,8,6,5,4};
		new RadixSort().radixSort(array);
		int expected[] = {-3,4,5,6,7,8};
		assertArrayEquals(expected, array);
	}
}

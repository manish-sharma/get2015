package sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {

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
	public void testBubbleSort() {
		int array[] = {3,7,8,6,5,4};
		BubbleSort.bubbleSort(array);
		int expected[] = {3,4,5,6,7,8};
		assertArrayEquals(expected, array);
	}
	
	//negative test case
	@Test
	public void testNegativeBubbleSort() {
		int array[] = {3,7,8,6,5,4};
		BubbleSort.bubbleSort(array);
		int expected[] = {3,7,8,6,5,4};
		assertArrayEquals(expected, array);
	}
	
	//positive test case
		@Test
		public void testBubbleSort1() {
			int array[] = {-3,7,8,6,5,4};
			BubbleSort.bubbleSort(array);
			int expected[] = {-3,4,5,6,7,8};
			assertArrayEquals(expected, array);
		}
}

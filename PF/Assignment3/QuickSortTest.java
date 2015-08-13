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

	@Test
	public void testSort() {

		int a1[] = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int expected1[] = { 2, 5, 8, 9, 10, 11, 55, 77 };
		assertArrayEquals(expected1, QuickSort.sort(a1));

		int a[] = {};
		int expected[] = {};
		assertArrayEquals(expected, QuickSort.sort(a));

		int a2[] = { 6, 5, 4, 3, 2, 1 };
		int expected2[] = { 1, 2, 3, 4, 5, 6 };
		assertArrayEquals(expected2, QuickSort.sort(a2));

		int a3[] = { 1, 1, 1, 0, 0, -1, -1, 2 };
		int expected3[] = { -1, -1, 0, 0, 1, 1, 1, 2 };
		assertArrayEquals(expected3, QuickSort.sort(a3));
	}

}

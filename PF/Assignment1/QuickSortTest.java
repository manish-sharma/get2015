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
	public void testQuickSort() {
		QuickSort testObj = new QuickSort();
		int[] array = {2, 5, 8, 9, 10, 55, 77, 11};
		assertArrayEquals(new int[]{2, 5, 8, 9, 10, 11, 55, 77}, testObj.quickSort(array, 0, 7));
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
	public void testLeftMost() {
		assertEquals(2, BinarySearch.leftMost(new int[] {1, 2, 3, 3, 3, 4, 5, 6, 7}, 3, 3));
	}

	@Test
	public void testRightMost() {
		assertEquals(4, BinarySearch.rightMost(new int[] {1, 2, 3, 3, 3, 4, 5, 6, 7}, 3, 3));
	}

	@Test
	public void testRecursiveBinarySearch() {
		assertEquals(2, BinarySearch.recursiveBinarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 0, 8, 3));
	}

	@Test
	public void testBinarySearchWithLoop() {
		assertEquals(2, BinarySearch.binarySearchWithLoop(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
	}

}

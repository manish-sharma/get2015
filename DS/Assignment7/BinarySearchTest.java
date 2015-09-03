package ds7;

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
	public void test() {
		int[] array = {1,2,2,4,5,5,5,6,6,7,8};
		int position = BinarySearch.getLeftMostOccurrenceIndex(array, 2, 0, (array.length-1));
		assertEquals("not match", 2, (position+1)  );
	}
	@Test
	public void test1() {
		int[] array = {1,2,2,4,5,5,5,6,6,7,8};
		int position = BinarySearch.getLeftMostOccurrenceIndex(array, 4, 0, (array.length-1));
		assertEquals("not match", 4, (position+1)  );
	}
	@Test
	public void test2() {
		int[] array = {1,2,2,4,5,5,5,6,6,7,8};
		int position = BinarySearch.getLeftMostOccurrenceIndex(array, 5, 0, (array.length-1));
		assertEquals("not match", 5, (position+1)  );
	}
	@Test
	public void test3() {
		int[] array = {1,2,2,4,5,5,5,6,6,7,8};
		int position = BinarySearch.getLeftMostOccurrenceIndex(array, 6, 0, (array.length-1));
		assertEquals("not match", 8, (position+1)  );
	}
	@Test
	public void test4() {
		int[] array = {1,2,2,4,5,5,5,6,6,7,8};
		int position = BinarySearch.getLeftMostOccurrenceIndex(array, 8, 0, (array.length-1));
		assertEquals("not match", 11, (position+1)  );
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitAssignment3 {

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
	public void test1() {
		Assignment3 obj = new Assignment3();
		int[] arr = {2,5,8,9,10, 77, 55, 11};
		assertArrayEquals(new int[]{2,5,8,9,10,11,55,77},obj.quicksort(arr,0,7));
	}
	
	@Test
	public void test2() {
		Assignment3 obj = new Assignment3();
		int[] arr = {9,1,2,3,6,5};
		assertArrayEquals(new int[]{1,2,3,5,6,9},obj.quicksort(arr,0,5));
	}

}

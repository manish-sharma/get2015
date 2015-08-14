package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickTest {
	Quick obj = new Quick();

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
	public void test() { // test case 1

		int[] arr = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int[] res = { 2, 5, 8, 9, 10, 11, 55, 77 };
		obj.quickSort(arr, 0, 7);
		assertArrayEquals(res, arr);

	}

	@Test
	public void tes1t() { // test case 2

		int[] ar1r = {};
		int[] res1 = {};
		obj.quickSort(ar1r, 0, 0);
		assertArrayEquals(res1, ar1r);

	}

}

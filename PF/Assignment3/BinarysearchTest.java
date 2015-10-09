package binarysearch;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarysearchTest {

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
	public void searchTest1() {
		Binarysearch bsObject = new Binarysearch();
		int inputArray[] = {2,5,8,9,10, 55, 77};
		int result = bsObject.binarySearch(inputArray, 0, 6, 88);
		assertEquals(-1, result);
	}

	@Test
	public void searchTest2() {
		Binarysearch bsObject = new Binarysearch();
		int inputArray[] = {2,5,8,9,10, 55, 77};
		int result = bsObject.binarySearch(inputArray, 0, 6, 77);
		assertEquals(6, result);
	}
	
}

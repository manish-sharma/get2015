package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * this is test class for binary search with left most element
 * @author Sumitra
 *
 */
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
	/**
	 * this is positive test case for binary search 
	 */
	public void testPositive() {
		int[] array = {1,1,1,2,3,4};
		int elementToSearch = 1;
		BinarySearch binarySearch = new BinarySearch();
		int  actual = binarySearch.binarySearch(array, elementToSearch,5,0);
		int expected = 0;
		assertEquals(expected, actual);

}
	@Test
	/**
	 * this is negative test case when element is not in array
	 */
	public void testNegative() {
		int[] array = {1,1,1,2,3,4};
		int elementToSearch = 5;
		BinarySearch binarySearch = new BinarySearch();
		int  actual = binarySearch.binarySearch(array, elementToSearch,5,0);
		int expected = -1;
		assertEquals(expected, actual);

}
	@Test
	public void test1() {
		int[] array = {1,1,1,2,3,4};
		int elementToSearch =-1;
		BinarySearch binarySearch = new BinarySearch();
		int  actual = binarySearch.binarySearch(array, elementToSearch,5,0);
		int expected = -1;
		assertEquals(expected, actual);

}
}

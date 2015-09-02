/**
 * @author : Pooja khandelwal
 * @created Date : 02/09/2015
 * @Name : TestBinarySearch class 
 * @Description : this class will test the findLeftMostOccuranceOfElement()  method of BinarySearch class
 */
package com.test.binarySearch;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.binarySearch.BinarySearch;

public class TestBinarySearch {
	private BinarySearch binarySearch; // BinarySearch class object

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		binarySearch = new BinarySearch();
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * @Nmae : positiveTestCase() method
	 * @param : nothing
	 * @Description : it will positively test the
	 *              findLeftMostOccuranceOfElement() method of BinarySearch
	 *              class(i.e. runs properly)
	 * @return : nothing
	 */
	@Test
	public void positiveTestCase() {
		int[] array = { 2, 3, 5, 5, 5, 6, 6 };
		int low = 0;
		int high = 7;
		int searchedElement = 5;
		int expectedLeftMostIndex = 2;
		int actualLeftMostIndex = binarySearch.findLeftMostOccuranceOfElement(
				array, array.length, low, high, searchedElement);
		assertEquals(expectedLeftMostIndex, actualLeftMostIndex);
	}

	/**
	 * @Nmae : negativeTestCase() method
	 * @param : nothing
	 * @Description : it will negatively test the
	 *              findLeftMostOccuranceOfElement() method of BinarySearch
	 *              class(i.e. gives error)
	 * @return : nothing
	 */
	@Test
	public void negativeTestCase() {
		int[] array = { 2, 3, 5, 5, 5, 6, 6 };
		int low = 0;
		int high = 7;
		int searchedElement = 5;
		int expectedLeftMostIndex = 3;
		int actualLeftMostIndex = binarySearch.findLeftMostOccuranceOfElement(
				array, array.length, low, high, searchedElement);
		assertEquals(expectedLeftMostIndex, actualLeftMostIndex);
	}

}

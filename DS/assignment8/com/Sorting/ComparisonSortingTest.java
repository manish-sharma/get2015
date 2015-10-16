package com.Sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * this is the test class for student roll no in sorted form using tree sort
 * @author Sumitra
 *
 */
public class ComparisonSortingTest {

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
	/**
	 * this test case method is for test positive values
	 * this use Bubble Sort
	 */
	@Test
	public void testforBubbleSort() {
		ComparisonSorting comparisonSorting = new ComparisonSorting();
		int[] input ={1,5,7,3,8};
		int[] output=comparisonSorting.sortComparison(input);
		int[] expected ={1,3,5,7,8};
		assertArrayEquals(expected, output);
	}
	@Test
	/**
	 * this test case method is for test positive values
	 * this use Quick Sort
	 */
	public void testforQuickSort() {
		ComparisonSorting comparisonSorting = new ComparisonSorting();
		int[] input ={1,5,7,3,8,0,12,16,45,9};
		int[] output=comparisonSorting.sortComparison(input);
		int[] expected ={0,1,3,5,7,8,9,12,16,45};
		assertArrayEquals(expected, output);
	}
	@Test
	/**
	 * this is negative test case  method for array in sorted form here unsorted list is 
	 * inserted in to expected list so it give negative response 
	 * 
	 */
	public void negativeTestforQuickSort() {
		ComparisonSorting comparisonSorting = new ComparisonSorting();
		int[] input ={1,5,7,3,8,0,12,16,45,9};
		int[] output=comparisonSorting.sortComparison(input);
		int[] expected ={0,1,5,3,7,8,9,12,16,45};
		assertArrayEquals(expected, output);
	}
	@Test
	/**
	 * this is negative test case  method for array in sorted form here unsorted list is 
	 * inserted in to expected list so it give negative response 
	 * 
	 */
	public void negativeTestforBubbleSort() {
		ComparisonSorting comparisonSorting = new ComparisonSorting();
		int[] input ={1,5,7,3,8,0,12,16,45};
		int[] output=comparisonSorting.sortComparison(input);
		int[] expected ={0,1,5,3,7,8,9,12,16,45};
		assertArrayEquals(expected, output);
	}

}

package com.Sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinearSortingTest {

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
	 * this test case method is for test positive values
	 * this use Counting sort
	 */
	public void testforCountingSort() {
		//LinearSorting linearSorting = new LinearSorting();
		int[] input ={1,5,7,3,8,0,12,16,45,9};
		int[] output=LinearSorting.sort(input);
		int[] expected ={0,1,3,5,7,8,9,12,16,45};
		assertArrayEquals(expected, output);
	}
	@Test
	/**
	 * this is negative test case  method for array in sorted form here unsorted list is 
	 * inserted in to expected list so it give negative response 
	 * 
	 */
	public void negativeTestforCountingSort() {
		//LinearSorting linearSorting = new LinearSorting();
		int[] input ={1,5,7,3,8,0,12,16,45,9};
		int[] output=LinearSorting.sort(input);
		int[] expected ={0,1,5,3,7,8,9,12,16,45};
		assertArrayEquals(expected, output);
	}
	@Test
	/**
	 * this test case method is for test positive values
	 * this use radix sort
	 */
	public void testforRadixSort() {
	//	LinearSorting linearSorting = new LinearSorting();
		int[] input ={1,5,7,3,8,0,12,16,45,99,100};
		int[] output=LinearSorting.sort(input);
		int[] expected ={0,1,3,5,7,8,12,16,45,99,100};
		assertArrayEquals(expected, output);
	}
	@Test
	/**
	 * this is negative test case  method for array in sorted form here unsorted list is 
	 * inserted in to expected list so it give negative response 
	 * 
	 */
	public void negativeTestforRadixSort() {
		//LinearSorting linearSorting = new LinearSorting();
		int[] input ={1,5,7,3,8,0,12,16,45,99,100};
		int[] output=LinearSorting.sort(input);
		int[] expected ={0,1,5,3,7,8,99,12,16,45,100};
		assertArrayEquals(expected, output);
	}
}

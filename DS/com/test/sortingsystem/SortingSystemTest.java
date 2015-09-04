/**
 * @author : Pooja Khandelwal
 * @crated Date : 04/09/2015
 * @Name : SortingSystemTest 
 * @Description : this class will test all the sorting functions of ComparisionSort class and LinearSort class
 */
package com.test.sortingsystem;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.system.sorting.ComparisionSort;
import com.system.sorting.LinearSort;

public class SortingSystemTest {
	private LinearSort linearSort = new LinearSort();
	private ComparisionSort comparisionSort = new ComparisionSort();

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
	 * @Name : positiveTestCountingSort()
	 * @Description : this method will positively test the countingSort() method
	 *              of LinearSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void positiveTestCountingSort() {
		// LinearSort countngSort=new LinearSort();
		int inputArray[] = new int[] { 23, 12, 15, 67, 10 };
		int maxElement = 67;
		int expectedArray[] = new int[] { 10, 12, 15, 23, 67 };
		int actualArray[] = linearSort.countingSort(maxElement, inputArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : negativeTestCountingSort()
	 * @Description : this method will negatively test the countingSort() method
	 *              of LinearSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void negativeTestCountingSort() {
		int inputArray[] = new int[] { 23, 12, 15, 67, 10 };
		int maxElement = 67;
		int expectedArray[] = new int[] { 12, 10, 15, 23, 67 };
		int actualArray[] = linearSort.countingSort(maxElement, inputArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : positiveTestRadixSort()
	 * @Description : this method will positively test the radixSort() method of
	 *              LinearSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void positiveTestRadixSort() {
		int inputArray[] = new int[] { -121, -189, 34, 2, 987 };
		int totalDigitsInMaxElement = 3;
		int expectedArray[] = new int[] { -189, -121, 2, 34, 987 };
		int actualArray[] = linearSort.radixSort(totalDigitsInMaxElement,
				inputArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : negativeTestRadixSort()
	 * @Description : this method will negatively test the radixSort() method of
	 *              LinearSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void negativeTestRadixSort() {
		int inputArray[] = new int[] { -121, -189, 34, 2, 987 };
		int totalDigitsInMaxElement = 3;
		int expectedArray[] = new int[] { -189, 2, -121, 34, 987 };
		int actualArray[] = linearSort.radixSort(totalDigitsInMaxElement,
				inputArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : positiveTestQuickSort()
	 * @Description : this method will positively test the quickSort() method of
	 *              ComparisionSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void positiveTestQuickSort() {
		int inputArray[] = new int[] { 23, 12, 15, 67, 10 };
		int low = 0;
		int high = 4;
		int expectedArray[] = new int[] { 10, 12, 15, 23, 67 };
		int actualArray[] = comparisionSort.quickSort(inputArray, low, high);

		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : negativeTestQuickSort()
	 * @Description : this method will negatively test the quickSort() method of
	 *              ComparisionSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void negativeTestQuickSort() {
		int inputArray[] = new int[] { 23, 12, 15, 67, 10 };
		int low = 0;
		int high = 4;
		int expectedArray[] = new int[] { 10, 12, 15, 67, 23 };
		int actualArray[] = comparisionSort.quickSort(inputArray, low, high);
		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : positiveTestBubbleSort()
	 * @Description : this method will positively test the bubbleSort() method
	 *              of ComparisionSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void positiveTestBubbleSort() {
		int inputArray[] = new int[] { 23, 12, 15, 67, 10 };
		int expectedArray[] = new int[] { 10, 12, 15, 23, 67 };
		int actualArray[] = comparisionSort.bubbleSort(inputArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	/**
	 * @Name : negativeTestBubbleSort()
	 * @Description : this method will negatively test the bubbleSort() method
	 *              of ComparisionSort class
	 * @param :
	 * @return :
	 */
	@Test
	public void negativeTestBubbleSort() {
		int inputArray[] = new int[] { 23, 12, 15, 67, 10 };
		int expectedArray[] = new int[] { 10, 12, 23, 15, 67 };
		int actualArray[] = comparisionSort.bubbleSort(inputArray);
		assertArrayEquals(expectedArray, actualArray);
	}

}

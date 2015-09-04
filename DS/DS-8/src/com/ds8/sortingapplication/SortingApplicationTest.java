package com.ds8.sortingapplication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortingApplicationTest {

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

	boolean isArrayEquals(int expectedArray[], int actualArray[]) {
		boolean isArrayEqual = true;
		for (int i = 0; i < actualArray.length; i++) {
			if (actualArray[i] != expectedArray[i]) {
				isArrayEqual = false;
			}
		}

		return isArrayEqual;
	}

	@Test
	public void testingComparisonSortValidCaseForBubbleSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 2, 4, 1, 67, 8 };
		String actualTypeOfSorting = object.selectComparisonSort(inputArray);
		String expectedTypeOfSorting = "Bubble Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertTrue(flag);
	}

	@Test
	public void testingBubbleSort() {
		// SortingSystem object = new SortingSystem();
		int[] inputArray = { 2, 4, 1, 67, 8 };
		int[] expectedArray = { 1, 2, 4, 8, 67 };
		assertArrayEquals(expectedArray, BubbleSort.bubbleSort(inputArray));

	}

	@Test
	public void testingQuickSort() {
		// SortingSystem object = new SortingSystem();
		int[] inputArray = { 12, 1, 11, 2, 10, 3, 9, 4, 8, 5, 7, 6 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		assertArrayEquals(expectedArray,
				QuickSort.quickSort(inputArray, 0, inputArray.length));
	}

	@Test
	public void testingCountingSort() {
		// SortingSystem objectOfSortingSystem = new SortingSystem();
		int[] inputArray = { 34, 67, 12, 8 };
		int[] expectedArray = { 8, 12, 34, 67 };
		assertArrayEquals(expectedArray, CountingSort.countSort(inputArray));

	}

	@Test
	public void testingRadixSort() {
		// SortingSystem objectOfSortingSystem = new SortingSystem();
		int[] inputArray = { 342, 671, 12, 8 };
		int[] expectedArray = { 8, 12, 342, 671 };
		assertArrayEquals(expectedArray, RadixSort.radixSort(inputArray, 671));

	}

	@Test
	public void testingComparisonSortInvalidCaseForbubbleSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 2, 4, 1, 67, 8 };
		String actualTypeOfSorting = object.selectComparisonSort(inputArray);
		String expectedTypeOfSorting = "selectionSort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertFalse(flag);
	}

	@Test
	public void testingComparisonSortValidCaseForQuickSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 2, 4, 1, 67, 8, 23, 11, 89, 12, 99, 45, 101 };
		String actualTypeOfSorting = object.selectComparisonSort(inputArray);
		String expectedTypeOfSorting = "Quick Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertTrue(flag);
	}

	@Test
	public void testingComparisonSortInalidCaseForQuickSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 2, 4, 1, 67, 8, 23, 11, 89, 12, 99, 45, 101 };
		String actualTypeOfSorting = object.selectComparisonSort(inputArray);
		String expectedTypeOfSorting = "Tree Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertFalse(flag);
	}

	@Test
	public void testingLinearSortValidCaseForCountingSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 23, 67, 99, 76, 42 };
		int num = object.checkMaximumNumber(inputArray);
		String actualTypeOfSorting = object.selectLinearSort(num);
		String expectedTypeOfSorting = "Counting Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertTrue(flag);
	}

	@Test
	public void testingLinearSortInvalidCaseForCountingSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 23, 67, 99, 76, 42 };
		int num = object.checkMaximumNumber(inputArray);
		String actualTypeOfSorting = object.selectLinearSort(num);
		String expectedTypeOfSorting = "tree Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertFalse(flag);
	}

	@Test
	public void testingLinearSortValidCaseForRadixSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 23, 67, 99, 765, 427 };
		int num = object.checkMaximumNumber(inputArray);
		String actualTypeOfSorting = object.selectLinearSort(num);
		String expectedTypeOfSorting = "Radix Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertTrue(flag);
	}

	@Test
	public void testingLinearSortInalidCaseForRadixSort() {
		SortingSystem object = new SortingSystem();
		int[] inputArray = { 23, 67, 99, 765, 427 };
		int num = object.checkMaximumNumber(inputArray);
		String actualTypeOfSorting = object.selectLinearSort(num);
		String expectedTypeOfSorting = "merge Sort";
		boolean flag = actualTypeOfSorting
				.equalsIgnoreCase(expectedTypeOfSorting);
		assertFalse(flag);
	}
}

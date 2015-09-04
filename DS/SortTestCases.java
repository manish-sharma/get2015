import static org.junit.Assert.*;

import org.junit.Test;
/**
 * class to test sorting algorithm
 * @author Ankur
 * @since 03-09-2015
 */

public class SortTestCases {
	Sort sort = new Sort();
	/**
	 * test case for bubble sorting
	 */
	@Test
	public void bubbleSortTest() {

		int[] expected ={1,2,3,4};
		int[] actual = sort.bubbleSort(new int[]{2,3,1,4});
		assertArrayEquals(expected, actual);
	}
	/**
	 * test case for quick sort algorithm
	 */
	@Test
	public void quickSortTest(){
		int[] expected ={1,2,3,4,5,6,7,8,9,10,11};
		int[] actual = sort.bubbleSort(new int[]{2,3,1,4,9,10,11,8,5,7,6});
		assertArrayEquals(expected, actual);
	}
	/**
	 * test case for count sort algorithm
	 */
	@Test
	public void countSortTest(){
		int[] expected ={1,2,3,4,5,6,7,8,9,10,11};
		int[] actual = sort.sort(new int[]{2,3,1,4,9,10,11,8,5,7,6});
		assertArrayEquals(expected, actual);
	}
	/**
	 *  test case for radix sort algorithm
	 */
	@Test
	public void radixSortTest() {
		int[] actual = sort.sort(new int[]{ 1000, 456, 201, 101, 100 });
		int expected[] = { 100, 101, 201, 456, 1000 };
		assertArrayEquals(expected, actual);
	}

}

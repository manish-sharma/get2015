package SortingSystem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

import org.junit.Test;

public class SortingSystemTest {

	@Test
	public void PositiveTestForRadixSort() {
		LinearSort radixSort = new LinearSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(21);
		array.add(999);
		array.add(29);
		array.add(65);
		array.add(23);
		array.add(28);
		array.add(90);
		array.add(389);
		List<Integer> arrayExpected = array;
		Collections.sort(arrayExpected);
		assertEquals(arrayExpected, radixSort.radixSort(array, 999));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void NegativeForRadixSort() {
		LinearSort radixSort = new LinearSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(-21);
		array.add(-99);
		array.add(0);
		array.add(-3);
		array.add(-4);
		array.add(0);
		array.add(90898);
		array.add(389);
		radixSort.radixSort(array, 90898);
		assertFalse(true);
	}
	@Test
	public void PositiveTestForCountingSort() {
		LinearSort countingSort = new LinearSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(13);
		array.add(6);
		array.add(0);
		array.add(45);
		array.add(78);
		array.add(89);
		array.add(10);
		List<Integer> arrayExpected = array;
		Collections.sort(arrayExpected);
		assertEquals(arrayExpected, countingSort.countingSort(array));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void NegativeTestForCountingSort() {
		LinearSort countingSort = new LinearSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(-21);
		array.add(-99);
		array.add(0);
		array.add(-3);
		array.add(-4);
		array.add(0);
		array.add(90898);
		array.add(389);
		countingSort.countingSort(array);
		assertFalse(true);
	}
	
	@Test
	public void PositiveTestForQuickSort() {
		ComparisonSort quickSort = new ComparisonSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(21);
		array.add(999);
		array.add(29);
		array.add(65);
		array.add(23);
		array.add(28);
		array.add(90);
		array.add(389);
		List<Integer> arrayExpected = array;
		Collections.sort(arrayExpected);
		assertEquals(arrayExpected,quickSort.quickSort(array, 0,array.size()-1));
	}
	@Test
	public void NegativeForQuicSort() {
		ComparisonSort quickSort = new ComparisonSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(-21);
		array.add(-99);
		array.add(0);
		array.add(-3);
		array.add(-4);
		array.add(0);
		array.add(90898);
		array.add(389);
		List<Integer> arrayExpected = array;
		Collections.sort(arrayExpected);
		assertEquals(arrayExpected,quickSort.quickSort(array, 0,array.size()-1));
	}
	@Test
	public void PositiveTestForBubbleSort() {
		ComparisonSort bubbleSort = new ComparisonSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(21);
		array.add(999);
		array.add(29);
		array.add(65);
		array.add(23);
		array.add(28);
		array.add(90);
		array.add(389);
		List<Integer> arrayExpected = array;
		Collections.sort(arrayExpected);
		assertEquals(arrayExpected, bubbleSort.bubbleSort(array));
	}

	@Test
	public void NegativeForBubble() {
		ComparisonSort bubbleSort = new ComparisonSort();
		List<Integer> array = new ArrayList<Integer>();
		array.add(-21);
		array.add(-99);
		array.add(0);
		array.add(-3);
		array.add(-4);
		array.add(0);
		array.add(90898);
		array.add(389);
		List<Integer> arrayExpected = array;
		Collections.sort(arrayExpected);
		assertEquals(arrayExpected, bubbleSort.bubbleSort(array));
	}
}
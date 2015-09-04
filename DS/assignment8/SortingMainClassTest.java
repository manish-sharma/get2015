package ds8;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortingMainClassTest {

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
	public void test() {
		SortingMainClass sortingMainClass = new SortingMainClass();
		sortingMainClass.list.add(111);
		sortingMainClass.list.add(25);
		sortingMainClass.list.add(5);
		sortingMainClass.list.add(456);
		sortingMainClass.list.add(452);
		sortingMainClass.list.add(44);
		sortingMainClass.list.add(75);
		sortingMainClass.list.add(47);
		sortingMainClass.list.add(3563);
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(sortingMainClass.list, 0, (sortingMainClass.list.size()-1));
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(44);
		list.add(47);
		list.add(75);
		list.add(111);
		list.add(452);
		list.add(456);
		list.add(3563);
		assertEquals(list, sortingMainClass.list);
	}
	@Test
	public void test1() {
		SortingMainClass sortingMainClass = new SortingMainClass();
		sortingMainClass.list.add(111);
		sortingMainClass.list.add(25);
		sortingMainClass.list.add(5);
		sortingMainClass.list.add(456);
		sortingMainClass.list.add(452);
		sortingMainClass.list.add(44);
		sortingMainClass.list.add(75);
		sortingMainClass.list.add(47);
		sortingMainClass.list.add(3563);
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(sortingMainClass.list);
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(44);
		list.add(47);
		list.add(75);
		list.add(111);
		list.add(452);
		list.add(456);
		list.add(3563);
		assertEquals(list, sortingMainClass.list);
	}
	@Test
	public void test2() {
		SortingMainClass sortingMainClass = new SortingMainClass();
		sortingMainClass.list.add(111);
		sortingMainClass.list.add(25);
		sortingMainClass.list.add(5);
		sortingMainClass.list.add(456);
		sortingMainClass.list.add(452);
		sortingMainClass.list.add(44);
		sortingMainClass.list.add(75);
		sortingMainClass.list.add(47);
		sortingMainClass.list.add(3563);
		RadixSort radixSort = new RadixSort();
		radixSort.radixSort(sortingMainClass.list, 3563);
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(44);
		list.add(47);
		list.add(75);
		list.add(111);
		list.add(452);
		list.add(456);
		list.add(3563);
		assertEquals(list, sortingMainClass.list);
	}
	@Test
	public void test3() {
		SortingMainClass sortingMainClass = new SortingMainClass();
		sortingMainClass.list.add(11);
		sortingMainClass.list.add(25);
		sortingMainClass.list.add(5);
		sortingMainClass.list.add(45);
		sortingMainClass.list.add(41);
		sortingMainClass.list.add(44);
		sortingMainClass.list.add(75);
		sortingMainClass.list.add(47);
		sortingMainClass.list.add(35);
		CountingSort countingSort = new CountingSort();
		countingSort.countingSort(sortingMainClass.list);
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(11);
		list.add(25);
		list.add(35);
		list.add(41);
		list.add(44);
		list.add(45);
		list.add(47);
		list.add(75);
		assertEquals(list, sortingMainClass.list);
	}

}

package secondprogram;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortingSystemTest {

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
	public void quickSortTest() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=QuickSort.sortedArray(arr, 0, arr.length);
		int[] expectedArray={1,2,3,4,5,6,7};
		assertArrayEquals(expectedArray,actual);
		
	}
	
	@Test
	public void bubbleSortTest() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=BubbleSort.sortedArray(arr);
		int[] expectedArray={1,2,3,4,5,6,7};
		assertArrayEquals(expectedArray,actual);
		
	}
	
	@Test
	public void countingSortTest() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=CountingSort.sortedArray(arr, 7);
		int[] expectedArray={1,2,3,4,5,6,7};
		assertArrayEquals(expectedArray,actual);
		
	}
	
	@Test
	public void radixSortTest() {
		int arr[]={2,3,5,1,4,6,7};
		int newArr[]=RadixSort.sortedArray(arr);
		int[] expectedArray={1,2,3,4,5,6,7};
		assertArrayEquals(expectedArray,newArr);
		
	}
	
	@Test
	public void selectComparisonSortTest() {
		SortingSystem object=new SortingSystem();
		int arr[]={2,3,5,1,4,6,7};
		String actual=object.selectComparisonSort(arr);
		String expected="Bubble Sort";
		assertEquals("", expected, actual);

	}
	
	@Test
	public void selectComparisonSortTest1() {
		SortingSystem object=new SortingSystem();
		int arr[]={2,3,5,1,4,6,7,13,0,42,31,54,7};
		String actual=object.selectComparisonSort(arr);
		String expected="Quick Sort";
		assertEquals("", expected, actual);

	}

	@Test
	public void selectLinearSortTest() {
		SortingSystem object=new SortingSystem();
		int arr[]={2,3,5,1,4,6,7,13,0,42,31,54,7};
		int maximumNumber=object.checkMaximumNumber(arr);
		String actual=object.selectLinearSort(maximumNumber);
		String expected="Counting Sort";
		assertEquals("", expected, actual);

	}
	
	@Test
	public void selectLinearSortTest1() {
		SortingSystem object=new SortingSystem();
		int arr[]={241,3330,51211,101,4,623,7,13,0,42,3143};
		int maximumNumber=object.checkMaximumNumber(arr);
		String actual=object.selectLinearSort(maximumNumber);
		String expected="Radix Sort";
		assertEquals("", expected, actual);

	}
	
	//Negative Test
	@Test
	public void quickSortTest2() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=QuickSort.sortedArray(arr, 0, arr.length);
		int[] expectedArray={1,2,3,4,5,8,7};
		assertNotEquals("Not Matched", expectedArray, actual);
		
	}
	
	@Test
	public void bubbleSortTest2() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=BubbleSort.sortedArray(arr);
		int[] expectedArray={1,2,3,4,6,6,7};
		assertNotEquals("Not Matched", expectedArray, actual);
		
	}
	
	
	@Test
	public void countingSortTest2() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=CountingSort.sortedArray(arr, 7);
		int[] expectedArray={1,2,3,4,4,5,6,7};
		assertNotEquals("Not Matched", expectedArray, actual);
		
	}
	
	@Test
	public void radixSortTest2() {
		int arr[]={2,3,5,1,4,6,7};
		int actual[]=RadixSort.sortedArray(arr);
		int[] expectedArray={1,2,3,7,7,4,5,6,7};
		assertNotEquals("Not Matched", expectedArray, actual);
		
	}
	
	@Test
	public void selectComparisonSortTest3() {
		SortingSystem object=new SortingSystem();
		int arr[]={2,3,5,1,4,6,7};
		String actual=object.selectComparisonSort(arr);
		String expected="Quick Sort";
		assertNotEquals("", expected, actual);

	}
	
	@Test
	public void selectComparisonSortTest4() {
		SortingSystem object=new SortingSystem();
		int arr[]={2,3,5,1,4,6,7,13,0,42,31,54,7};
		String actual=object.selectComparisonSort(arr);
		String expected="Bubble Sort";
		assertNotEquals("", expected, actual);

	}
	

	@Test
	public void selectLinearSortTest3() {
		SortingSystem object=new SortingSystem();
		int arr[]={2,3,5,1,4,6,7,13,0,42,31,54,7};
		int maximumNumber=object.checkMaximumNumber(arr);
		String actual=object.selectLinearSort(maximumNumber);
		String expected="Radix Sort";
		assertNotEquals("", expected, actual);

	}
	
	@Test
	public void selectLinearSortTest4() {
		SortingSystem object=new SortingSystem();
		int arr[]={241,3330,51211,101,4,623,7,13,0,42,3143};
		int maximumNumber=object.checkMaximumNumber(arr);
		String actual=object.selectLinearSort(maximumNumber);
		String expected="Counting Sort";
		assertNotEquals("", expected, actual);

	}
}

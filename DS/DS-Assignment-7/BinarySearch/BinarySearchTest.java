package BinarySearch;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
	
	BinarySearch binarySearch = new BinarySearch(9);	//create object of BinarySearch class
	
	@Test//positive test case
	public void binarySearchtest() {
		int array[] = {1,2,3,4,4,4,5,6,7};
		int expected = 3;
		binarySearch.addInArray(array);
		int result = binarySearch.leftOccuranceByBinarySearch(4, 0, array.length-1); //call binary search method
		assertEquals(expected, result);
	}
	
	@Test//negative test case when array is empty
	public void binarySearchtestEmptyArray() {
		int array[] = {};
		int expected =-1;
		int result = new BinarySearch(0).leftOccuranceByBinarySearch( 4, 0, array.length-1); //call binary search method
		//System.out.println(" "+result);
		assertEquals(expected, result);
	}
	
	@Test//positive test case
	public void binarySearchtestNegativeArray() {
		int array[] = {-8,-7,-6,-5,-5,-5,2,8,45};
		int expected = 3;
		binarySearch.addInArray(array);
		int result = binarySearch.leftOccuranceByBinarySearch( -5, 0, array.length-1); //call binary search method
		//System.out.println(" "+result);
		assertEquals(expected, result);	
	}

}

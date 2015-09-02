import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestLeftMostBinarySearch {

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
	public void testLeftMostBinarySearch() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] ={1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,6};
		int searchNumber = 6;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber,0, inputArray.length-1);
		int expected=11;
		assertEquals(expected,index);
		
	}
	
	@Test
	public void testLeftMostBinarySearch1() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] ={1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,6};
		int searchNumber = 7;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber,0, inputArray.length-1);
		int expected=-1;
		assertEquals(expected,index);
	}
	@Test
	public void testLeftMostBinarySearch2() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] ={};
		int searchNumber =6;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber,0, inputArray.length-1);
		int expected=-1;
		assertEquals(expected,index);
	}

	@Test
	public void testLeftMostBinarySearch3() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] = null;
		int searchNumber = 8;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber, 0, 0);
		int expected=-1;
		assertEquals(expected,index);
	}

	@Test
	public void testLeftMostBinarySearch4() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] ={-4,-4,-3,-3,-3,-3,-1, 0, 4 ,4};
		int searchNumber = -2;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber,0, inputArray.length-1);
		int expected=-1;
		assertEquals(expected,index);
	}

	@Test
	public void testLeftMostBinarySearch5() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] ={1,2,3,3,3,3,3,3,3,3,3,4};
		int searchNumber = 4;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber,0, inputArray.length-1);
		int expected=11;
		assertEquals(expected,index);
	}

	@Test
	public void testLeftMostBinarySearch6() {
		
		LeftMostBinarySearch leftMostBinarySearch = new LeftMostBinarySearch();
		int inputArray[] ={3,3,3,3,3,3,3,3,3};
		int searchNumber = 3;
		int index=leftMostBinarySearch.leftMostBinarySearch(inputArray, searchNumber,0, inputArray.length-1);
		int expected=0;
		assertEquals(expected,index);
	}

}

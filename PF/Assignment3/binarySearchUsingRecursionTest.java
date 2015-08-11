import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class binarySearchUsingRecursionTest {

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
	public void binarySearchtest1() {
		binarySearchUsingRecursion objectOfbiBinarySearchUsingRecursion=new binarySearchUsingRecursion();
		int expectedlocation=-1;
		int[] inputArray={2,5,8,9,10,77,55};
		int number=88;
		int lowerBound=0,upperBound=6;
		int actuallocation=objectOfbiBinarySearchUsingRecursion.binarySearch(inputArray,number,lowerBound,upperBound);
		assertEquals("Match",expectedlocation,actuallocation);
		
	}
	@Test
	public void binarySearchtest2() {
		binarySearchUsingRecursion objectOfbiBinarySearchUsingRecursion=new binarySearchUsingRecursion();
		int expectedlocation=6;
		int[] inputArray={2,5,8,9,10,77,55};
		int number=77;
		int lowerBound=0,upperBound=6;
		int actuallocation=objectOfbiBinarySearchUsingRecursion.binarySearch(inputArray,number,lowerBound,upperBound);
		assertEquals("Match",expectedlocation,actuallocation);
		
	}

}

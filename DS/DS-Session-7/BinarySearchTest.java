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

	@Test
	public void binarySearchtest1() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={1,2,3,2,2,2,2,2,2,2};
		int output=binarySearchObject.binarySearch(input,5);
		assertEquals(-1, output);
	}
	@Test
	public void binarySearchtest2() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={1,2,2,2,2,2,2,2,2,2};
		int output=binarySearchObject.binarySearch(input,2);
		assertEquals(1, output);
	}
	@Test
	public void binarySearchtest3() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={1,1,1,1,1,1,1,1,2,2};
		int output=binarySearchObject.binarySearch(input,2);
		assertEquals(8, output);
	}
	@Test
	public void binarySearchtest4() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={2,3,3,4,5,6,7,8,9,9};
		int output=binarySearchObject.binarySearch(input,2);
		assertEquals(0, output);
	}
	@Test
	public void binarySearchtest5() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={};
		int output=binarySearchObject.binarySearch(input,5);
		assertEquals(-1, output);
	}
}

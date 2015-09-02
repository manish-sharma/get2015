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
	public void searchItemtest1() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={1,2,3,2,2,2,2,2,2,2};
		int output=binarySearchObject.searchItem(5,input,0,input.length-1);
		assertEquals(-1, output);
	}
	@Test
	public void searchItemtest2() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={1,2,2,2,2,2,2,2,2,2};
		int output=binarySearchObject.searchItem(2,input,0,input.length-1);
		assertEquals(2, output);
	}
	@Test
	public void searchItemtest3() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={1,1,1,1,1,1,1,1,2,2};
		int output=binarySearchObject.searchItem(2,input,0,input.length-1);
		assertEquals(9, output);
	}
	@Test
	public void searchItemtest4() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={2,3,3,4,5,6,7,8,9,9};
		int output=binarySearchObject.searchItem(2,input,0,input.length-1);
		assertEquals(1, output);
	}
	@Test
	public void searchItemtest5() {
		BinarySearch binarySearchObject=new BinarySearch();
		int input[]={};
		int output=binarySearchObject.searchItem(5,input,0,input.length-1);
		assertEquals(-1, output);
	}
}

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


	// positive case as per given in assignment;
	@Test
	public void test1() {
	          int [] arr1 = {2, 5, 8, 9, 10, 55, 77};
	          BinarySearch BS= new BinarySearch();
	          
	          int out=BS.binarySearch(arr1, 77, 7, 0);
	          assertEquals(7, out);

	}
	// negative case as per given in assignment;
	@Test
	public void test2() {
	          int [] arr1={2,5,8,9,10, 55, 77};
	          BinarySearch B= new BinarySearch();
	          
	          int out=B.binarySearch(arr1, 77, 7, 0);
	          assertEquals(5, out);

	}
}

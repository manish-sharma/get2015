import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test5 {

	Program5 object = new Program5();
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
	public void test1() {                //When number is found
		int arr[]= {2,5,8,9,10,55,77};
		assertEquals("Number Found",6,object.binarySearch(77,0,6,arr));
		
	}
	
	@Test
	public void test2() {              //When number is not found
		int arr[]= {2,5,8,9,10,55,77};
		assertEquals("Number not Found",-1,object.binarySearch(88,0,6,arr));
		
	}

}

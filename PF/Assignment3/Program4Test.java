import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Program4Test {
	Program4 object= new Program4();
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
		int arr[]= {2,5,8,9,10,77,55};
		assertEquals("Number Found",5,object.linearSearch(77,0,arr));
		
	}
	
	@Test
	public void test2() {              //When number is not found
		int arr[]= {2,5,8,9,10,77,55};
		assertEquals("Number not Found",-1,object.linearSearch(88,0,arr));
		
	}

}

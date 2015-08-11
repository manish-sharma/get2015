import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Linear_searchTest {

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
// positive case AS PER GIVEN IN ASSIGNMENT
	@Test
	public void test() {
		Linear_search L=new Linear_search();
		int[] arr={2,5,8,9,10, 77, 55};
		int output=L.linear_search(arr, 88);
		assertEquals(-1, output);
				
	}
	// POSITIVE CASE AS PER GIVEEN IN ASSIGNMENT
	@Test
	public void test1() {
		Linear_search L=new Linear_search();
		int[] arr1= {2,5,8,9,10,77,55,11};
		int output=L.linear_search(arr1, 77);
		assertEquals(6, output);
	}
}

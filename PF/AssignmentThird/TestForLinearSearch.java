import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForLinearSearch {

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
	public void testIfValueIsNotPresent() {
		LinearSearch linear=new LinearSearch();
		int arr[]={2,5,8,9,10, 77, 55};
		assertEquals("correct result",0,linear.search(88,0,arr));
	}
	@Test
	public void testIfValueIsPresent() {
		LinearSearch linear=new LinearSearch();
		int arr[]={2,5,8,9,10, 77, 55, 11};
		assertEquals("correct result",6,linear.search(77,0,arr));
	}
	@Test
	public void testIfValueIsPresentAtFirst() {
		LinearSearch linear=new LinearSearch();
		int arr[]={2,5,8,9,10, 77, 55, 11};
		assertEquals("correct result",1,linear.search(2,0,arr));
	}
	@Test
	public void testIfValueIsPresentAtLast() {
		LinearSearch linear=new LinearSearch();
		int arr[]={2,5,8,9,10, 77, 55, 11};
		assertEquals("correct result",8,linear.search(11,0,arr));
	}

}

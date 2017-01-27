import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitAssignment2 {

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
	public void test1() {
		Assignment2 obj = new Assignment2();
		
		assertEquals(-1,obj.linearsearch(new int[]{2,5,8,9,10,77,55},0,6, 88));
		assertEquals(1,obj.linearsearch(new int[]{2,5,8,9,10,77,55,11},0,7, 77));
		
	}
	
	
	@Test
	public void test2() {
		Assignment2 obj = new Assignment2();
		
		assertEquals(-1,obj.binarysearch(new int[]{2,5,8,9,10,77,55},0,6, 88));
		assertEquals(1,obj.binarysearch(new int[]{2,5,8,9,10,77,55},0,6, 77));
		
	}
	

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest3 {

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
	public void test() {
		Assignment3 obj1=new Assignment3();
		int[] array={1,2,3,4,5,1,2,1,2,3,1};
	
		int[] arrayP=obj1.longestSequence(array);	
		int[] arrayE={1,2,3,4,5};
		
		assertArrayEquals("Not Deleted Properly",arrayE,arrayP );
		
		//fail("Not yet implemented");
	}

}

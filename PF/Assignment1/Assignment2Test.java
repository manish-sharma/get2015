import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment2Test {

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
	public void deleteDuplicate() {
		Assignment2 obj1=new Assignment2();
		int[] array={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
	
		int[] arrayP=obj1.removeDuplicate(array);	
		int[] arrayE={2,5,4,6,3,8,9,0};
		
		assertArrayEquals("Not Deleted Properly",arrayE,arrayP );
		
	}

}

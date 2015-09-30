import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest2 {

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
	public void positiveTest()                           /*JUnit Test Function of Permutation for Positive Case*/ 
	{
		String expect="ABC\nACB\nBAC\nBCA\nCBA\nCAB\n";
		
		Assignment2  ass=new Assignment2 ();
		assertEquals(expect, ass.permutation("ABC"));
		
		 
	}
	
/*	@Test
	public void nagativeTest()                            //JUnit Test Function of Permutation for Negative Case
	{
		String expect="ABC\nACB\nBAC   \nBCA\nCBA\nCAB\n";
		
		Assignment2  ass=new Assignment2 ();
		assertEquals(expect, ass.permutation("ABC"));
		
	}*/

}

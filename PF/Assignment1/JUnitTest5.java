import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest5 {

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
	public void checkForAscendingSortOrder(){
		Assignment5 obj=new Assignment5();
		int[] a={1,2,3,4,5,8};
		int result=obj.isSorted(a);
		
		assertEquals("Not in acending order",1,result );
	}
	
	@Test
	public void checkForDescendingSortOrder(){
		Assignment5 obj=new Assignment5();
		int[] a={8,7,6,5,4,3,2};
		int result=obj.isSorted(a);
		
		assertEquals("Not in decending order",2,result);
	}
	
	@Test
	public void checkForSort(){
		Assignment5 obj=new Assignment5();
		int[] a={1,2,3,4,5,81,15,20,57};
		int result=obj.isSorted(a);
		
		assertEquals("Not Sorted",0,result );
	}

	
	

}

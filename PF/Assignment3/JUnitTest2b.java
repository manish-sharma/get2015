import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest2b {

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
	public void positiveTest() 
	{
		int arr[]={2,5,8,9,10,55,77};
		int element=88;
				
		Assignment2b ab=new Assignment2b();
		int status=ab.binarySearch(arr,element,0,arr.length-1);
		
	    assertEquals(-1,status);
		 
	}
	
/*	@Test
	public void nagativeTest() 
	{
		int arr[]={2,5,8,9,10,55,77};
		int element=88,index=0,status;
		
		Assignment2a aa=new Assignment2a();
		status=aa.lenearSearch(arr,element,index);
		
	    assertEquals(1,status);
		
	} */
	@Test(expected=Exception.class)
	public void dividedByZeroExample1(){
		//int e = 1/0;
	}


}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest3 {

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
		int arr[]={8,10,55,9,2,5,77};
				
		int expected[]={2,5,8,9,10,55,77};
		
		Assignment3 a=new Assignment3();
		assertArrayEquals(expected,a.quickSort(arr,0,(arr.length-1)));
		
		 
	}
	
/*	@Test
	public void nagativeTest() 
	{
		int arr[]={8,10,55,9,2,5,77};
		int element=88,index=0;
		
		int expected[]={2,5,77,8,9,10,55};
		
		Assignment3 a=new Assignment3();
		assertArrayEquals(expected,a.quickSort(arr,0,(arr.length-1)));
		
	} */
	@Test(expected=Exception.class)
	public void dividedByZeroExample1(){
		//int e = 1/0;
		
	}


}



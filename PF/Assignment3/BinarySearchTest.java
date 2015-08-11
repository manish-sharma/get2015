import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void testEmptyInput()   // -2 denotes that array is empty
	{
		BinarySearch obj = new BinarySearch () ;
		int arr[] = {};
		int begin = 0, end = arr.length-1, mid = (begin+end)/2;
		int location = obj.binarySearch (arr, 88, begin, end, mid);	
		assertEquals ("Correct", -2, location);
	}	
	
	@Test
	public void testNotFound()    // -1 denotes that the item is not found in the array
	{
		BinarySearch obj = new BinarySearch () ;
		int arr[] = {2,5,8,9,10,55,77};
		int begin = 0, end = arr.length-1, mid = (begin+end)/2;
		int location = obj.binarySearch (arr, 88, begin, end, mid);
		assertEquals ("Correct", -1, location);
	}
	
	@Test
	public void testFound()                            // positive test case
	{
		BinarySearch obj = new BinarySearch () ;
		int arr[] = {2,5,8,9,10,55,77};
		int begin = 0, end = arr.length-1, mid = (begin+end)/2;
		int location = obj.binarySearch (arr, 77, begin, end, mid);
		assertEquals ("Correct", 7, location);
	}
	
//	@Test
//	public void testIncorrectPosition()                // negative test case
//	{
//		BinarySearch obj = new BinarySearch () ;
//		int arr[] = {2,5,8,9,10,55,77};
//	    int begin = 0, end = arr.length-1, mid = (begin+end)/2;
//	    int location = obj.binarySearch (arr, 88, begin, end, mid);
//		assertEquals ("Incorrect", 6, location);
//	}

}

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
	public void testNotFound() 
	{
		LinearSearch obj = new LinearSearch () ;
		int arr[] = {2,5,8,9,10,55,77};
		int location = obj.linearSearch (arr, 88);
		assertEquals ("Correct", -1, location);
	}
	
	@Test
	public void testFound()                            // positive test case
	{
		LinearSearch obj = new LinearSearch () ;
		int arr[] = {2,5,8,9,10,55,77};
		int location = obj.linearSearch (arr, 77);
		assertEquals ("Correct", 7, location);
	}
	
//	@Test
//	public void testIncorrectPosition()                // negative test case
//	{
//		LinearSearch obj = new LinearSearch () ;
//		int arr[] = {2,5,8,9,10,55,77};
//		int location = obj.linearSearch (arr, 77);
//		assertEquals ("Incorrect", 6, location);
//	}

}

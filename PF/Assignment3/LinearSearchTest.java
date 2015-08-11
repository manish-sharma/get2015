import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinearSearchTest
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
	public void testEmptyInput() 					// -2 denotes that array is empty
	{
		LinearSearch obj = new LinearSearch () ;
		int arr[] = {};
		int location = obj.linearSearch (arr, 88);
		assertEquals ("Correct", -2, location);
	}
	
	@Test
	public void testNumNotFound() 					// -1 denotes that item is not found in the the array
	{
		LinearSearch obj = new LinearSearch () ;
		int arr[] = {2,5,8,9,10,77,55};
		int location = obj.linearSearch (arr, 88);
		assertEquals ("Correct", -1, location);
	}
	
	@Test
	public void testNumFound() 
	{
		LinearSearch obj = new LinearSearch () ;
		int arr[] = {2,5,8,9,10, 77, 55, 11};
		int location = obj.linearSearch (arr, 77);
		assertEquals ("Correct", 6, location);
	}

}

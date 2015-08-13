import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySortOrderTest {


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
	public void testIncreasingArray()         // test case for increasing array
	{
		ArraySortOrder obj = new ArraySortOrder();
		int arrInput[] = {1,5,7};
		assertEquals("Matched : ", 1, obj.sortOrderOfArray(arrInput));
	}
	
	@Test
	public void testDecreasingArray()         // test case for decreasing array
	{
		ArraySortOrder obj = new ArraySortOrder();
		int arrInput[] = {11,9,7};
		assertEquals("Matched : ", 2, obj.sortOrderOfArray(arrInput));
	}
	
	@Test
	public void testUnsortedArray()           // test case for unsorted array
	{
		ArraySortOrder obj = new ArraySortOrder();
		int arrInput[] = {5,2,9};
		assertEquals("Matched : ", 0, obj.sortOrderOfArray(arrInput));
	}

}

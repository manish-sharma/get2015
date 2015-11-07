package programingFundamental3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchElementTest
{
	SearchElement obj=new SearchElement();
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
	public void linearSearchTest1()
	{
		int expectedValue=-1;
		int[] array= {2,5,8,9,10, 77, 55};
		assertEquals("not match",expectedValue,obj.linearSearchElement(array, 88, 0, array.length-1));
	}
	@Test
	public void linearSearchTest2()
	{
		int expectedValue=6;
		int[] array= {2,5,8,9,10, 77, 55,11};
		assertEquals("not match",expectedValue,obj.linearSearchElement(array, 77, 0, array.length-1));
	}
	@Test
	public void binarySearchTest1()
	{
		int expectedValue=-1;
		int[] array= {2,5,8,9,10, 55, 77};
		assertEquals("not match",expectedValue,obj.binarySearchElement(array, 88, 0, array.length-1));
	}
	@Test
	public void binarySearchTest2()
	{
		int expectedValue=7;
		int[] array= {2,5,8,9,10, 55, 77};
		assertEquals("not match",expectedValue,obj.binarySearchElement(array, 77, 0, array.length-1));
	}

}

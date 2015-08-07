package SortedArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSortedArray {

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
	public void test()
	{
		SortedArray obj=new SortedArray();
		int a[]={5,4,3,2,1};
		int output=obj.isSorted(a);
		assertEquals(2, output);
	}
	@Test
	public void test1()
	{
		SortedArray obj=new SortedArray();
		int a[]={1,4,5,8,9};
		int output=obj.isSorted(a);
		assertEquals(1, output);
	}
	@Test
	public void test2()
	{
		SortedArray obj=new SortedArray();
		int a[]={5,4,3,5,1};
		int output=obj.isSorted(a);
		assertEquals(0, output);
	}
}
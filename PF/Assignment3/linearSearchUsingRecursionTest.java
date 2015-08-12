import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class linearSearchUsingRecursionTest {

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
	public void linearSearchTestNumberExist() 
	{
		linearSearchUsingRecursion objectOfliLinearSearchUsingRecursion=new linearSearchUsingRecursion();
		int expectedlocatin=7;
		int[] inputArray={2,5,8,9,10,55,77};
		int number=77;
		int actuallocation=objectOfliLinearSearchUsingRecursion.linearSearch(number,inputArray,6);
		assertEquals("match",expectedlocatin,actuallocation);
	}

	
	@Test
	public void linearSearchTestNumberNotExist() 
	{
		linearSearchUsingRecursion objectOfliLinearSearchUsingRecursion=new linearSearchUsingRecursion();
		int expectedlocatin=-1;
		int[] inputArray={2,5,8,9,10,55,77};
		int number=88;
		int actuallocation=objectOfliLinearSearchUsingRecursion.linearSearch(number,inputArray,6);
		assertEquals("match",expectedlocatin,actuallocation);
	}
}

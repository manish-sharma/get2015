import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest 
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
	public void testEmptyInputArray() 
	{
		QuickSort obj = new QuickSort () ;
		int inputArr[] = {};
		int expectedArr[] = {};
		int left = -1, right = -1;
		int outputArr[] = obj.quickSort (inputArr, left, right);
		assertArrayEquals ("true", expectedArr, outputArr);
	}
	
	@Test
	public void testCorrect()      // positive test case, gives green bar on execution
	{
		QuickSort obj = new QuickSort () ;
		int inputArr[] = {2,5,8,9,10,77,55,11};
		int expectedArr[] = {2,5,8,9,10,11,55,77};
		int left = 0, right = inputArr.length - 1;
		int outputArr[] = obj.quickSort (inputArr, left, right);
		assertArrayEquals ("Sorted", expectedArr, outputArr);
	}
	
//	@Test
//	public void testIncorrect()    // negative test case, fails when it is run so gives red bar on execution
//	{
//		QuickSort obj = new QuickSort () ;
//		int inputArr[] = {2,5,8,9,10,77,55,11};
//		int expectedArr[] = {2,5,8,9,11,10,55,77};
//		int left = 0, right = inputArr.length - 1;
//		int outputArr[] = obj.quickSort (inputArr, left, right);
//		assertArrayEquals ("Not Sorted", expectedArr, outputArr);
//	}
}

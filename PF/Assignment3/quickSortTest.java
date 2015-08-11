import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class quickSortTest {

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

	public void testQuickSort1()
	{
		quickSort objeQuickSort=new quickSort();
		int expectedOutput[]={2,5,8,9,10,11,55,77};
		int inputArray[]={2,5,8,9,10,77,55,11};
		int lowerBound=0,upperBound=7;
		int actualOutput[]=objeQuickSort.quickSortUsingRecursion(inputArray,lowerBound,upperBound);
		assertArrayEquals("match",expectedOutput,actualOutput);
	}
	

	@Test
	public void testQuickSort2()
	{
		quickSort objeQuickSort=new quickSort();
		int expectedOutput[]={};
		int inputArray[]={};
		int lowerBound=-1,upperBound=-1;
		int actualOutput[]=objeQuickSort.quickSortUsingRecursion(inputArray,lowerBound,upperBound);
		assertArrayEquals("match",expectedOutput,actualOutput);
	}
	

}

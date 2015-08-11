package pf_assignment_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest 
{

	@Test
	public void test() 
	{
		
		int[] inputArray1= {2,5,8,9,10,77,55,11};//input array 1
		int[] inputArray2= {};//input array 2
		int[] expected1={2,5,8,9,10,11,55,77};//expected value 1 for input array 1
		int[] expected2={};//expected value 1 for input array 2
		new QuickSort().quickSort(inputArray1, 0, 7);//method calling for inputarray 1
		
		assertArrayEquals("correct",expected1,inputArray1);//check the expected and actual values
		new QuickSort().quickSort(inputArray1, 0, 0);//method calling for inputarray 2
		assertArrayEquals("correct",expected2,inputArray2);//check the expected and actual values
	}

}

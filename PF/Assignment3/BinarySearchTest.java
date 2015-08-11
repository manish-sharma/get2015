package pf_assignment_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest 
{
/*test case for binary search algorithm*/
	@Test
	public void test() 
	{
		BinarySearch ob=new BinarySearch();//class object
		int[] inputArray1= {2,5,8,9,10, 55, 77};//input array 1
		int[] inputArray2={2,5,8,9,10,55,77};//input array 2
		int expexted1=-1;//expected value 1 for input array 1
		int expected2=6;//expected value 1 for input array 2
		int output1=ob.recursiveBinarySearch(inputArray1, 0, inputArray1.length, 88);//method calling for inputarray 1
		int output2=ob.recursiveBinarySearch(inputArray2, 0, inputArray2.length, 77);//method calling for inputarray 2
		assertEquals("correct",expexted1,output1);//check the expected and actual values
		assertEquals("correct",expected2,output2);//check the expected and actual values
	}

}

package pf_assignment_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSearchTest 
{
	/*test case for linear search algorithm*/

	@Test
	public void test() 
	{
		LinearSearch ob=new LinearSearch();//object for linear search
		int[] inputArray1= {2,5,8,9,10, 77, 55};//input array 1
		int[] inputArray2={2,5,8,9,10, 77, 55, 11};//input array 2
		int expexted1=-1;//expected value 1 for input array 1
		int expected2=5;//expected value 2 for input array 2
		int output1=ob.linearSearch(inputArray1, 88, 0);// method calling for inputarray 1
		int output2=ob.linearSearch(inputArray2, 77, 0);//method calling for input array 2
		assertEquals("correct",expexted1,output1);//check the expected and actual values
		assertEquals("correct",expected2,output2);//check the expected and actual values
	}

}

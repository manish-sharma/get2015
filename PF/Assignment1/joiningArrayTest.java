package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class joiningArrayTest 
{
	

	@Test
	public void test()
	{
		joiningArray obj=new joiningArray();
		int[] firstArray={2,4,5};//first array
		int[] secondArray={1,2,3};//second array
		int[] thirdArray=new int[firstArray.length+secondArray.length];
		int[] expected={1,2,2,3,4,5};//expected value
		int[] actual=obj.join(firstArray,3,secondArray,3,thirdArray);
		assertArrayEquals("correct",expected,actual);//check the expected and actual value
	}

}

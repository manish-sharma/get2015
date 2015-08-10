package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class increasSequencTest {

	@Test
	public void test() 
	{
		increasSequenc obj=new increasSequenc();
		int input[]={1,2,3,4,5,2,3,4,7,8,9,1,2,3,3,3,4,5,6,7,8,9};//input array
		int actual[]=obj.longestSequence(input);//method calling to find longest sequence
		int expected[]={1,2,3,3,3,4,5,6,7,8,9};//expected output
		
		assertArrayEquals(expected, actual);//check the expected and the actual values
	}

}

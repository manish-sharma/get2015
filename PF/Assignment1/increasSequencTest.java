package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class increasSequencTest {

	@Test
	public void test() 
	{
		increasSequenc obj=new increasSequenc();
		int input[]={1,2,3,4,5,2,3,4,7,8,9,1,2,3,3,3,4,5,6,7,8,9};
		int actual[]=obj.longestSequence(input);
		int expected[]={1,2,3,3,3,4,5,6,7,8,9};
		
		assertArrayEquals(expected, actual);
	}

}

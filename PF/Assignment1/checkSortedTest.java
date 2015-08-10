package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class checkSortedTest {

	@Test
	public void test()
	{
		int input[]={23,23,23,21,21};//input array
		checkSorted ob=new checkSorted();
		int expected=2;//expected value
		int actual=ob.isSorted(input);//method calling
		assertEquals(expected,actual);//check the expected and actual value
		
		
	}

}

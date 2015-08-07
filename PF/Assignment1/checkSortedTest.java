package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class checkSortedTest {

	@Test
	public void test()
	{
		int a[]={23,23,23,21,21};
		checkSorted ob=new checkSorted();
		int c=0;
		int d=ob.isSorted(a);
		assertEquals(c,d);
		
		
	}

}

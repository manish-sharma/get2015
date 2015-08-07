package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class joiningArrayTest 
{
	

	@Test
	public void test()
	{
		joiningArray obj=new joiningArray();
		int[] a={2,3,4};
		int[] b={1,2,3};
		int[] c=new int[10];
		int[] d={1,2,2,3,3,4};
		int[] e=obj.join(a, 3, b, 3, c);
		assertArrayEquals("correct",d,e);
	}

}

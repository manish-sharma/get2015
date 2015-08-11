package pf_assignment_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class remGcdTest 
{
	/*test case to check the expected output is equal to actual output*/
	remGcd obj=new remGcd();//class object

	@Test
	public void test1()
	{
		/*test case to check expected remainder and actual remainder*/
		assertEquals(1, obj.rem(100, 3));
		assertEquals(-1, obj.rem(2, 0));
		assertEquals(0, obj.rem(2, 1));
	}
	public void test2()
	{
		/*test case to check expected gcd and actual gcd*/
		assertEquals(1, obj.gcd(2, 1));
		assertEquals(6, obj.gcd(12, 18));
		assertEquals(1, obj.gcd(100,3));
	}
	public void  test3() 
	{
		/*test case to check largest integer with the expected integer and the actual integer*/
		assertEquals(1, obj.largestdigit(100));
		assertEquals(1, obj.largestdigit(1257369));
		assertEquals(1, obj.largestdigit(444));
	}

}

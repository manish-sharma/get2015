package programingFundamental3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberFunctionTest {

	NumberFunction obj= new NumberFunction();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void remTest1() 
	{
		int expectedValue=0;
		assertEquals("match failed",obj.rem(2, 1),expectedValue);
	}
	@Test
	public void remTest2()
	{
		int expectedValue=-1;
		assertEquals("match failed",obj.rem(2, 0),expectedValue);
	}
	@Test
	public void remTest3()
	{
		int expectedValue=1;
		assertEquals("match failed",obj.rem(100, 3),expectedValue);
	}
	@Test
	public void gcdTest1()
	{
		int expectedValue=1;
		assertEquals("match failed",obj.gcd(2, 1),expectedValue);
	}
	@Test
	public void gcdTest2()
	{
		int expectedValue=6;
		assertEquals("match failed",obj.gcd(12, 18),expectedValue);
	}
	@Test
	public void gcdTest3()
	{
		int expectedValue=1;
		assertEquals("match failed",obj.gcd(100, 3),expectedValue);
	}
	@Test
	public void largestDigitTest1()
	{
		int expectedValue=2;
		assertEquals("match failed",obj.largestDigit(2),expectedValue);
	}
	@Test
	public void largestDigitTest2()
	{
		int expectedValue=9;
		assertEquals("match failed",obj.largestDigit(1257369),expectedValue);
	}
	@Test
	public void largestDigitTest3()
	{
		int expectedValue=4;
		assertEquals("match failed",obj.largestDigit(444),expectedValue);
	}

}

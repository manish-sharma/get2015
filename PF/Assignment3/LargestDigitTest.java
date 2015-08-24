import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LargestDigitTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testCorrect1()                    // positive test case
	{
		LargestDigit obj = new LargestDigit () ;
		int maxDigit = obj.largestdigit (2);
		assertEquals ("Correct", 2, maxDigit);
	} 
	
	@Test
	public void testCorrect2()                    // positive test case
	{
		LargestDigit obj = new LargestDigit () ;
		int maxDigit = obj.largestdigit (1257369);
		assertEquals ("Correct", 9, maxDigit);
	}  
	
	@Test
	public void testCorrect3()                    // positive test case
	{
		LargestDigit obj = new LargestDigit () ;
		int maxDigit = obj.largestdigit (444);
		assertEquals ("Correct", 4, maxDigit);
	} 
	
//	@Test
//	public void testInCorrect1()                    // negative test case
//	{
//		LargestDigit obj = new LargestDigit () ;
//		int maxDigit = obj.largestdigit (1257369);
//		assertEquals ("Correct", 7, maxDigit);
//	}

}

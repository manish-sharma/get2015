import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class remainderByRecursionTest 
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
	public void testCorrect1() 
	{
		remainderByRecursion obj = new remainderByRecursion () ;
		int remainder = obj.rem (2, 1);
		assertEquals ("Correct", 0, remainder);
	}
	
	@Test
	public void testCorrect2() 
	{
		remainderByRecursion obj = new remainderByRecursion () ;
		int remainder = obj.rem (100, 3);
		assertEquals ("Correct", 1, remainder);
	} 

	@Test
	public void testCorrect3() 
	{
		remainderByRecursion obj = new remainderByRecursion () ;
		int remainder = obj.rem (2, 0);
		assertEquals ("Correct", 2, remainder);
	} 
}

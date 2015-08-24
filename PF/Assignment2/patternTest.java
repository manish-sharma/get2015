import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class patternTest 
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
	public void testSpaces()     // test spaces in a given row
	{
		pattern obj = new pattern();
		String arrExpectedSpaces[] = {" "," "};
		assertArrayEquals("Match", arrExpectedSpaces, obj.spaces(2,5));
    }
	
	@Test
	public void testNumbers()    // test numbers in a given row
	{
		pattern obj = new pattern();
		String arrExpectedNumbers[] = {"1","2","3"};
		assertArrayEquals("Match", arrExpectedNumbers, obj.numbers(2,5));	
	}
	
	@Test
	public void testPattern()    // test pattern in a given row
	{
		pattern obj = new pattern();
		String arrExpectedPattern[] = {" "," ","1","2","3"};
		assertArrayEquals("Match", arrExpectedPattern, obj.printPattern(2,5));	
	}

}

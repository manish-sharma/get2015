import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class pyramidTest 
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
		pyramid obj = new pyramid();
		String arrExpectedSpaces[] = {" "," "};
		assertArrayEquals("Match", arrExpectedSpaces, obj.spaces(2,5));
    }
	
	@Test
	public void testNumbers()    // test numbers in a given row
	{
		pyramid obj = new pyramid();
		String arrExpectedNumbers[] = {"1","2","3","2","1"};
		assertArrayEquals("Match", arrExpectedNumbers, obj.numbers(2,5));	
	}
	
	@Test
	public void testPyramid()    // test pattern in a given row
	{
		pyramid obj = new pyramid();
		String arrExpectedPyramid[] = {" "," ","1","2","3","2","1"};
		assertArrayEquals("Match", arrExpectedPyramid, obj.printPyramid(2,5));	
	}
	
}

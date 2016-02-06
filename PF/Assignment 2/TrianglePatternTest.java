import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TrianglePatternTest {

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
	public void testspaces()
	{
		
		TrianglePattern trianglePattern=new TrianglePattern();
		String outputCheck=trianglePattern.space(2, 5);
		String outputExpected=" ";
		boolean flag=outputCheck.equals(outputExpected);
		assertTrue("Pass", flag);
	}
	@Test
	public void testnumber()
	{
	
		TrianglePattern trianglePattern=new TrianglePattern();
		String outputCheck=trianglePattern.number(2, 5);
		String outputExpected="1234";
		boolean flag=outputCheck.equals(outputExpected);
		assertTrue("Pass", flag);
	}
	@Test
	public void testWholePattern()
	{
		TrianglePattern trianglePattern=new TrianglePattern();
		String outputCheck[]=trianglePattern.finalPattern(5);
		String outputExpected=" 1234";
		boolean flag=outputCheck[2].equals(outputExpected);
		assertTrue("Pass",flag);
	}

	@Test
	public void testspaces_failure()
	{
		
		TrianglePattern trianglePattern=new TrianglePattern();
		String outputCheck=trianglePattern.space(2, 5);
		String outputExpected="   ";
		boolean flag=outputCheck.equals(outputExpected);
		assertFalse("Fail", flag);
	}
	
	@Test
	public void testnumber_failure()
	{
	
		TrianglePattern trianglePattern=new TrianglePattern();
		String outputCheck=trianglePattern.number(2, 5);
		String outputExpected="1234100";
		boolean flag=outputCheck.equals(outputExpected);
		assertFalse("Fail", flag);
	}
	
	@Test
	public void testWholePattern_Failure()
	{
		TrianglePattern trianglePattern=new TrianglePattern();
		String outputCheck[]=trianglePattern.finalPattern(5);
		String outputExpected=" 1234  ";
		boolean flag=outputCheck[2].equals(outputExpected);
		assertFalse("Fail",flag);
	}
	
}

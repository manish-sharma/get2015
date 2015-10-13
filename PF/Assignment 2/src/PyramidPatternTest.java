import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PyramidPatternTest {

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
	public void testspace_pass() 
	{
		PyramidPattern pyramidPattern=new PyramidPattern();
		String outputCheck=pyramidPattern.space(2, 5);
		String outputExpected="   ";
		boolean flag=outputCheck.equals(outputExpected);
		assertTrue("Pass", flag);
	
	}
	
	@Test
	public void testnumber_pass() 
	{
		PyramidPattern pyramidPattern=new PyramidPattern();
		String outputCheck=pyramidPattern.number(2, 5);
		String outputExpected="121";
		boolean flag=outputCheck.equals(outputExpected);
		assertTrue("Pass", flag);
	}

	@Test
	public void testwhole_pass() 
	{
		PyramidPattern pyramidPattern=new PyramidPattern();
		String outputCheck[]=pyramidPattern.Pyramid(5);
		String outputExpected="   121";
		boolean flag=outputCheck[1].equals(outputExpected);
		assertTrue("Pass", flag);
	}
	
	@Test
	public void testspace_fail() 
	{
		PyramidPattern pyramidPattern=new PyramidPattern();
		String outputCheck=pyramidPattern.space(5, 5);
		String outputExpected="       ";
		boolean flag=outputCheck.equals(outputExpected);
		assertTrue("Fail!! spaces are wrong", flag);
	}
	
	@Test
	public void testnumber_fail() 
	{
		PyramidPattern pyramidPattern=new PyramidPattern();
		String outputCheck=pyramidPattern.number(5, 5);
		String outputExpected="123456789";
		boolean flag=outputCheck.equals(outputExpected);
		assertTrue("Fail!! numbers pattern is wrong", flag);
	}
  @Test
	public void testWholePattern_Failure()
	{
		PyramidPattern pyramidPattern=new PyramidPattern();
		String outputCheck[]=pyramidPattern.Pyramid(5);
		String outputExpected=" 134567890   ";
		boolean flag=outputCheck[2].equals(outputExpected);
		assertTrue("Fail!! output of program is wrong",flag);
	}
}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class printPatternTest {

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
	public void test_spaces() 
	{
		printPattern object=new printPattern();
		String expected_output="";
		String actual_output=object.spaces(1,5);
		boolean flag=expected_output.equals(actual_output);
		assertTrue("Match",flag);
    }
	@Test
	public void test_numbers() 
	{
		printPattern object=new printPattern();
		String expected_output="12345";
		String actual_output=object.numbers(1,5);
		boolean flag=expected_output.equals(actual_output);
		assertTrue("Match",flag);
	}
	@Test
	public void test_pyramid() 
	{
		printPattern object=new printPattern();
		String expected_output="12345";
		String actual_output[]=object.pattern(1,5);
		boolean flag=expected_output.equals(actual_output[1]);
		assertTrue("Match",flag);

	}
}

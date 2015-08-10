import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class print_PyramidTest {

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
		print_Pyramid object=new print_Pyramid();
		String expected_output="    ";
		String actual_output=object.spaces(1,5);
		boolean flag=expected_output.equals(actual_output);
		assertTrue("Match",flag);
    }
	@Test
	public void test_numbers() 
	{
		print_Pyramid object=new print_Pyramid();
		String expected_output="1";
		String actual_output=object.numbers(1,5);
		boolean flag=expected_output.equals(actual_output);
		assertTrue("Match",flag);
	}
	@Test
	public void test_pyramid() 
	{
		print_Pyramid object=new print_Pyramid();
		String expected_output="    1";
		String actual_output[]=object.pyramid(1,5);
		boolean flag=expected_output.equals(actual_output[0]);
		assertTrue("Match",flag);

	}
}

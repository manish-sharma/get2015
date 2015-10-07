import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//@RunWith(value=Parameterized.class)

public class test_pattern1 {
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
	public void test_space() {
		pyramid_pattern_1 obj = new pyramid_pattern_1();
		String resultSpace = obj.space(9,5);
		assertEquals("   ",resultSpace);
	}
	
	
	@Test
	public void test_number(){
		pyramid_pattern_1 obj = new pyramid_pattern_1();
		String resultNumber = obj.numbers(9,5);
		
		assertEquals("121",resultNumber);
	}
	
	@Test
	public void test_whole_pattern(){
		pyramid_pattern_1 obj = new pyramid_pattern_1();
		//String space_arr[]=new String[5];
		
		
		String wholePyramid[] = obj.pyramid(9);
		String expected[] = {"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		assertArrayEquals(expected,wholePyramid);	
	}
	
	

	

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class test_pattern {

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
		Pyramid_pattern obj = new Pyramid_pattern();
		String resultSpace = obj.spaces(2,5);
		assertEquals("  ",resultSpace);
	}
	

	@Test
	public void test_number(){
		Pyramid_pattern obj = new Pyramid_pattern();
		String resultNumber = obj.numbers(0,5);;
		
		assertEquals("12345",resultNumber);
	}
	
	@Test
	public void test_whole_pattern(){
		Pyramid_pattern obj = new Pyramid_pattern();
		//String space_arr[]=new String[5];
		//=new String[200];
		
		String wholePyramid[] = obj.fullPattern(3);
		String expected[] = {"123"," 12","  1"};
		assertArrayEquals(expected,wholePyramid);	
	}

}

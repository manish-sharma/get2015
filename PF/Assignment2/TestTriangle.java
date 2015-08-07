package Triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTriangle {

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
	public void testWholePyramid()
	{
		Triangle obj=new Triangle();
		String wholeTriangle[] =obj.getTriangle(5);
		String expected[]={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected,wholeTriangle);
		
	}
	@Test
	public void testGetSpace()
	{
		Triangle obj=new Triangle();
		String actual =obj.getSpace(4, 5);
		String expected="    ";
		assertEquals(expected,actual);
		
	}

	@Test
	public void testGetNo()
	{
		Triangle obj=new Triangle();
		String actual =obj.getNo(1, 5);
		String expected="1234";
		assertEquals(expected,actual);
		
	}
}
											
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ReverseRightTringleTest {

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
	ReverseRightTringle reverseRightTringle = new ReverseRightTringle(); 
	@Test
	public void testSpaces() {
		
		
		assertEquals(" ", reverseRightTringle.spaces(2, 5));
		assertEquals("", reverseRightTringle.spaces(1, 5));
		assertEquals("    ", reverseRightTringle.spaces(5, 5));
		
	}
	
	@Test
	public void testNumbers() {
		assertEquals("12345", reverseRightTringle.numbers(1, 5));
		assertEquals("1", reverseRightTringle.numbers(5, 5));
		assertEquals("1234", reverseRightTringle.numbers(2, 5));
	}

	@Test
	public void testReversrRightTringle() {
		String expected[]={"123"," 12","  1"};
		assertArrayEquals(expected, reverseRightTringle.reversrRightTringle(3));
		
		String expected1[]={"1"};
		assertArrayEquals(expected1, reverseRightTringle.reversrRightTringle(1));
	}

}

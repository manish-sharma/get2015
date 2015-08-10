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

	@Test
	public void testSpaces() {

		assertEquals(" ", ReverseRightTringle.spaces(2, 5));
		assertEquals("", ReverseRightTringle.spaces(1, 5));
		assertEquals("    ", ReverseRightTringle.spaces(5, 5));

	}

	@Test
	public void testNumbers() {
		assertEquals("12345", ReverseRightTringle.numbers(1, 5));
		assertEquals("1", ReverseRightTringle.numbers(5, 5));
		assertEquals("1234", ReverseRightTringle.numbers(2, 5));
	}

	@Test
	public void testReversrRightTringle() {
		String expected[] = { "123", " 12", "  1" };
		assertArrayEquals(expected, ReverseRightTringle.reversrRightTringle(3));

		String expected1[] = { "1" };
		assertArrayEquals(expected1, ReverseRightTringle.reversrRightTringle(1));
	}

}

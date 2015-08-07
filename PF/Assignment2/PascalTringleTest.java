import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PascalTringleTest {

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
	PascalTringle pascalTringle= new PascalTringle();
	
	@Test
	public void testSpaces() {
		assertEquals("    ", pascalTringle.spaces(1, 5));
		assertEquals("", pascalTringle.spaces(5, 5));
		assertEquals(" ", pascalTringle.spaces(6, 5));
		assertEquals("    ", pascalTringle.spaces(9, 5));
	}

	@Test
	public void testNumbers() {
		assertEquals("121", pascalTringle.numbers(2, 5));
		assertEquals("1", pascalTringle.numbers(1, 5));
		assertEquals("1234321", pascalTringle.numbers(6, 5));
		assertEquals("1", pascalTringle.numbers(9, 5));
	}
    
	@Test
	public void testPascalTringle() {
		String expected[]={"  1"," 121","12321"," 121","  1"};
		assertArrayEquals(expected, pascalTringle.pascalTringle(3));
		
		String expected1[]={"1"};
		assertArrayEquals(expected1, pascalTringle.pascalTringle(1));
	}

}

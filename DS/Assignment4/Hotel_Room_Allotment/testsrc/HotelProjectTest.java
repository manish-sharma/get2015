import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class HotelProjectTest {

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
	public void testValidationnNamePositive() {
		assertEquals(true, Validation.isName("Amit Natani"));
		assertEquals(false, Validation.isName("Sumit123"));
		assertEquals(false, Validation.isName("Amit$%"));
		assertEquals(true, Validation.isName("AMIT NATANI"));
		assertEquals(true, Validation.isName("NEha SharMa"));
		assertEquals(false, Validation.isName("Ne12!"));
		
	}
	
	@Test
	public void testValidationnNameNegative() {
		assertNotEquals(false, Validation.isName("Amit Natani"));
		assertNotEquals(true, Validation.isName("Sumit123"));
		assertNotEquals(true, Validation.isName("Amit$%"));
		assertNotEquals(false, Validation.isName("AMIT NATANI"));
		assertNotEquals(false, Validation.isName("NEha SharMa"));
		assertNotEquals(true, Validation.isName("Ne12!"));
		
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestTruthTable {

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
	public void truthTableGeneratorTest() {
		TruthTableGenerator obj1 = new TruthTableGenerator();
		int result = obj1.truthTableGenerator("a&b");
		assertEquals(1, result);
	}
	
	@Test
	public void truthTableGeneratorTestWithNull() {
		TruthTableGenerator obj1 = new TruthTableGenerator();
		int result = obj1.truthTableGenerator(null);
		assertEquals(0, result);
	}
	
	@Test
	public void truthTableGeneratorTestWithEmptyString() {
		TruthTableGenerator obj1 = new TruthTableGenerator();
		int result = obj1.truthTableGenerator("");
		assertEquals(0, result);
	}
	
	@Test
	public void truthTableGeneratorTestWithWrongExpression() {
		TruthTableGenerator obj1 = new TruthTableGenerator();
		int result = obj1.truthTableGenerator("a&b&");
		assertEquals(-1, result);
	}
	
	@Test
	public void validationTestTrue() {
		assertEquals(true, Validation.isExpression("a&b"));
	}
	
	@Test
	public void validationTestFalse() {
		assertEquals(false, Validation.isExpression("a|b~"));
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ListTest {

	List list = new List("((3,4,6),(7,9))");
	
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
	public void testValidationList1() {
		assertEquals(false, Validation.isExpression("5,4,3"));
	}
	
	@Test
	public void testValidationList2() {
		assertEquals(true, Validation.isExpression("(5,4,3,7,1)"));
	}
	@Test
	public void testValidationList3() {
		assertEquals(false, Validation.isExpression("(4,(5,7),)"));
	}
	
	@Test
	public void testValidationList4() {
		assertEquals(true, Validation.isExpression("((5,4,5),3,(4,(5,7),7))"));
	}
	
	@Test
	public void testValidationList5() {
		assertEquals(true, Validation.isExpression("()"));
	}
	
	@Test
	public void testValidationList6() {
		assertEquals(false, Validation.isExpression(",,"));
	}
	
	@Test
	public void testValidationList7() {
		assertEquals(false, Validation.isExpression("(,)"));
	}
	
	@Test
	public void testValidationList8() {
		assertEquals(false, Validation.isExpression("(,7,9,8,9,)"));
	}
	
	@Test
	public void testValidationList9() {
		assertEquals(false, Validation.isExpression("(3,4,6)(6,9),"));
	}
	
	@Test
	public void testValidationList10() {
		assertEquals(true, Validation.isExpression("(5)"));
	}
	
	@Test
	public void testSumPositive() {
		assertEquals(29, list.sum());
	}

	@Test
	public void testSumNegative() {
		assertNotEquals(28, list.sum());
	}
	
	@Test
	public void testMaxPositive() {
		assertEquals(9, list.max());
	}

	@Test
	public void testMaxNegative() {
		assertNotEquals(3, list.max());
	}
	
	@Test
	public void testSizePositive() {
		assertEquals(5, list.size());
	}

	@Test
	public void testSizeNegative() {
		assertNotEquals(1, list.size());
	}
	
	@Test
	public void testFindPositive() {
		assertEquals(true, list.find(9));
	}

	@Test
	public void testFindNegative() {
		assertNotEquals(false, list.find(3));
	}
}

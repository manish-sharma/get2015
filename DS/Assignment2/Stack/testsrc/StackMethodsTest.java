import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StackMethodsTest {

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
	public void peekTestPositive() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		first = object.push("Amit", first);
		first = object.push("Ankit", first);
		first = object.push("Atul", first);
		assertEquals("Atul", object.peek(first));
	}
	
	@Test
	public void peekTestNegative() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		first = object.push("Amit", first);
		first = object.push("Ankit", first);
		first = object.push("Atul", first);
		assertNotEquals("Amit", object.peek(first));
	}
	
	@Test
	public void peekTestEmptyStackPositive() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		assertEquals(null, object.peek(first));
	}
	
	@Test
	public void peekTestEmptyStackNegative() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		assertNotEquals("Amit", object.peek(first));
	}
	
	@Test
	public void popTestPositive() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		first = object.push("Amit", first);
		first = object.push("Ankit", first);
		first = object.push("Atul", first);
		assertEquals("Atul", object.pop(first));
	}
	
	@Test
	public void popTestNegative() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		first = object.push("Amit", first);
		first = object.push("Ankit", first);
		first = object.push("Atul", first);
		assertNotEquals("Amit", object.pop(first));
	}
	
	@Test
	public void popTestEmptyStackPositive() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		assertEquals(null, object.pop(first));
	}
	
	@Test
	public void popTestEmptyStackNegative() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		assertNotEquals("Amit", object.pop(first));
	}
	
	@Test
	public void isNameValidationTestPositive() { 
		assertEquals(true, Validation.isExpression("a+b+c"));
		assertEquals(false, Validation.isExpression("  "));
		assertEquals(false, Validation.isExpression("ab++fv"));
		assertEquals(false, Validation.isExpression("a++d"));
		assertEquals(true, Validation.isExpression("(a-b)*(v/d)"));
		assertEquals(true, Validation.isExpression("a+v+c+d/d*s"));
		assertEquals(false, Validation.isExpression(null));
	}
	
	@Test
	public void isNameValidationTestNegative() { 
		assertNotEquals(false, Validation.isExpression("a+b+c"));
		assertNotEquals(true, Validation.isExpression("  "));
		assertNotEquals(true, Validation.isExpression("ab++fv"));
		assertNotEquals(true, Validation.isExpression("a++d"));
		assertNotEquals(false, Validation.isExpression("(a-b)*(v/d)"));
		assertNotEquals(false, Validation.isExpression("a+v+c+d/d*s"));
		assertNotEquals(true, Validation.isExpression(null));
	}
	
	@Test
	public void clearTestPositive() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		first = object.push("Amit", first);
		first = object.push("Ankit", first);
		first = object.push("Atul", first);
		assertEquals(true, object.clear());
	}
	
	@Test
	public void clearTestNegative() {
		Stack<Object> object = new Stack<Object>();
		Node<Object> first = null;
		first = object.push("Amit", first);
		first = object.push("Ankit", first);
		first = object.push("Atul", first);
		assertNotEquals(false, object.clear());
	}
	
	@Test
	public void clearTestEmptyStackPositive() {
		Stack<Object> object = new Stack<Object>();
		assertEquals(false, object.clear());
	}
	
	@Test
	public void clearTestEmptyStackNegative() {
		Stack<Object> object = new Stack<Object>();
		assertNotEquals(true, object.clear());
	}
}

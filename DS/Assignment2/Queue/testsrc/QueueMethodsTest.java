import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QueueMethodsTest {

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
	public void enqueueTestPositove() {
		Queue queueObj = new Queue();
		boolean result = queueObj.enqueue("Amit");
		assertEquals(true, result);
	}

	@Test
	public void enqueueTestNegative() {
		Queue queueObj = new Queue();
		boolean result = queueObj.enqueue("Amit");
		assertNotEquals(false, result);
	}
	
	@Test
	public void dequeueTestPositove() {
		Queue queueObj = new Queue();
		queueObj.enqueue("Amit");
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Rahul");
		String result = (String)queueObj.dequeue();
		assertEquals("Amit", result);
	}
	
	@Test
	public void dequeueTestNegative() {
		Queue queueObj = new Queue();
		queueObj.enqueue("Amit");
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Rahul");
		String result = (String)queueObj.dequeue();
		assertNotEquals("Rahul", result);
	}
	
	@Test
	public void dequeueTestEmptyQueuePositove() {
		Queue queueObj = new Queue();
		assertEquals(null, (String)queueObj.dequeue());
	}
	
	@Test
	public void dequeueTestEmptyQueueNegative() {
		Queue queueObj = new Queue();
		assertNotEquals("Sumit", (String)queueObj.dequeue());
	}
	
	@Test
	public void getFrontTestPositove() {
		Queue queueObj = new Queue();
		queueObj.enqueue("Asmit");
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Rahul");
		String result = (String)queueObj.getFront();
		assertEquals("Asmit", result);
	}
	
	@Test
	public void getFrontTestNegative() {
		Queue queueObj = new Queue();
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Rahul");
		String result = (String)queueObj.getFront();
		assertNotEquals("Rahul", result);
	}
	
	@Test
	public void getFrontEmptyQueuePositove() {
		Queue queueObj = new Queue();
		assertEquals(null, (String)queueObj.getFront());
	}
	
	@Test
	public void getFrontEmptyQueueNegative() {
		Queue queueObj = new Queue();
		assertNotEquals("Sumit", (String)queueObj.getFront());
	}
	
	@Test
	public void makeEmptyTestPositive() {
		Queue queueObj = new Queue();
		queueObj.enqueue("Amit");
		queueObj.enqueue("Ankit");
		assertEquals(true, queueObj.makeEmpty());
	}
	
	@Test
	public void makeEmptyTestNegative() {
		Queue queueObj = new Queue();
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Ankit");
		queueObj.enqueue("Rahul");
		assertNotEquals(false, queueObj.makeEmpty());
	}

	@Test
	public void makeEmptyTestEmptyQueuePositive() {
		Queue queueObj = new Queue();
		assertEquals(false, queueObj.makeEmpty());
	}
	
	@Test
	public void makeEmptyTestEmptyQueueNegative() {
		Queue queueObj = new Queue();
		assertNotEquals(true, queueObj.makeEmpty());
	}
	
	@Test
	public void isNameValidationTestPositive() { 
		assertEquals(true, Validation.isName("Amit Natani"));
		assertEquals(false, Validation.isName("  "));
		assertEquals(false, Validation.isName(" Balveer@ "));
		assertEquals(false, Validation.isName("Sumit23"));
		assertEquals(true, Validation.isName("  A  "));
		assertEquals(true, Validation.isName("AnKiTsHaRmA"));
		assertEquals(false, Validation.isName(null));
	}
	
	@Test
	public void isNameValidationTestNegative() { 
		assertNotEquals(false, Validation.isName("Amit Natani"));
		assertNotEquals(true, Validation.isName("  "));
		assertNotEquals(true, Validation.isName(" Balveer@ "));
		assertNotEquals(true, Validation.isName("Sumit23"));
		assertNotEquals(false, Validation.isName("  A  "));
		assertNotEquals(false, Validation.isName("AnKiTsHaRmA"));
		assertNotEquals(true, Validation.isName(null));
	}
}

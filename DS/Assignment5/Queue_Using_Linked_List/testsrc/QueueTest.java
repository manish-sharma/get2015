import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QueueTest {

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
	public void testPeekPositive() {
		LinkedList<Integer> queueList = new LinkedList<Integer>();
		queueList.addLast(23);
		queueList.addLast(32);
		queueList.addLast(12);
		queueList.addLast(453);
		queueList.addLast(67);
		Integer expected = 23;
		assertEquals(expected, queueList.peek());
	}
	
	@Test
	public void testPeekNegative() {
		LinkedList<Integer> queueList = new LinkedList<Integer>();
		queueList.addLast(23);
		queueList.addLast(32);
		queueList.addLast(12);
		queueList.addLast(453);
		queueList.addLast(67);
		Integer unexpected = 12;
		assertNotEquals(unexpected, queueList.peek());
	}

	@Test
	public void testPollPositive() {
		LinkedList<Integer> queueList = new LinkedList<Integer>();
		queueList.addLast(23);
		queueList.addLast(32);
		queueList.addLast(12);
		queueList.addLast(453);
		queueList.addLast(67);
		Integer expected = 23;
		assertEquals(expected, queueList.peek());
	}
	
	@Test
	public void testPollNegative() {
		LinkedList<Integer> queueList = new LinkedList<Integer>();
		queueList.addLast(23);
		queueList.addLast(32);
		queueList.addLast(12);
		queueList.addLast(453);
		queueList.addLast(67);
		Integer unexpected = 12;
		assertNotEquals(unexpected, queueList.peek());
	}
}

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.PriorityQueue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PriorityQueueTest {

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
	public void testPriorityQueueAddPositive() {
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		priorityQueueObj.add(4);
		priorityQueueObj.add(3);
		priorityQueueObj.add(1);
		priorityQueueObj.add(2);
		priorityQueueObj.add(3);
		assertEquals(5, priorityQueueObj.size());
	}

	@Test
	public void testPriorityQueueAddNegative() {
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		priorityQueueObj.add(4);
		priorityQueueObj.add(3);
		priorityQueueObj.add(1);
		priorityQueueObj.add(2);
		priorityQueueObj.add(3);
		assertNotEquals(4, priorityQueueObj.size());
	}
	
	@Test
	public void testPriorityQueuPeekPositive() {
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		priorityQueueObj.add(4);
		priorityQueueObj.add(3);
		priorityQueueObj.add(1);
		priorityQueueObj.add(2);
		priorityQueueObj.add(3);
		assertEquals(4, (int)priorityQueueObj.peek());
	}

	@Test
	public void testPriorityQueuePeekNegative() {
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		priorityQueueObj.add(4);
		priorityQueueObj.add(3);
		priorityQueueObj.add(1);
		priorityQueueObj.add(2);
		priorityQueueObj.add(3);
		assertNotEquals(3, (int)priorityQueueObj.peek());
	}
	
	@Test
	public void testPriorityQueuePollPositive() {
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		priorityQueueObj.add(4);
		priorityQueueObj.add(3);
		priorityQueueObj.add(1);
		priorityQueueObj.add(2);
		priorityQueueObj.add(3);
		assertEquals(4, (int)priorityQueueObj.poll());
	}

	@Test
	public void testPriorityQueuePollNegative() {
		PriorityQueue<Integer> priorityQueueObj = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		priorityQueueObj.add(4);
		priorityQueueObj.add(3);
		priorityQueueObj.add(1);
		priorityQueueObj.add(2);
		priorityQueueObj.add(3);
		assertNotEquals(1, (int)priorityQueueObj.poll());
	}
}

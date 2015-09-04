package ds8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentRollNumberAccendingTest {

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
	public void test() {
		StudentRollNumberAccending studentRollNumberAccending = new StudentRollNumberAccending();
		studentRollNumberAccending.rollNumbersTree.add(2);
		studentRollNumberAccending.rollNumbersTree.add(4);
		studentRollNumberAccending.rollNumbersTree.add(10);
		studentRollNumberAccending.rollNumbersTree.add(7);
		studentRollNumberAccending.rollNumbersTree.add(5);
		studentRollNumberAccending.rollNumbersTree.add(6);
		studentRollNumberAccending.rollNumbersTree.add(1);
		String expected = "List of roll numbers is 1, 2, 4, 5, 6, 7, 10";
		assertEquals(expected, "List of roll numbers is 1, 2, 4, 5, 6, 7, 10");
		
	}

}

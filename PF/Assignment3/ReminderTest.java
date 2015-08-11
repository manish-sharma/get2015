import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReminderTest extends Reminder {

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
	public void testRem() {
		assertEquals(0, Reminder.rem(2, 1));
		assertEquals(1, Reminder.rem(100, 3));
		assertEquals(-1, Reminder.rem(20, 0));
	}

}

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TowerOfHanoiTest {

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
		List<String> list = new ArrayList<String>();
		List<String> resultString = TowerOfHanoi.towerOfHanoi("a", "b", "c", 2,
				list);
		List<String> expectedString1 = Arrays.asList("move 1 from a to c",
				"move 2 from a to b", "move 1 from c to b");
		assertEquals(expectedString1, resultString);

		List<String> list1 = new ArrayList<String>();
		List<String> resultString2 = TowerOfHanoi.towerOfHanoi("a", "b", "c",
				3, list1);
		List<String> expectedString3 = Arrays.asList("move 1 from a to b",
				"move 2 from a to c", "move 1 from b to c",
				"move 3 from a to b", "move 1 from c to a",
				"move 2 from c to b", "move 1 from a to b");
		assertEquals(expectedString3, resultString2);

		List<String> list2 = new ArrayList<String>();
		List<String> resultString3 = TowerOfHanoi.towerOfHanoi("a", "b", "c",
				1, list2);
		List<String> expectedString4 = Arrays.asList("move 1 from a to b");
		assertEquals(expectedString4, resultString3);
	}

}

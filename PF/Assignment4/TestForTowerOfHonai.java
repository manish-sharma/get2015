import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForTowerOfHonai {

	TowerOfHonai tower = new TowerOfHonai();

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
	public void Test() {
		tower.size = 1;
		TowerOfHonai.result = new ArrayList<String>();
		TowerOfHonai.result = tower.honai("A", "B", "C", 1);
		String expected[] = { "Move Disk 1 from A to B" };

		int i = 0;

		for (String a : TowerOfHonai.result) {

			assertEquals(expected[i], a);
			i++;
		}

	}

	@Test
	public void TestForTwo() {
		tower.size = 2;
		TowerOfHonai.result = new ArrayList<String>();
		TowerOfHonai.result = tower.honai("A", "B", "C", 1);
		String expected[] = { "Move Disk 2 from A to C",
				"Move Disk 1 from A to B", "Move Disk 2 from C to B" };

		int i = 0;

		for (String a : TowerOfHonai.result) {

			assertEquals(expected[i], a);
			i++;
		}

	}

	@Test
	public void TestForThree() {
		tower.size = 3;
		TowerOfHonai.result = new ArrayList<String>();
		TowerOfHonai.result = tower.honai("A", "B", "C", 1);
		String expected[] = { "Move Disk 3 from A to B",
				"Move Disk 2 from A to C", "Move Disk 3 from B to C",
				"Move Disk 1 from A to B", "Move Disk 3 from C to A",
				"Move Disk 2 from C to B", "Move Disk 3 from A to B" };

		int i = 0;

		for (String a : TowerOfHonai.result) {

			assertEquals(expected[i], a);
			i++;
		}

	}

}

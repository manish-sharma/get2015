import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TestCases
 * 
 * @author Arushi
 *
 */
public class TestTowerOfHanoi {
	TowerOfHanoi towerHanoi = new TowerOfHanoi();
	static List<String> result;

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
		TowerOfHanoi.result.removeAll(TowerOfHanoi.result);
	}

	/**
	 * Testing 1st case
	 */
	@Test
	public void test() {
		int i = 0;
		String Result1[] = { "Move Disk1 fromAtoB" };

		TowerOfHanoi.result = new ArrayList<String>();

		TowerOfHanoi.result = towerHanoi.towerOfHanoi("A", "B", "C", 1);
		Iterator<String> itr = TowerOfHanoi.result.iterator();// getting
																// Iterator from
																// array
		// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String a : TowerOfHanoi.result) {

			assertEquals("", Result1[i], a);
			i++;
		}
	}

	/**
	 * Testing 2nd case
	 */
	@Test
	public void test1() {
		int i = 0;
		String Result1[] = { "Move Disk1 fromAtoC", "Move Disk2 fromAtoB",
				"Move Disk1 fromCtoB" };

		TowerOfHanoi.result = new ArrayList<String>();

		TowerOfHanoi.result = towerHanoi.towerOfHanoi("A", "B", "C", 2);
		Iterator<String> itr = TowerOfHanoi.result.iterator();// getting
																// Iterator from
																// array
		// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String a : TowerOfHanoi.result) {

			assertEquals("", Result1[i], a);
			i++;
		}
	}

	/**
	 * Testing 3rd case
	 */
	@Test
	public void test2() {
		int i = 0;
		String Result1[] = { "Move Disk1 fromAtoB", "Move Disk2 fromAtoC",
				"Move Disk1 fromBtoC", "Move Disk3 fromAtoB",
				"Move Disk1 fromCtoA", "Move Disk2 fromCtoB",
				"Move Disk1 fromAtoB" };

		TowerOfHanoi.result = new ArrayList<String>();

		TowerOfHanoi.result = towerHanoi.towerOfHanoi("A", "B", "C", 3);
		Iterator<String> itr = TowerOfHanoi.result.iterator();// getting
																// Iterator from
																// array
		// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String a : TowerOfHanoi.result) {

			assertEquals("", Result1[i], a);
			i++;
		}
	}

}

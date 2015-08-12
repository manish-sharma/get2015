import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testing for permutations
 * 
 * @author Arushi
 *
 */
public class TestPermutation {

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
		Permutation.result.removeAll(Permutation.result);
	}

	/**
	 * Testing 1st case
	 */
	@Test
	public void test() {

		int i = 0;
		String Result1[] = { "acb", "bca", "abc", "cba", "bac", "cab" };

		Permutation.result = new ArrayList<String>();

		Permutation.result = Permutation.permutation("abc");
		Iterator<String> itr = Permutation.result.iterator();// getting
																// Iterator from
																// array
		// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String a : Permutation.result) {

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
		String Result1[] = { "acbd", "adbc", "bcad", "bdac", "cbad", "cdab",
				"abdc", "acdb", "bacd", "bdca", "cabd", "cdba", "dbac", "dcab",
				"abcd", "adcb", "badc", "bcda", "dabc", "dcba", "cadb", "cbda",
				"dacb", "dbca" };

		Permutation.result = new ArrayList<String>();

		Permutation.result = Permutation.permutation("abcd");
		Iterator<String> itr = Permutation.result.iterator();// getting
																// Iterator from
																// array
		// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String a : Permutation.result) {

			assertEquals("", Result1[i], a);
			i++;
		}

	}

}

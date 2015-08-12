import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * creates the object
 **/
public class PermutationTest {
	/**
	 * creates the object
	 **/

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * clears the test case after execution
	 * 
	 * @throws Exception
	 **/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * cleans the object tested
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Name:test Description: checks the value returned
	 */
	@Test
	public void permutationTest1() {
		List<String> list = new ArrayList<String>();
		List<String> resultString = Permutation.permuteString("", "abcd", list);
		List<String> expectedString1 = Arrays.asList("abcd", "abdc", "acbd",
				"acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac",
				"bdca", "cabd", "cadb", "cbad", "cbda", "cdab", "cdba", "dabc",
				"dacb", "dbac", "dbca", "dcab", "dcba");
		assertEquals(expectedString1, resultString);

		List<String> list1 = new ArrayList<String>();
		List<String> resultString1 = Permutation.permuteString("", "ab", list1);
		List<String> expectedString2 = Arrays.asList("ab", "ba");
		assertEquals(expectedString2, resultString1);

		List<String> list2 = new ArrayList<String>();
		List<String> resultString2 = Permutation
				.permuteString("", "abc", list2);
		List<String> expectedString3 = Arrays.asList("abc", "acb", "bac",
				"bca", "cab", "cba");

		assertEquals(expectedString3, resultString2);

	}

}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForPermuation {

	Permutation objectOfPermutation = new Permutation();

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
	public void testForRepetedString() {
		Permutation.result = new ArrayList<String>();
		Permutation.result = objectOfPermutation.permutation("AAB");
		String expected[] = { "ABA", "AAB", "BAA" };
		int i = 0;
		for (String a : Permutation.result) {
			assertEquals(expected[i], a);
			i++;
		}
	}

	@Test
	public void testForStringOfThree() {
		Permutation.result = new ArrayList<String>();
		Permutation.result = objectOfPermutation.permutation("ABC");
		String expected[] = { "ACB", "BCA", "ABC", "CBA", "BAC", "CAB" };
		int i = 0;
		for (String a : Permutation.result) {
			assertEquals(expected[i], a);
			i++;
		}
	}

	@Test
	public void testForStringOfFour() {
		Permutation.result = new ArrayList<String>();
		Permutation.result = objectOfPermutation.permutation("ABCD");
		String expected[] = { "BADC", "BCDA", "DABC", "DCBA", "CADB", "CBDA",
				"DACB", "DBCA", "ACBD", "ADBC", "BCAD", "BDAC", "ABCD", "ADCB",
				"CBAD", "CDAB", "ABDC", "ACDB", "BACD", "BDCA", "CABD", "CDBA",
				"DBAC", "DCAB" };
		int i = 0;
		for (String a : Permutation.result) {
			assertEquals(expected[i], a);
			i++;
		}
	}

}

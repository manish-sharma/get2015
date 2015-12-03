import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ConcordanceTest {

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
	public void testFindConcordancePositive() {
		Concordance concordanceObj = new Concordance();
		Map<Character, String> expectedConcordanceMap = new TreeMap<Character, String>();
		expectedConcordanceMap.put('H', "[0]");
		expectedConcordanceMap.put('W', "[5]");
		expectedConcordanceMap.put('d', "[9]");
		expectedConcordanceMap.put('e', "[1]");
		expectedConcordanceMap.put('l', "[2,3,8]");
		expectedConcordanceMap.put('o', "[4,6]");
		expectedConcordanceMap.put('r', "[7]");
		concordanceObj.findConcordance("HelloWorld");
		assertEquals(expectedConcordanceMap, Concordance.concordanceMap);
	}
	
	@Test
	public void testFindConcordanceNegative() {
		Concordance concordanceObj = new Concordance();
		concordanceObj.findConcordance("HelloWorld");
		Map<Character, String> unExpectedConcordanceMap = new TreeMap<Character, String>();
		unExpectedConcordanceMap.put('H', "[0]");
		unExpectedConcordanceMap.put('W', "[5]");
		unExpectedConcordanceMap.put('d', "[9]");
		unExpectedConcordanceMap.put('e', "[2]");
		unExpectedConcordanceMap.put('l', "[1,3,8]");
		unExpectedConcordanceMap.put('o', "[4,6]");
		unExpectedConcordanceMap.put('r', "[7]");
		assertNotEquals(unExpectedConcordanceMap, Concordance.concordanceMap);
	}

	@Test
	public void testFindConcordanceNullStringPositive() {
		Concordance concordanceObj = new Concordance();
		boolean actual = concordanceObj.findConcordance(null);
		assertEquals(false, actual);
	}
	
	@Test
	public void testFindConcordanceNullStringNegative() {
		Concordance concordanceObj = new Concordance();
		boolean actual = concordanceObj.findConcordance(null);
		assertNotEquals(true, actual);
	}
	
	@Test
	public void testFindConcordanceEmptyStringPositive() {
		Concordance concordanceObj = new Concordance();
		boolean actual = concordanceObj.findConcordance("");
		assertEquals(false, actual);
	}
	
	@Test
	public void testFindConcordanceEmptyStringNegative() {
		Concordance concordanceObj = new Concordance();
		boolean actual = concordanceObj.findConcordance("");
		assertNotEquals(true, actual);
	}

}

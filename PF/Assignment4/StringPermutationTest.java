import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StringPermutationTest {

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
	public void test1() {
		StringPermutation object= new StringPermutation();
		String result="abcacbbacbcacabcba";
		String input=object.generatePermutations("","abc");
		assertEquals(result,input);
	}
	
	@Test
	public void test2() {
		StringPermutation object= new StringPermutation();
		String result="abcdabdcacbdacdbadbcadcbbacdbadcbcadbcdabdacbdcacabdcadbcbadcbdacdabcdbadabcdacbdbacdbcadcabdcba";
		String input=object.generatePermutations("","abcd");
		assertEquals(result,input);
	}


}

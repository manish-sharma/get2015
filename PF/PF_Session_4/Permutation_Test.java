import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;

public class Permutation_Test {

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
		List<String> expected= new ArrayList<String>();
		expected.add("abc");
		expected.add("acb");
		expected.add("bac");
		expected.add("bca");
		expected.add("cab");
		expected.add("cba");
		List<String> Result=new Permutation().generatePermutations("","abc");
		assertEquals("",expected,Result);
	}
	
}

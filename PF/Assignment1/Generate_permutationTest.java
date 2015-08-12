import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Generate_permutationTest {

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
//positive test case;
	@Test
	public void test() {
		List<String> expected= new ArrayList<String>();
		expected.add("abc");
		expected.add("acb");
		expected.add("bac");
		expected.add("bca");
		expected.add("cab");
		expected.add("cba");
		List<String> Result=new Generate_permutation().generatePermutations("","abc");
		assertEquals(expected,Result);
	}
	// negative test case 
	@Test
	public void test1() {
		List<String> expected= new ArrayList<String>();
		expected.add("abc");
		expected.add("acbb");
		expected.add("bac");
		expected.add("bca");
		expected.add("cab");
		expected.add("cba");
		List<String> Result=new Generate_permutation().generatePermutations("","abc");
		assertEquals(expected,Result);
	}

}

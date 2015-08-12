import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;

/*
 * @author Gaurav Saini
 *
 */
public class PermutationTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		Permutation testObject1 = new Permutation();
		String expectedPermutations[] = {"abc","acb","bac","bca","cab","cba"};
		List<String> PermutationList;
		PermutationList=testObject1.permute("abc");
		int i=0;
		for(String s : PermutationList)
		{
			assertEquals("", expectedPermutations[i], s);
			i++;
		}
	}
	
	@Test
	public void test2() {
		
		Permutation testObject2 = new Permutation();
		String expectedPermutations[] = {"ab","ba"};
		List<String> PermutationList;
		PermutationList=testObject2.permute("ab");
		int i=0;
		for(String s : PermutationList)
		{
			assertEquals("", expectedPermutations[i], s);
			i++;
		}
	}
	
	@Test
	public void test3() {
		
		Permutation testObject3 = new Permutation();
		String expectedPermutations[] = {"abb","bab","bba"};
		List<String> PermutationList;
		PermutationList=testObject3.permute("abb");
		int i=0;
		for(String s : PermutationList)
		{
			assertEquals("", expectedPermutations[i], s);
			i++;
		}
	}

}

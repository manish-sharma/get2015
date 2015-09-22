import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class permutationTest {

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
		
		permutationOfString testObject1 = new permutationOfString();
		String expectedPermutations[] = {"abc","acb","bac","bca","cab","cba"};
		List<String> PermutationList;
		PermutationList=testObject1.permute("abc");
		int i=0;
		for(String s : PermutationList)
		{
			assertEquals("", expectedPermutations[i], s);
			i++;
		}
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
		permutationOfString testObject2 = new permutationOfString();
		String expectedPermutations[] = {"ab","ba"};
		List<String> PermutationList;
		PermutationList=testObject2.permute("ab");
		int i=0;
		for(String s : PermutationList)
		{
			assertEquals("", expectedPermutations[i], s);
			i++;
		}
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		
		permutationOfString testObject3 = new permutationOfString();
		String expectedPermutations[] = {"abb","bab","bba"};
		List<String> PermutationList;
		PermutationList=testObject3.permute("abb");
		int i=0;
		for(String s : PermutationList)
		{
			assertEquals("", expectedPermutations[i], s);
			i++;
		}
		//fail("Not yet implemented");
	}

}
	


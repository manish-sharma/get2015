package permutation;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PermutationTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	
	@Test
	public void permutationTest1()
	{
		Permutation permutationObj1 = new Permutation();
		List<String> resultString = permutationObj1.generatePermutations("", "abcd");
		List<String> expectedString1 = Arrays.asList("abcd","abdc","acbd","acdb","adbc","adcb","bacd","badc","bcad","bcda","bdac","bdca","cabd","cadb","cbad","cbda","cdab","cdba","dabc","dacb","dbac","dbca","dcab","dcba");
		assertEquals(expectedString1,resultString);
		
	}
	
	@Test
	public void permutationTest2()
	{
		Permutation permutationObj1 = new Permutation();
		List<String> resultString = permutationObj1.generatePermutations("", "abc");
		List<String> expectedString1 = Arrays.asList("abc","acb","bac","bca","cab","cba");
		assertEquals(expectedString1,resultString);
		
	}

}

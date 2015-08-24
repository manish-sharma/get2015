import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class permutationTest 
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
	public void testPositive1() 
	{
		permutation obj = new permutation();
		String inputStr = "ABC";
		String expectedStr[] = {"ABC","ACB","BAC","BCA","CAB","CBA"};
		List<String> outputStr = obj.generatePermutations(inputStr);
		int index = 0;
		for( String str : outputStr)
		{
			assertEquals("Matched", expectedStr[index], str);
			index++;
		}
	}
	
	
	@Test
	public void testPositive2() 
	{
		permutation obj = new permutation();
		String inputStr = "ABCD";
		String expectedStr[] = {"ABCD","ABDC","ACBD","ACDB","ADBC","ADCB","BACD","BADC","BCAD","BCDA","BDAC","BDCA","CABD","CADB","CBAD","CBDA","CDAB","CDBA","DABC","DACB","DBAC","DBCA","DCAB","DCBA"};
		List<String> outputStr = obj.generatePermutations(inputStr);
		int index = 0;
		for( String str : outputStr)
		{
			assertEquals("Matched", expectedStr[index], str);
			index++;
		}
	}
}

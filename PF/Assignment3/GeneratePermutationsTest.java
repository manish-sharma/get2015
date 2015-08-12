package pf_assignment_4;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class GeneratePermutationsTest
{

	@Test
	public void test() 
	{
		List<String> expected=new ArrayList<String>();
		expected.add("abc");
		expected.add("acb");
		expected.add("bac");
		expected.add("bca");
		expected.add("cab");
		expected.add("cba");
		String inputString="abc";
		List<String> Result=new GeneratePermutations().generatePermutations("",inputString);
		assertEquals(expected,Result);
		//fail("Not yet implemented");
	}

}

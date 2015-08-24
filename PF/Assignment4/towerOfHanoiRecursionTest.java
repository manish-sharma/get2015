import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class towerOfHanoiRecursionTest 
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
		towerOfHanoiRecursion obj = new towerOfHanoiRecursion();
		String expectedStr[] = {"Move 1 disc A -> B"};
		List<String> outputStr = obj.towerOfHanoi("A", "B", "C", 1);
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
		towerOfHanoiRecursion obj = new towerOfHanoiRecursion();
		String expectedStr[] = {"Move 1 disc A -> C","Move 2 disc A -> B","Move 1 disc C -> B"};
		List<String> outputStr = obj.towerOfHanoi("A", "B", "C", 2);
		int index = 0;
		for( String str : outputStr)
		{
			assertEquals("Matched", expectedStr[index], str);
			index++;
		}
	}
	
	@Test
	public void testPositive3() 
	{
		towerOfHanoiRecursion obj = new towerOfHanoiRecursion();
		String expectedStr[] = {"Move 1 disc A -> B","Move 2 disc A -> C","Move 1 disc B -> C","Move 3 disc A -> B","Move 1 disc C -> A","Move 2 disc C -> B","Move 1 disc A -> B"};
		List<String> outputStr = obj.towerOfHanoi("A", "B", "C", 3);
		int index = 0;
		for( String str : outputStr)
		{
			assertEquals("Matched", expectedStr[index], str);
			index++;
		}
	}

}

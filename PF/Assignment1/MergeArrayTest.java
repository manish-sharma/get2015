import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeArrayTest 
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
	public void test() 
	{
		MergeArray obj = new MergeArray();
		int input1[] = {5,9,15};
		int input2[] = {2,6,8,20};
		int output[] = obj.join(input1,input1.length,input2,input2.length);
		int expectedArr[] = {2,5,6,8,9,15,20};
		assertArrayEquals("True : ", expectedArr, output);
	}

}

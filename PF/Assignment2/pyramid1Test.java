import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class pyramid1Test {

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
	public void test1() 
	{
	assignment_1 as1=new assignment_1();
	String expected=as1.spaces(5,5);
	assertEquals(""," ",expected);
	//String output2=as1.numbers(5, 5);
	//assertEquals(""," 1234321",output2);
	}
	@Test
	public void test2() 
	{
	assignment_1 as1=new assignment_1();
	String output=as1.numbers(5,5);
	assertEquals("","1234321",output);
	
	}
	@Test
	public void test3() 
	{
	assignment_1 as1=new assignment_1();
	String output[]=as1.printPyramid(9,5);
	String[] expected={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
	for(int i=0;i<9;i++)
	{
		assertEquals("",expected[i],output[i]);
	}
	}


}

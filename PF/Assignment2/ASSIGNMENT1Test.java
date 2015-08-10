/*************************
 * @author Babalu Patidar
 * Program to test draw a pyramid pattern
 ***********/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ASSIGNMENT1Test {

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

	@Test  /*Test2 will test drawpyramid method */ 
	public void test() {
		String expected[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		ASSIGNMENT1 p=new ASSIGNMENT1();
		String output[]=p.drawpyramid(5);
		
		for(int i=0;i<9;i++)
		{
			assertEquals(expected[i],output[i]);
		}
	}
	@Test  /*Test1 will test spaces method */ 
	public void test1() {
		String expected="    ";
		ASSIGNMENT1 p=new ASSIGNMENT1();
		String output=p.spaces(1, 5);
		assertEquals(expected,output);
		}
	
	@Test   /*Test2 will test numbers method */ 
	public void test2() {
		String expected="12321";
		ASSIGNMENT1 p=new ASSIGNMENT1();
		String output=p.numbers(3, 5);
		assertEquals(expected,output);
	}
}
	

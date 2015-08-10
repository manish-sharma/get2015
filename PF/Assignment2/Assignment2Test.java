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


public class Assignment2Test {

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
	@Test   /*Test2 will test drawpyramid method */ 
	public void testpyramid() {
		String expected[]={"12345"," 1234","  123","   12","    1"};
		Assignment2 p=new Assignment2();
		String output[]=p.drawpyramid(5);  // 5 is total no. of row  in pyramid
		
		for(int i=0;i<5;i++)
		{
			assertEquals(expected[i],output[i]);
		}
	}
	@Test  /*Test1 will test spaces method */ 
	public void testspace() {
		String expected="    ";
		Assignment2 p=new Assignment2();
		String output=p.spaces(5, 5);  //3 is row no. & 5 is total row 
		assertEquals(expected,output);
		}
	
	@Test  /*Test2 will test numbers method */
	public void testnumber() {
		String expected="123";
		Assignment2 p=new Assignment2();
		String output=p.numbers(3, 5);//3 is row no. & 5 is total row 
		assertEquals(expected,output);
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class pyramid2Test {

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
		assignment2 as1=new assignment2();
		String output=as1.spaces(4,5);
		assertEquals("","    ",output);
	}
	@Test
	public void test2() {
		assignment2 as1=new assignment2();
		String output=as1.numbers(4,5);
		assertEquals("","1",output);
	}
	@Test
	public void test3() {
		assignment2 as1=new assignment2();
		String expected[]={"12345"," 1234","  123","   12","    1"};
		String output[]=as1.printPyramid(5,5);
		for(int i=0;i<5;i++)
		{
		assertEquals("",output[i],expected[i]);
		}
	}


}

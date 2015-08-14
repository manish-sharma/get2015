package assignment2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class prg2Test {

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
	public void test() {
		prg2 obj= new prg2();
		String a="  ";
		String b=" 1 2 3 4 5";
		assertEquals(a,obj.spaces(2, 5));
		assertEquals(b,obj.number(1, 5));
		for(int i=1; i<6; i++)
		{
			String c="";
			c=obj.spaces(i, 5)+ obj.number(i, 5);
			assertEquals(c,obj.pyramid(i, 5));
			
		}
		
	}

}

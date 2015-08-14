package assignment2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class prg1Test {

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
		prg1 obj = new prg1();
		
		String a="    ";
		String b=" 1 2 3 4 5 4 3 2 1";
		assertEquals(a,obj.spaces(3, 9));
		assertEquals(b,obj.number(5, 9));
		for(int i=0; i<10; i++)
		{
			String c="";
			c=obj.spaces(i, 9)+ obj.number(i, 9);
			assertEquals(c,obj.pyramid(i, 9));
	}

	}
}

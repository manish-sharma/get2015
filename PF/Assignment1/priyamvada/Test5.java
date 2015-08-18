package priyamvada;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test5 {

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
		Program5 obj=new Program5();
		int[] a={1,2,3,4};
		int[] b={4,3,2,1};
		int[] c={1,3,2,4};
		int result1=1;
		int result2=2;
		int result3=0;
		assertEquals("compile",result1,obj.checkOrder(a));
		assertEquals("compile",result2,obj.checkOrder(b));
		assertEquals("compile",result3,obj.checkOrder(c));
	}

}

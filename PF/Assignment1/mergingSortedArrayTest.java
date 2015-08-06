package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class mergingSortedArrayTest {

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
		mergingSortedArray ob=new mergingSortedArray();
		int inp1[]={1,4,7,9};
		int inp2[]={2,3,5,8};
		int out[]=new int[inp1.length+inp2.length];
		int expect[]={1,2,3,4,5,7,8,9};
		out=ob.join(inp1, inp1.length, inp2, inp2.length, out);
		assertArrayEquals(expect,out);
	}

}

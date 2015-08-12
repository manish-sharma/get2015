package priyamvada;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test4 {

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
			Program4 obj=new Program4();
			int[] a={1,2,3,4};
			int asize=4;
			int[] b={3,4,5,6};
			int bsize=4;
			int[] c={1,2,3,4,5,6};
			int[] output={1,2,3,4,5,6};
			assertArrayEquals(output,obj.merge(a,asize,b,bsize,c));
	}

}

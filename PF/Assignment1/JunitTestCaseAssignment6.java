import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTestCaseAssignment6 {

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
		System.out.println("Test1");
		Assignment6 assign6=new Assignment6();
		int a[] = {0,2,3,4,5,6};
		int b[] ={3,5,6,8,9};
		int asize=a.length;
		int bsize=b.length;
		int c[]=new int[asize+bsize];
		int expetedOutput[]={0,2,3,3,4,5,5,6,6,8,9};
		int Output[] = assign6.join(a, asize, b, bsize, c);
		assertArrayEquals("match",expetedOutput,Output);
	}

}

package JoinArray;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJoinArray {

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
		JoinArray joinArray=new JoinArray();
		int a[]={2,3,5,7,11,34,67};
		int b[]={1,6,8,19,21,33,77};
		int asize=a.length;
		int bsize=b.length;
		int expected[]={1,2,3,5,6,7,8,11,19,21,33,34,67,77};
		int c[]=joinArray.join(a, asize, b, bsize);
		assertArrayEquals(expected, c);
	}

}

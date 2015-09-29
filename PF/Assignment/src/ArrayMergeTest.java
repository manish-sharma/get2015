import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArrayMergeTest {

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
    System.out.print("Array Merge Test");
    ArrayMerge merge=new ArrayMerge();
    int a[]={1,2,3,4,5,6,7};
	int b[]={11,12,13,14,15,16};
	int asize=a.length;
	int bsize=b.length;
	int c[]=new int[asize+bsize];
    int output[]=merge.joinArray(a, asize, b, bsize, c);
    int expected[]={1,2,3,4,5,6,7,11,12,13,14,15,16};
	assertArrayEquals("Pass",expected, output);
	}

}

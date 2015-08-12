import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MergeSortTestCase {

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
	public void randomSizeOfArrayTest() {
		MergeSort assign=new MergeSort();
		int a[]={1,3,6,8,10};
		int b[]={2,4,5,7,8,11,12};
		int c[]=new int[a.length+b.length];
		int result[]={1,2,3,4,5,6,7,8,8,10,11,12};
		assertArrayEquals("result is correct",result,assign.join(a,a.length, b, b.length, c));
	}
	@Test
	public void oneElemetInFirstTest() {
		MergeSort assign=new MergeSort();
		int a[]={1};
		int b[]={2,4,5,7,8,11,12};
		int c[]=new int[a.length+b.length];
		int result[]={1,2,4,5,7,8,11,12};
		assertArrayEquals("result is correct",result,assign.join(a,a.length, b, b.length, c));
	}
	@Test
	public void oneElementInSecondTest() {
		MergeSort assign=new MergeSort();
		int a[]={1,3,6,8,10};
		int b[]={1};
		int c[]=new int[a.length+b.length];
		int result[]={1,1,3,6,8,10};
		assertArrayEquals("result is correct",result,assign.join(a,a.length, b, b.length, c));
	}

}

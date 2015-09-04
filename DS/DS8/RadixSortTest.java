import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RadixSortTest {

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
	public void radixSortTest1() {
		int list[]={-7,6,5,4,3,2,1,0};
		int expected[]={-7,6,5,4,3,2,1,0};
		int actual[]=RadixSort.radixSort(list,7);
		assertArrayEquals( expected,actual);
	}
	@Test
	public void quickSortTest2() {
		int list[]={0};
		int expected[]={0};
		assertArrayEquals( expected,RadixSort.radixSort(list,0));
	}
	@Test
	public void quickSortTest3() {
		int list[]={9,8,7,6,5433,4,3,2,105};
		int expected[]={2,3,4,6,7,8,9,105,5433};
		assertArrayEquals(expected,RadixSort.radixSort(list,5433));
	}
}

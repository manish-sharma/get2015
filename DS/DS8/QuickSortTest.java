import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortTest {

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
	public void quickSortTest1() {
		int list[]={7,6,5,4,3,2,1,0};
		int expected[]={0,1,2,3,4,5,6,7};
		int actual[]=QuickSort.quickSort(list,0,list.length-1);
		assertArrayEquals( expected,actual);
	}
	@Test
	public void quickSortTest2() {
		int list[]={0};
		int expected[]={0};
		assertArrayEquals( expected,QuickSort.quickSort(list, 0, list.length-1));
	}
	@Test
	public void quickSortTest3() {
		int list[]={9,8,7,6,5,4,3,2,1};
		int expected[]={1,2,3,4,5,6,7,8,9};
		assertArrayEquals( expected,QuickSort.quickSort(list,0,list.length-1));
	}

}

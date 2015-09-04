import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BubbleSortTest {

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
	public void bubbleSortTest1() {
		int list[]={7,6,5,4,3,2,1,0};
		int expected[]={0,1,2,3,4,5,6,7};
		assertArrayEquals( expected,BubbleSort.bubbleSort(list));
	}
	@Test
	public void bubbleSortTest2() {
		int list[]={};
		int expected[]={};
		assertArrayEquals( expected,BubbleSort.bubbleSort(list));
	}
	@Test
	public void bubbleSortTest3() {
		int list[]={8,8,8,8,8,8,1,1,2,2,8,8};
		int expected[]={1,1,2,2,8,8,8,8,8,8,8,8};
		assertArrayEquals( expected,BubbleSort.bubbleSort(list));
	}


}

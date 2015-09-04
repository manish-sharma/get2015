import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CountingSortTest {

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
	public void countingSortTest1() {
		int list[]={7,6,5,4,3,2,1,0};
		int expected[]={0,1,2,3,4,5,6,7};
		assertArrayEquals( expected,CountingSort.countingSort(list,7));
	}
	@Test
	public void countingSortTest2() {
		int list[]={0};
		int expected[]={0};
		assertArrayEquals( expected,CountingSort.countingSort(list,0));	
	}
	@Test
	public void countingSortTest3() {
		int list[]={-1,-2,1,-4,-22};
		int expected[]={-1,-2,1,-4,-22};
		assertArrayEquals( expected,CountingSort.countingSort(list,1));
	}

}

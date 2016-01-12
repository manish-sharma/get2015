import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortingTest {
   Sorting sort = new Sorting();
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
	public void test1() {
		assertArrayEquals( new int[]{12,13,16,33,39,45,67,80,89},sort.quickSort(new int[]{45 ,67 ,12 ,89, 39, 13, 33, 80, 16}) );
	}
	@Test
	public void test2() {
		assertArrayEquals( new int[]{1,4,4,4,5,6},sort.quickSort(new int[]{6,4,1,4,4,5} ) );
	}
	
	@Test
	public void test3() {
		assertArrayEquals( new int[]{1,1,1,1,2,2},sort.quickSort(new int[]{2,1,1,1,1,2}) );
	} 
	
	
	@Test
	public void test4() {
		assertArrayEquals( new int[]{12,13,16,33,39,45,67,80,89},sort.bubbleSort(new int[]{45 ,67 ,12 ,89, 39, 13, 33, 80, 16}) );
	}
	@Test
	public void test5() {
		assertArrayEquals( new int[]{1,4,4,4,5,6},sort.bubbleSort(new int[]{6,4,1,4,4,5} ) );
	}
	
	@Test
	public void test6() {
		assertArrayEquals( new int[]{1,1,1,1,2,2},sort.bubbleSort(new int[]{2,1,1,1,1,2}) );
	} 
	
	
	@Test
	public void test7() {
		assertArrayEquals( new int[]{12,13,16,33,39,45,67,80,89},sort.countingSort(new int[]{45 ,67 ,12 ,89, 39, 13, 33, 80, 16}, 89) );
	}
	@Test
	public void test8() {
		assertArrayEquals( new int[]{1,4,4,4,5,6},sort.countingSort(new int[]{6,4,1,4,4,5}, 6 ) );
	}
	
	@Test
	public void test9() {
		assertArrayEquals( new int[]{1,1,1,1,2,2},sort.countingSort(new int[]{2,1,1,1,1,2},2) );
	} 
	
	@Test
	public void test10() {
		assertArrayEquals( new int[]{12,13,16,33,39,45,67,80,89},sort.radixSort(new int[]{45 ,67 ,12 ,89, 39, 13, 33, 80, 16}, 89) );
	}
	@Test
	public void test11() {
		assertArrayEquals( new int[]{1,4,4,4,5,6},sort.radixSort(new int[]{6,4,1,4,4,5}, 6 ) );
	}
	
	@Test
	public void test12() {
		assertArrayEquals( new int[]{1,1,1,1,2,2},sort.radixSort(new int[]{2,1,1,1,1,2},2) );
	} 

}

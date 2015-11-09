
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class SortingSystemTest
{
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

	/** positive test case for linearSort */
	/**counting Sort*/
	
	@Test
	public void test1() {
		int arr[]=new int[]{6,4,53,5,3,56,87};
		SortingSystem sortingSystem=new SortingSystem(arr, arr.length,87);
		int sortedArray[]=sortingSystem.linearSort();
		assertArrayEquals(new int[]{3,4,5,6,53,56,87}, sortedArray);
	}
	
	/** positive test case for linearSort */
	/**radix Sort*/
	@Test
	public void test2() {
		int arr[]=new int[]{6,4,53,5,3,56,87,7886,9543,653332};
		SortingSystem sortingSystem=new SortingSystem(arr, arr.length,653332);
		int sortedArray[]=sortingSystem.linearSort();
		assertArrayEquals(new int[]{3,4,5,6,53,56,87,7886,9543,653332}, sortedArray);
	}
	
	/** positive test case for comparisionSort */
	/**Bubble  Sort*/
	@Test
	public void test3() {
		int arr[]=new int[]{6,4,53,5,3,56,87};
		SortingSystem sortingSystem=new SortingSystem(arr, arr.length,87);
		int sortedArray[]=sortingSystem.comparisionSort();
		assertArrayEquals(new int[]{3,4,5,6,53,56,87}, sortedArray);
	}
	
	
	/** positive test case for comparisionSort */
	/**Quick  Sort*/
	@Test
	public void test4() {
		int arr[]=new int[]{6,4,53,5,3,56,87,344,4,54,65,23,487,432};
		SortingSystem sortingSystem=new SortingSystem(arr, arr.length,87);
		int sortedArray[]=sortingSystem.comparisionSort();
		assertArrayEquals(new int[]{3,4,4,5,6,23,53,54,56,65,87,344,432,487}, sortedArray);
	}
	
	
	/** Positive test case with null array */
	@Test
	public void test5() {
		int arr[]=null;
		SortingSystem sortingSystem=new SortingSystem(arr, 0,0);
		int sortedArray[]=sortingSystem.comparisionSort();
		assertArrayEquals(null, sortedArray);
	}
	
	
	
	/** Positive test case with empty array */
	@Test
	public void test6() {
		int arr[]=new int[]{};
		SortingSystem sortingSystem=new SortingSystem(arr, arr.length,0);
		int sortedArray[]=sortingSystem.comparisionSort();
		assertArrayEquals(null, sortedArray);
	}
	
	
}

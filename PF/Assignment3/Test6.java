import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test6 {
    Program6 object= new Program6();
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
	public void test1() {                //Sorted elements
		int arr[]= {2,5,8,9,10,77,55,11};
		int result[]={2,5,8,9,10,11,55,77};
		object.quickSort(arr,0,7);
		assertArrayEquals(result,arr);
		
	}
	@Test
	public void test2() {                //Sorted elements
		int arr1[]= {};
		int result1[]={};
		object.quickSort(arr1,0,0);
		assertArrayEquals(result1,arr1);
		
	}

}

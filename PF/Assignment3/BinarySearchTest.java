/****************************************************************************************
Name            : BinarySearch
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test search an element by binarysearch.
                :
****************************************************************************************/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
		int inputarray[]={2,5,8,9,10,55,77};
		int element=88;
		BinarySearch object=new BinarySearch();
		assertEquals(-1,object.binarysearch(inputarray, 0, inputarray.length-1, element));
	}
	
	@Test
	public void test1() {
		int inputarray[]={2,5,8,9,10,55,77};
		int element=77;
		BinarySearch object=new BinarySearch();
		assertEquals(6,object.binarysearch(inputarray, 0, inputarray.length-1, element));
	}
	

}

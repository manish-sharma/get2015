import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForBinarySearch {

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
	public void testForValueNotPresent() {
		BinarySearch binaryObj=new BinarySearch();
		int arr[]={2,5,8,9,10,55,77};
		assertEquals("correct result",0,binaryObj.search(88,0,6,arr));

	}
	@Test
	public void testForValuePresentAtEnd() {
		BinarySearch binaryObj=new BinarySearch();
		int arr[]={2,5,8,9,10,55,77};
		assertEquals("correct result",7,binaryObj.search(77,0,6,arr));

	}
	@Test
	public void testForValuePresentAtFirst() {
		BinarySearch binaryObj=new BinarySearch();
		int arr[]={2,5,8,9,10,55,77};
		assertEquals("correct result",1,binaryObj.search(2,0,6,arr));

	}
	@Test
	public void testForValuePresent() {
		BinarySearch binaryObj=new BinarySearch();
		int arr[]={2,5,8,9,10,55,77};
		assertEquals("correct result",2,binaryObj.search(5,0,6,arr));

	}

}

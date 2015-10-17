import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ChecksortedTest {

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
	public void sortedArrayIncreaseTest() {
		Checksorted cs=new Checksorted();
		int []Array ={1,2,3,54,66};
		int value = cs.checkSortedArray(Array);
		assertEquals("Not Valid",1,value);
	
	}
	@Test
	public void sortedArrayDecreaseTest() {
		Checksorted cs=new Checksorted();
		int []Array ={66,54,3,2,1};
		int value = cs.checkSortedArray(Array);
		assertEquals("Not Valid",2,value);
	
	}
	@Test
	public void sortedArrayUnsortedTest() {
		Checksorted cs=new Checksorted();
		int []Array ={1,3,54,5,3};
		int value = cs.checkSortedArray(Array);
		assertEquals("Not Valid",0,value);
	
	}

}

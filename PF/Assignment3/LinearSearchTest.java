/****************************************************************************************
Name            : LinearSearch
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test search an element by linearsearch.
                :
****************************************************************************************/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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
		int inputarray[]={2,5,8,9,10, 77, 55};
		int element=88;
		LinearSearch object=new LinearSearch();
		assertEquals(-1,object.linearsearch(inputarray,0,element));
	}
	
	@Test
	public void test1() {
		int inputarray[]={2,5,8,9,10, 77, 55};
		int element=77;
		LinearSearch object=new LinearSearch();
		assertEquals(5,object.linearsearch(inputarray,0,element));
	}

}

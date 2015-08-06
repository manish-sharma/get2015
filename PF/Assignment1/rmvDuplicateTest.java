package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class rmvDuplicateTest {

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
		rmvDuplicate ob1=new rmvDuplicate();
		int inp[]={1,2,4,2,5,7,3,4,1};
		int out[]=ob1.removeDuplicate(inp);
		int exp[]={1,2,4,5,7,3};
		assertArrayEquals(exp,out);
	}
	


}

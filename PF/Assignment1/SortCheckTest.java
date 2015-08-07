import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortCheckTest {

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
		
		int input[]={6,5,3,2,1};
		SortCheck b=new SortCheck();
		int out=b.check(input);
		assertEquals(2,out);
	}
	
	@Test
	public void test1() {
		
		int input[]={1,2,3,3,4,5};
		SortCheck b=new SortCheck();
		int out=b.check(input);
		assertEquals(1,out);
	}
	@Test
	public void test2() {
		
		int input[]={6,5,7,2,1};
		SortCheck b=new SortCheck();
		int out=b.check(input);
		assertEquals(0,out);
	}

}

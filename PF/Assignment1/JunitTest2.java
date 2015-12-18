import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest2 {

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
		DuplicateRemove dr=new DuplicateRemove();
		int ip[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int op[]={2,4,8,5,6,3,9,0,0,0,0,0,0,0};
		
		assertArrayEquals(op,dr.removeDuplicate(ip));
	}

}

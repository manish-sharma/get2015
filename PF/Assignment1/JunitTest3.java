import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest3 {

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
		//LogestSequence ls=new LogestSequence();
		int ip[]={1,2,3,4,5,6,5,4,3,1,7};
		int op[]={1,2,3,4,5,6};
		assertArrayEquals(op,LogestSequence.longestSequence(ip));
		
		
	}

}

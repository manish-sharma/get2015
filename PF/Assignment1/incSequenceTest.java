package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class incSequenceTest {

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
		incSequence ob=new incSequence();
		int inp[]={1,5,2,4,3,7,8,9,6,4};
		int exp[]={3,7,8,9};
		assertArrayEquals(exp,ob.longestSequence(inp));
	}

}

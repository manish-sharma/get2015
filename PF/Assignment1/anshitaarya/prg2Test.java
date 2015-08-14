package anshitaarya;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class prg2Test {

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
		int []input={2,5,4,6,3,8,5,3,3,6,3,9,0};
		int []output={2,5,4,6,3,8,9,0,0,0,0,0,0};
		prg2 obj=new prg2();
		assertArrayEquals(output,obj.removeDuplicates(input));
	}

}

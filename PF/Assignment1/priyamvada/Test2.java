package priyamvada;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {

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
		int[] duplicate = {2,5,4,6,3,8,5,3,3,6,3,9,0};
        int[] output = {0,2,3,4,5,6,8,9};
		Program2 obj =new Program2();
		assertArrayEquals(output,obj.removeDuplicates(duplicate));
		}

}

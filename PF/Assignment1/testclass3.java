package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass3 {

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
		Assignment3 a1=new Assignment3();
		int input[]={1,2,1,2,3,4,1,3};
		int exp[]={1,2,3,4};
		int ans[]=a1.longestSequence(input);
		assertArrayEquals("True",exp,ans);
	}

}

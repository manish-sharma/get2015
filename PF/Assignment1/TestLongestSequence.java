package LongestSequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLongestSequence {

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
		LongestSequence obj=new LongestSequence();
		int input[]={1,2,3,4,5,2,3,4,7,8,9,1,2,3,3,3,4,5,6,7,8,9};
		int actual[]=obj.longestSequence(input);
		int expected[]={1,2,3,3,3,4,5,6,7,8,9};
		
		assertArrayEquals(expected, actual);
		
	}
	@Test
	public void test1() {
		LongestSequence obj=new LongestSequence();
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int actual[]=obj.longestSequence(input);
		int expected[]={1,2,4,5,6,7,8,9};
		
		assertArrayEquals(expected, actual);
		
	}


}

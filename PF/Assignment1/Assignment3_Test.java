package programing_fundamental;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment3_Test {

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
	Assignment_3 test3=new Assignment_3();
	int input[]=test3.longestSequence(new int[]{1,2,3,4,5,6,7,8,9,2,3,4,5,1,2,3,7,8,9,5,4,3,8,9,1});
	int output[]={1,2,3,4,5,6,7,8,9};
	assertArrayEquals("",input,output);
	
	}

}

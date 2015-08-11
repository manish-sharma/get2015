package programing_fundamental;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment6_Test {

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
		Assignment_6 test6=new Assignment_6();
		int c[]=new int[8];
		int input1[]=test6.join(new int[]{1,3,5,7},4,new int[]{2,4,6,8},4,c);
		assertArrayEquals("",new int[]{1,2,3,4,5,6,7,8},input1);
	}

}

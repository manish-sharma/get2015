package programing_fundamental;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class assignment4test {

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
		assignment4 test4=new assignment4();
		int [][]output=test4.FCFS(new int[]{1,5,9,25}, new int[]{12,7,2,5});
		assertArrayEquals(new int[]{1,1,0,1,12},output[0]);
		assertArrayEquals(new int[]{2,5,8,13,19},output[1]);
		assertArrayEquals(new int[]{3,9,11,20,21},output[2]);
		assertArrayEquals(new int[]{4,25,0,25,29},output[3]);
	}

}

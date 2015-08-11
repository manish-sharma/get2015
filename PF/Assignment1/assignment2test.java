package programing_fundamental;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class assignment2test {

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
		assignment2 test2=new assignment2();
		int input[]=test2.removeDuplicate(new int[]{1,2,3,4,1,2,3,5,6,7,1,0,0,7,6});
		int output[]={1,2,3,4,5,6,7,0};
		assertArrayEquals(input,output);
		
	}

}

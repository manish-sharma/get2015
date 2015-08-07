package programing_fundamental;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class assignment5test {

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
		assignment5 test5=new assignment5();
		int input1=test5.checkArraySort(new int[]{1,2,3,4,5});
		int input2=test5.checkArraySort(new int[]{5,4,3,2,1});
		int input3=test5.checkArraySort(new int[]{1,9,3,7,5});
		assertEquals("",1,input1);
		assertEquals("",1,input1);
		assertEquals("",1,input1);
	}

}

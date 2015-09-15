import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitAssignment5 {

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
		Assignment5 obj=new Assignment5();
		int output1=obj.checkArrayOrder(new int[]{1,2,3,4,5});
		int output2=obj.checkArrayOrder(new int[]{5,4,3,2,1});
		int output3=obj.checkArrayOrder(new int[]{1,2,4,3,5});
		assertEquals("",1,output1);
		assertEquals("",2,output2);
		assertEquals("",0,output3);
	}

}

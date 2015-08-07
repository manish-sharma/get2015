import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment6Test {

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
	public void mergeTwoArraysTest(){
		Assignment6 obj=new Assignment6();
		int[] a={1,2,3,4,5,8};
		int[] b={9,10,11,12,13,14};
		int[] c=new int[a.length+b.length];
		c=obj.join(a,6,b,6,c);
		int[] d={1,2,3,4,5,8,9,10,11,12,13,14};
		assertArrayEquals("Not Merged Properly",d,c );
		
	}

}

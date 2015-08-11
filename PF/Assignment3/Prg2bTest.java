package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prg2bTest {
	Prg2b obj=new Prg2b();
	int[] arr= {2,5,8,9,10, 77, 55};
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
		
		assertEquals("nuber not found",-1,obj.binary(arr,88,0,6));  // test for(88)
		assertEquals("nuber found",5,obj.binary(arr,77,0,6));  // test for(77)
		
	}
	

	}



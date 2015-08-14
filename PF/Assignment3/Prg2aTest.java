package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prg2aTest {
	Prg2a obj=new Prg2a();
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
		
		assertEquals("nuber not found",-1,obj.linear(arr,88));  // test for(88)
		
	}
	@Test
	public void test1() {
		
		assertEquals("nuber found",6,obj.linear(arr,77));  // test for(77)
	}

}

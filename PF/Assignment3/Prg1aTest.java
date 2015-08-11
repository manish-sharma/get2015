package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prg1aTest {

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
		 Prg1a obj=new Prg1a();
		assertEquals("division completed",0,obj.rem(2, 1));  // test for(2,1)
		assertEquals("division completed",1,obj.rem(100, 3)); // test for(100,3)
		assertEquals("cannot be divided",-1,obj.rem(2, 0)); // test for(2,0)
	}

}

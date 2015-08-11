package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prg1cTest {
	Prg1c obj=new Prg1c();
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
		 
			assertEquals("largest digit calculated",2,obj.largestdigit(2));  // test for(2)
			
			
	}
	@Test
	public void test1() {
		 
			
			assertEquals("largest digit calculated",9,obj.largestdigit(1257369));  // test for(1257369)
			
			
	}
	@Test
	public void tes2t() {
		 
			
			assertEquals("largest digit calculated",4,obj.largestdigit(444));  // test for(444)
			
	}

}

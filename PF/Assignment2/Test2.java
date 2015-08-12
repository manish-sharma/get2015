import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test2 {

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
		Program2 obj = new Program2(); //Object of class program2
		String a="  ";           
		String b="12345";        
		
		assertEquals(a,obj.spaces(2, 5)); //To test spaces returned as a string (Module 1)
		assertEquals(b,obj.number(1, 5)); //To test numbers returned as a string(Module 2)
		for(int i=0;i<5;i++)
		{
			String c="";
			String d= obj.spaces(i,5)+obj.number(i,5);
			c= obj.pyramid(i,5);
			assertEquals(c,d);         //To test the pattern returned as a string(Module 3)
			
		}
	}

}

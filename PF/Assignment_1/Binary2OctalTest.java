import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class Binary2OctalTest {
 
	@Before
	public void setUp() throws Exception {
		System.out.println("In Method setup");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("In Method teardown");
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("In Class tearDownClass");
	}
	
	@Test
	public void test() {
		System.out.print("Binary to octal conversion test");
		Binary2Octal binary2octal_object=new Binary2Octal();
		int binary2OctalConverted=binary2octal_object.binary2Octal(11000);
		assertEquals("not match",65,binary2OctalConverted);
		assertEquals("match",65,binary2OctalConverted);
	}

}

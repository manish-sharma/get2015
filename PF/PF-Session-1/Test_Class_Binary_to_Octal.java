import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Binary_to_Octal {
	Binary_to_Octal obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new Binary_to_Octal();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(65, obj.convert(110101));
		
	}

}

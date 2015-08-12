package priyamvada;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 extends TestCase {

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
		Program1 obj =new Program1();
		TestCase.assertEquals("Compiled correctly",53,obj.binaryTodecimal(110101));
		TestCase.assertEquals("Compiled correctly",65,obj.decimalTooctal(53));
	}

}

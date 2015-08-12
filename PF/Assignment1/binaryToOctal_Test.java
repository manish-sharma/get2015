import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class binaryToOctal_Test {

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
	public void test_binary_octal_conversion()
	{
		binaryToOctal object=new binaryToOctal();
		int actual_output=object.convert_binay_tooctal(1010);
		int expected_output=12;
		assertEquals("match",expected_output,actual_output);
	}
}

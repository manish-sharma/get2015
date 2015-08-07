package OctalToBinary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConvertBinaryToOctal {

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
		ConvertBinaryToOctal obj=new ConvertBinaryToOctal();
		int actual=obj.convertBinaryToOctal(11010);
		assertEquals(32, actual);
	}
	
	
	@Test
	public void test2() {
		ConvertBinaryToOctal obj=new ConvertBinaryToOctal();
		int actual=obj.convertBinaryToOctal(11001);
		assertEquals(31, actual);
	}



}

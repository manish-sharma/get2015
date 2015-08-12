import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryToOctalTest  {

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
	public void randomTest() {
		BinaryToOctal bin=new BinaryToOctal();
		assertEquals("Test Case",65,bin.convertBinaryToOctal(110101));
		
	}
	@Test
	public void lowerBoundTest() {
		BinaryToOctal bin=new BinaryToOctal();
		assertEquals("Test Case",0,bin.convertBinaryToOctal(00000));
		
	}
	@Test
	public void upperBoundTest() {
		BinaryToOctal bin=new BinaryToOctal();
		assertEquals("Test Case",37,bin.convertBinaryToOctal(11111));
		
	}
	@Test
	public void upperRandomTest() {
		BinaryToOctal bin=new BinaryToOctal();
		assertEquals("Test Case",30,bin.convertBinaryToOctal(11000));
		
	}
	

}

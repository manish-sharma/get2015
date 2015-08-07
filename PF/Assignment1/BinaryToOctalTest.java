import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinaryToOctalTest {

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
	public void binaryToOctalTest() {
		BinaryToOctal binaryToOctal= new BinaryToOctal();
		
		assertEquals(13,binaryToOctal.binaryToOctal(1011) );
		
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForGCD {

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
	public void testForValueOne() {
		GreatestCommonDivisor commonDivisor=new GreatestCommonDivisor();
		assertEquals("correct reult",1,commonDivisor.gcd(2, 1));
	}
	@Test
	public void testForDifferentValue() {
		GreatestCommonDivisor commonDivisor=new GreatestCommonDivisor();
		assertEquals("correct reult",6,commonDivisor.gcd(12, 18));
	}
	@Test
	public void testWhenGCDWillBeOne() {
		GreatestCommonDivisor commonDivisor=new GreatestCommonDivisor();
		assertEquals("correct reult",1,commonDivisor.gcd(100, 3));
	}

}

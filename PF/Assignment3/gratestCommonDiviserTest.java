import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class gratestCommonDiviserTest {

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
	public void gratestcommonDivisertest1() {
		gratestCommonDiviser objectCommonDiviser=new gratestCommonDiviser();
		int expectedGratestcommonDiviser=1;
		int actualGratestCommonDiviser=objectCommonDiviser.gcd(2, 1);
		assertEquals("Match",expectedGratestcommonDiviser,actualGratestCommonDiviser);
	}

	@Test
	public void gratestcommonDivisertest2() {
		gratestCommonDiviser objectCommonDiviser=new gratestCommonDiviser();
		int expectedGratestcommonDiviser=6;
		int actualGratestCommonDiviser=objectCommonDiviser.gcd(12,18);
		assertEquals("Match",expectedGratestcommonDiviser,actualGratestCommonDiviser);
	}
	
	@Test
	public void gratestcommonDivisertest3() {
		gratestCommonDiviser objectCommonDiviser=new gratestCommonDiviser();
		int expectedGratestcommonDiviser=1;
		int actualGratestCommonDiviser=objectCommonDiviser.gcd(100,3);
		assertEquals("Match",expectedGratestcommonDiviser,actualGratestCommonDiviser);
	}
}

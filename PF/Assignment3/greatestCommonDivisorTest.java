import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class greatestCommonDivisorTest {

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
		greatestCommonDivisor objectCommonDiviser=new greatestCommonDivisor();
		int expectedGratestcommonDiviser=1;
		int actualGratestCommonDiviser=objectCommonDiviser.getgreatestcommondiviser(2, 1);
		assertEquals("Match",expectedGratestcommonDiviser,actualGratestCommonDiviser);
	}

	@Test
	public void gratestcommonDivisertest2() {
		greatestCommonDivisor objectCommonDiviser=new greatestCommonDivisor();
		int expectedGratestcommonDiviser=6;
		int actualGratestCommonDiviser=objectCommonDiviser.getgreatestcommondiviser(12,18);
		assertEquals("Match",expectedGratestcommonDiviser,actualGratestCommonDiviser);
	}
	
	@Test
	public void gratestcommonDivisertestValid() {
		greatestCommonDivisor objectCommonDiviser=new greatestCommonDivisor();
		int expectedGratestcommonDiviser=1;
		int actualGratestCommonDiviser=objectCommonDiviser.getgreatestcommondiviser(100,3);
		assertEquals("Match",expectedGratestcommonDiviser,actualGratestCommonDiviser);
	}
}

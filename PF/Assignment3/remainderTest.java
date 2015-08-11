import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class remainderTest {

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
	public void checkRemainde1r() {
		remainder remainderobj=new remainder();
		int expectedRemainder=0;
		int actualRemainder=remainderobj.rem(2,1);
		assertEquals("Match",expectedRemainder,actualRemainder);
	}
	
	@Test
	public void checkRemainder2() {
		remainder remainderobj=new remainder();
		int expectedRemainder=2;
		int actualRemainder=remainderobj.rem(2,0);
		assertEquals("Match",expectedRemainder,actualRemainder);
	}
	
	@Test
	public void checkRemainder3() {
		remainder remainderobj=new remainder();
		int expectedRemainder=1;
		int actualRemainder=remainderobj.rem(100,3);
		assertEquals("Match",expectedRemainder,actualRemainder);
	}

}

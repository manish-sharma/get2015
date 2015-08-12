import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GetLongestSequenceTest {

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
	public void atTheEndLongesttest() {

      GetLongestSequence assign=new GetLongestSequence();
      int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
      int expected[]={1,2,4,5,6,7,8,9};
      assertArrayEquals("ressult is correct",expected,assign.longestSequence(input));
	}

	@Test
	public void atMiddleLongesttest() {

      GetLongestSequence assign=new GetLongestSequence();
      int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,9,10,1,2,4,5,6,7,8,9};
      int expected[]={2,3,4,5,6,7,8,9,10};
      assertArrayEquals("ressult is correct",expected,assign.longestSequence(input));
	}
	@Test
	public void atStartingLongesttest() {

      GetLongestSequence assign=new GetLongestSequence();
      int input[]={1,2,3,4,5,6,7,8,9,10,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
      int expected[]={1,2,3,4,5,6,7,8,9,10};
      assertArrayEquals("ressult is correct",expected,assign.longestSequence(input));
	}
}

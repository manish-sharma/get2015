import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DuplicateTest {

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
	public void redundancyArraytest() {
      Duplicate dup=new Duplicate();
      int input[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
      int expected[]={2,5,4,6,3,8,9,0};
      assertArrayEquals("result correct",expected,dup.removeDuplicate(input));

	}
	@Test
	public void allRepeatedtest() {
      Duplicate dup=new Duplicate();
      int input[]={1,1,1,1,1,1,1,1};
      int expected[]={1};
      assertArrayEquals("result correct",expected,dup.removeDuplicate(input));

	}
	@Test
	public void allDifferenttest() {
      Duplicate dup=new Duplicate();
      int input[]={1,2,3,4,5,6,7,8};
      int expected[]={1,2,3,4,5,6,7,8};
      assertArrayEquals("result correct",expected,dup.removeDuplicate(input));

	}

}

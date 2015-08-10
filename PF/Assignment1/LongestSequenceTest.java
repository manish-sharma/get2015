import static org.junit.Assert.*;

import javax.sound.midi.Sequence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LongestSequenceTest {

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
	
	
	
	int a[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
	public int longestSequenceTest(int expected[])
	{
	LongestSequence sequence= new LongestSequence();
	for(int i=0;i<expected.length;i++)
	{
		if(expected[i]!=sequence.longestSequence(a)[i])
		{
			
		return -1;	
		}
		
		
	}
         		
	return 0;
	}

	@Test
	public void test() {
		
		LongestSequenceTest longestSequenceTest= new LongestSequenceTest();
		int expected[]={1,2,4,5,6,7,8,9};
		assertEquals(0,longestSequenceTest.longestSequenceTest(expected) );
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DublicateTest {

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
	int a[]={1,2,1};
	public int dublicateTest(int expected[])
	{
	Dublicate dublicate = new Dublicate();
	for(int i=0;i<expected.length;i++)
	{
		if(expected[i]!=dublicate.removeDuplicate(a)[i])
		{
			
		return -1;	
		}
		
		
	}
         		
	return 0;
	}

	@Test
	public void test() {
		
		DublicateTest test = new DublicateTest();
		int expected[]={1,2};
		assertEquals(0,test.dublicateTest(expected) );
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest1b {

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
    public void positiveTest() 
	{
		int x=100,y=3;
		
		Assignment1b ab=new Assignment1b();
		assertEquals(1, ab.gcd(x,y));
		
	}
	
/*I	@Test
	public void nagativeTest() 
	{
		int x=100,y=3;
		
		Assignment1b ab=new Assignment1b();
		assertEquals(2, ab.gcd(x,y));
		
	} */
		
	@Test(expected=Exception.class)
	public void dividedByZeroExample1(){
		//int e = 1/0;
	}
	
}

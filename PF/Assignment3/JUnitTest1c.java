import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest1c {

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
		int num=12567489,large=0;
		
		Assignment1c ac=new Assignment1c();
		assertEquals(9, ac.largestDigit(num,large));
		
	}
	
/*	@Test
	public void nagativeTest() 
	{
        int num=12567489,large=0;
		
		Assignment1c ac=new Assignment1c();
		assertEquals(5, ac.largestDigit(num,large));
		
	} */
		
	@Test(expected=Exception.class)
	public void dividedByZeroExample1(){
		//int e = 1/0;
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest1 {

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
	public void spaceTest() {   /*JUnit Function for number of space checking*/
		
		String expect=" ";
				
		Assignment1 ass1=new Assignment1();
		
		assertEquals(expect, ass1.space(4,5));
	}
	
    public void numberTest() {    /* JUnit Function for checking number in a row */
		
		String expect="123454321";
				
		Assignment1 ass1=new Assignment1();
		
		assertEquals(expect, ass1.number(4,5));
	}
    
    public void patternTest() {      /* JUnit Function for checking Full pattern */
		
		String expect="   1\n  121\n 12321\n  121\n   1\n";
				
		Assignment1 ass1=new Assignment1();
		
		assertEquals(expect, ass1.pyramid(3));
	}
    
}

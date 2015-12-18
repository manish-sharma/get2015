import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest2 {

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
    public void spaceTest() {         /*JUnit Function for number of space checking*/ 
		
		String expect="  ";
				
		Assignment2 ass2=new Assignment2();
		
		assertEquals(expect, ass2.space(3,5));
	}
	
    public void numberTest() {           /* JUnit Function for checking number in a row */
		
		String expect="12345";
				
		Assignment2 ass2=new Assignment2();
		
		assertEquals(expect, ass2.number(4));
	}
    
    public void patternTest() {          /* JUnit Function for checking Full pattern */
		
		String expect="1234\n 123\n  12\n   1\n";
				
		Assignment2 ass2=new Assignment2();
		
		assertEquals(expect, ass2.pyramid(4));
	}

}

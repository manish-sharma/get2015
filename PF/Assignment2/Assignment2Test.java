package programingFundamental2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment2Test {

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
	public void Assignment1Test() 
	{
	
		Assignment2 assin1=new Assignment2();
		String[] pyr=assin1.printPyramid(5);
		String[] expPyrStrings={"12345",
								" 1234",
								"  123",
								"   12",
								"    1"	
								};
		assertArrayEquals("Not matched",expPyrStrings,pyr);;
	}

}

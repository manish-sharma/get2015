package programingFundamental2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment1Test {

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
	public void Assignment2Test() 
	{
	
		Assignment1 assin1=new Assignment1();
		String[] pyr=assin1.printPyramid(5);
		String[] expPyrStrings={"    1",
								"   121",
								"  12321",
								" 1234321",
								"123454321",
								" 1234321",
								"  12321",
								"   121",
								"    1"	
								};
		assertArrayEquals("Not matched",expPyrStrings,pyr);
	}

}

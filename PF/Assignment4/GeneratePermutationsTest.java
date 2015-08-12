/****************************************************************************************
Name            : GenratePermutation
Revision Log    : 2015-08-12: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test permutestring method
                :
****************************************************************************************/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GeneratePermutationsTest {

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

	//Test for string ABC 
	@Test
	public void testforABC() 
	{
		GeneratePermutations object=new GeneratePermutations();	
		String actual=object.permutestring("","ABC");
		String expected="ABC\nACB\nBAC\nBCA\nCAB\nCBA\n";
		assertEquals(expected,actual);
	}
	//Test for string ABCD
	@Test
	public void testforABCD() 
	{
		GeneratePermutations object=new GeneratePermutations();	
		String actual=object.permutestring("","ABCD");
		String expected="ABCD\nABDC\nACBD\nACDB\nADBC\nADCB\nBACD\nBADC\nBCAD\nBCDA\nBDAC\nBDCA\nCABD\nCADB\nCBAD\nCBDA\nCDAB\nCDBA\nDABC\nDACB\nDBAC\nDBCA\nDCAB\nDCBA\n";
		assertEquals(expected,actual);
	}

}

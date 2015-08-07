import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


/**
 * @author Piyush
 *
 */
public class Day2JUnitTest {

	@Test
	public void Assignment1Test() {
	
		Day2Assignment assin1=new Day2Assignment();
		String[] pyr=assin1.printPyramid(5);
		String[] expPyrStrings={"12345",
								" 1234",
								"  123",
								"   12",
								"    1"	
								};
		assertArrayEquals("Not matched",expPyrStrings,pyr);;
	}

	
	@Test
	public void Assignment2Test() {
	
		Day2AssignmentII assin1=new Day2AssignmentII();
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

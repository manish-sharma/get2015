/****************************************************************************************
Name            : SquareTest
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test Square class
                :
****************************************************************************************/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SquareTest {

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
	//Test of getArea method
	public void test() {
		int expected=16;
		Square object=new Square(4);
		int actual=(int) object.getArea();
		assertEquals(expected,actual);
		
	}

}
//End of class

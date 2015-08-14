/****************************************************************************************
Name            : CircleTest
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test circle class
                :
****************************************************************************************/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CircleTest {

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
		int expected=(int) 18.84;
		Circle cirObject=new Circle(3);
		int actual=(int) cirObject.getArea();
		assertEquals("Not Matched",expected,actual);
	}

}
//End of class

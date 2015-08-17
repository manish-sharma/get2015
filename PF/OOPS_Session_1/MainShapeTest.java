import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MainShapeTest {

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
	public void getAreaCircleTest2() {

		Circle circleObj= new Circle(0);
		double delta = 0;
		assertEquals("", 0,circleObj.getArea(),delta);
		
	}
	@Test
	public void getAreaSquareTest3() {

		Square squareObj= new Square(3);
		double delta = 0;
		assertEquals("Expcted and actual values are same", 9,squareObj.getArea(),delta);
		
	}
	@Test
	public void getAreaSquareTest4() {

		Square squareObj= new Square(5);
		double delta = 0;
		assertEquals("Expcted and actual values are same", 25,squareObj.getArea(),delta);
		
	}
}



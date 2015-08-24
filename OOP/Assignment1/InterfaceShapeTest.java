import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InterfaceShapeTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	// test if area of circle calculated by interface equals that calculated by circle class's method or not
	public void testCircleGetArea()   
	{	
        double circleArea = new Circle(2).getArea();       
        interfaceShape obj = new interfaceShape();       
        Shape circleShape = new Circle (2);
        double expectedArea = obj.printShape(circleShape);             
        assertEquals(circleArea, expectedArea, 0.001);
	}
	
	
	@Test
	// test if area of square calculated by interface equals that calculated by circle class's method or not
	public void testSquareGetArea()   
	{
		double squareArea = new Square(5).getArea();
        interfaceShape obj = new interfaceShape();
        Shape squareShape = new Square (5);
        double expectedArea = obj.printShape(squareShape); 
        assertEquals(squareArea, expectedArea, 0.001);
	}

}

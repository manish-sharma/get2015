package assignmentOOP_1;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit3 {
	Shape circleShape;
	Shape squareShape;
	
	
	/* This is to test  for circle shape class which implement shape interface*/
	@Test
	public void testForCircle()
	{
		circleShape=new Circle(7);
		double expected=153.93804002589985;
		double output=circleShape.getArea();
		assertEquals(expected,output,.001);
		
	}
	/* This is to test  for Square shape class which implement shape interface*/
	@Test
	public void testForSquare()
	{
		squareShape=new Square(4);
		double expected=16.0;
		double output=squareShape.getArea();
		assertEquals(expected,output,.001);
		
	}

}

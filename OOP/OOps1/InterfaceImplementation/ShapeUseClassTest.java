package InterfaceImplementation;

import static org.junit.Assert.*;


import org.junit.Test;

public class ShapeUseClassTest {


	@Test
	public void test() {
		Shape circleShape = new Circle(4);
		double area=Math.PI*4*4;
		assertEquals("not match",area,circleShape.getArea(),2.0);
	}

}
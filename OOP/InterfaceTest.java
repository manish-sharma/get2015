package oops_asignment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterfaceTest {

	/**
	* Name:test
	* Description: checks the value returned
	**/
	@SuppressWarnings("deprecation")
	@Test
	   public void test()
	   {
		Shape obj = new Square(5);
		double expected = 25.0;
		double actual = obj.getArea();
		assertEquals(expected,actual,0);
	   }
		/**
		 * Name:test1
		 * Description: checks the value returned
		 **/
		@SuppressWarnings("deprecation")
		@Test
		
		public void test1()
		{
		 Shape obj = new Circle(5);
		 double expected = 75.0;
		 double actual = obj.getArea();
		 assertEquals(expected,actual,0);
		}
		/*tested perfectly*/

}

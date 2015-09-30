package Shape;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

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
	public void test()      //Junit Test
	{
	   int i=0;
	   double area[]={12.56,9.0};
	   Shape circleShape = new Circle(2);
	   Shape squareArea = new Square(3);

	   List<Shape> shape = new ArrayList<Shape>();
	   shape.add(circleShape);
	   shape.add(squareArea);

	   java.util.Iterator<Shape> itr=shape.iterator();//getting Iterator from arraylist to traverse elements  
	   while(itr.hasNext()){  

	    assertArrayEquals(area[i],itr.next().getArea());
	    i++;
	 }
	}

	private void assertArrayEquals(double d, double area) {
		// TODO Auto-generated method stub
		
	}

	

}

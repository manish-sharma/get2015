// program to apply interface concepts using different shapes

import java.util.List;
import java.util.ArrayList;

interface Shape
{
	double getArea();          // returns area of given shape
	String draw();             // returns appropriate messages
}


class Circle implements Shape
{
	private int radius;

	public Circle ( int radius)
	{
		this.radius = radius ;
	}
	
	/* returns appropriate messages */
	public String draw()  
	{
		return "In circle";
	}
	
	/* returns area of circle */
	public double getArea()    
	{
		return 3.14 * Math.pow(radius,2) ;
	}

}


class Square implements Shape
{
	private int side;
	
	/* parameterized constructor */
	public Square ( int side)
	{
		this.side = side ;
	}
	
	/* returns appropriate messages */
	public String draw()       
	{
		return "In Square";
	}
	
	/*  returns area of square */
	public double getArea()  
	{
		return Math.pow(side,2) ;
	}

}


public class interfaceShape 
{
	/* it takes interface object as parameter. It calls getArea() for the class whose reference is passed in it. */
	double printShape(Shape shape)   
	{
		return shape.getArea();
	}
	
	public static void main(String[] args) 
	{
		interfaceShape shapeObj = null;
		Shape circleShape = null;
		Shape squareShape = null;
		
		try
		{
			shapeObj = new interfaceShape ();
			
	        circleShape = new Circle (2);  // passing object of circle class in reference of interface Shape
	        squareShape = new Square (5);  // passing object of square class in reference of interface Shape
	        
	        System.out.println( "Area of circle = "+shapeObj.printShape(circleShape) );		 // it takes interface object as parameter. It calls getArea() for the circle class. 
	        System.out.println( "Area of square = "+shapeObj.printShape(squareShape) );         // it takes interface object as parameter. It calls getArea() for the square class.
	        
	        List<Shape> shape = new ArrayList<Shape>();    // List array of type interface is created
	        shape.add(circleShape);  // adding circle area to list
	        shape.add(squareShape);  // adding square area to list
	        
	        for( Shape obj1 : shape )					   // printing list elements one by one
	        	System.out.println( obj1.draw() );
		}
		catch( Exception ex )
		{
			System.out.println(ex);
		}
		finally
		{
			if(shapeObj!=null)
				shapeObj = null;
			if(circleShape!=null)
				circleShape = null;
			if(squareShape!=null)
				squareShape = null;
		}
	}
}

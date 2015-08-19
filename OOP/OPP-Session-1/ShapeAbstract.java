
import java.util.Scanner;

/*
 * This program implement the abstract concept of shape
 */
 interface Shape {
    public double area();
    public double perimeter();
}


/** Rectangle class which inherits abstract class Shape */
class Rectangle implements Shape {
	/** sides of rectangle */
    private final double width, length;
    /** default constructor */
    public Rectangle() {
        this(1,1);
    }
    
    /** Parameterized constructor constructor */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double area() {
        /** Area of rectangle = width X Length */
        return width * length;
    }


    public double perimeter() {
    	/** Area of rectangle = 2(width + Length) */
        return 2 * (width + length);
    }

}

/** Circle class which inherits abstract class Shape */
 class Circle implements Shape {
    private final double radius;
    final double pi = Math.PI;

    /** default constructor */
    public Circle() {
        this(1);
    }  
    
    /** Parameterized constructor constructor */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** This method return the area of circle */
    public double area() {
        /** Area of circle = 2 X Radius X Radius  */
        return pi * Math.pow(radius, 2);
    }

    /** This method return the perimeter of circle */
    public double perimeter() {
    	/** Perimeter of circle is given by 2 X pi X Radius  */
        return 2 * pi * radius;
    }
}

 /** Triangle class which inherits abstract class Shape */
 class Triangle implements Shape {
	    private final double a, b, c; // sides
        
	    /** default constructor */
	    public Triangle() {
	        this(1,1,1);
	    }
	    
	    /** Parameterized constructor constructor */
	    public Triangle(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    /**  This will return the area of triangle using heron,s formula */
	    public double area() {
	        /*
	           *  Heron's formula:
	           *  A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
	           *  where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
	        */
	        double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }

	    /** This method return the perimeter of circle */
	    public double perimeter() {
	       /** perimeter is total sum of all sides of triangle */
	        return a + b + c;
	    }
	}

public class ShapeAbstract {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        /** for rectangle */
		System.out.print("Enter the width and length of rectangle: ");
        double width = sc.nextDouble(), length = sc.nextDouble();
        
        /** rectangle is object which calling parametrized constructor */
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        /** for circle */
        System.out.print("Enter the Radius of circle: ");
        double radius = sc.nextDouble();
        /**circle is object which calling parametrized constructor */
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        /**  for triangle */
        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble(), b =sc.nextDouble(), c = sc.nextDouble();
        /** triangle is object which calling parametrized constructor */
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }

}

package oops_asignment_1;

import java.util.Scanner;

public class ShapeMain {
	/*static method to print area of Shape*/ 
	static void printShape(Shape shape)
	{
		System.out.println("area is:"  + shape.getArea());
	}
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the radius of circle:");
		 int radius = sc.nextInt();
		 Shape shape = new Circle(radius);
		 shape.draw();
		 shape.getArea();
		 printShape(shape);
		 
		 System.out.println("Enter the side of square:");
		 int side = sc.nextInt();
		 Shape squareobj = new Square(side);
		 squareobj.draw();
		 squareobj.getArea();
		 printShape(squareobj);
    }
}

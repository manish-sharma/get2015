package Assignment5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ShapeTest {

	/**
	 * It is used for Printing shapes and areas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* Main Class */
		ShapeTest shapeTest = new ShapeTest();
		Scanner sc = new Scanner(System.in);
		// Shape Information

		System.out.println("Enter radius of Circle");
		int shapeRadius = sc.nextInt();
		System.out.println("Enter side of Square");
		int shapeSide = sc.nextInt();
		Shape circleShape = new Circle(shapeRadius);
		Shape squareArea = new Square(shapeSide);

		System.out.println("First Method ");
		circleShape.draw();
		shapeTest.printShape(circleShape);
		squareArea.draw();
		shapeTest.printShape(squareArea);

		System.out.println("\nSecond Method ");
		List<Shape> shape = new ArrayList<Shape>();
		shape.add(circleShape);
		shape.add(squareArea);

		Iterator<Shape> itr = shape.iterator();// getting Iterator from
												// arraylist to traverse
												// elements
		while (itr.hasNext()) {
			Shape s1 = itr.next();
			s1.draw();
			shapeTest.printShape(s1);
		}
		sc.close();

	}

	/**
	 * @param shape
	 *            ->To print shape
	 */
	public void printShape(Shape shape) {
		System.out.println(shape.getArea());
	}
}

/**
 * implementing circle
 *
 */
class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("This Is Circle");
		// Circle drawing logic
	}

	public double getArea() {
		// Circle area calculation
		return (3.14 * radius * radius);

	}
}

/**
 * implementing square
 *
 */
class Square implements Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void draw() {
		System.out.println("This Is Square");
		// Square drawing logic}
	}

	public double getArea() {
		// Square area calculation
		return (side * side);

	}
}

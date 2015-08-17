package oop1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ShapeUseClass {
	
	/**
	 * UserInput is a function which is use to calculate the length of an array
	 * 
	 * @return It return a length of an array
	 */
	private double UserInput() {
		double length;
		try {
			Scanner sc = new Scanner(System.in);

			length = sc.nextDouble();
			if (length < 0) {
				System.out.println("length can't be negative");
				length = UserInput();

			}
			return length;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			length = UserInput();
			return length;
		}

	}
	void readInput(){
		ShapeUseClass use = new ShapeUseClass();
		System.out.println("enter 1 for circle and 2 for square");
		int option=(int) use.UserInput();
		if(option==1){
			System.out.println("enter the radius of circle");
			double rad=use.UserInput();
			Shape circleShape = new Circle(rad);
			use.printShape(circleShape);
			circleShape.draw();
		}
		else if(option==2){
			System.out.println("enter the side of square");
			double side=use.UserInput();
			Shape SquareShape = new Square(side);
			use.printShape(SquareShape);
			SquareShape.draw();
		}
		else
			System.out.println("enter correct value next time");
	}
	void printShape(Shape shape){
		System.out.println("area of shape is "+shape.getArea());
	}
	public static void main(String args[]){
		List<Shape> shape = new ArrayList<Shape>();
		int option=1;
		while(option==1){
			ShapeUseClass obj=new ShapeUseClass();
			obj.readInput();
			System.out.println("enter 1 to continue");
			option=(int) obj.UserInput();
		}
	}
}

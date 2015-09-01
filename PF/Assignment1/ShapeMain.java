
import java.util.*;

//main class for calculating and printing area of square and circle
public class ShapeMain {

	public static void main(String arg[]) // main function
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of side");
		int length = scan.nextInt(); // user input of lenght of side

		System.out.println("using direct approach"); // direct approach
		Shape circle = new Circle(length);
		circle.draw(); // calling circle function
		printShape(circle);
		Shape square = new Square(length);
		square.draw(); // calling square function
		printShape(square);
		scan.close();

		List<Shape> shape = new ArrayList<Shape>(); // link approach
		System.out.println("using list approach");
		shape.add(circle); // calling circle function
		shape.add(square); // calling square function
		Iterator<Shape> itr = shape.iterator();
		while (itr.hasNext()) {
			Shape s1 = itr.next();
			s1.draw();
			printShape(s1);
		}

	}

	public static void printShape(Shape shape) {
		System.out.println("area is" + shape.getArea());
	}

}

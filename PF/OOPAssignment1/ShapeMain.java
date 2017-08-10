import java.util.*;

/**
 * @author Sumitra
 * this class is main class for shape interface and two class square and circle ;
 *
 */
public class ShapeMain {
public static void main(String arg[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of side");
	int length=scan.nextInt();
	Shape circle=new Circle(length);
	//created the object of Shape and reference is of Circle class.
	circle.draw();
	printShape(circle);
	Shape square=new Square(length);
	//created the object of Shape and reference of Square class.
	square.draw();
	printShape(square);
	System.out.println();
	//used array to store objects
	System.out.println("BY LIST METHOD");
	List<Shape> shape = new ArrayList<Shape>();
	System.out.println("enter the length of side");
	 length=scan.nextInt();
	Shape circleAgain=new Circle(length);
	//created the object of Shape and reference is of Circle class.
	Shape squareAgain=new Square(length);
	//created the object of Shape and reference of Square class.
	shape.add(circleAgain);
	shape.add(squareAgain);
	Iterator<Shape> itr=shape.iterator();
	//iterator is used to use every object.
	while(itr.hasNext())
	{
		Shape s1=itr.next();
		s1.draw();
		printShape(s1);
	}
	scan.close();
}
/**
 * 
 * @param shape object is passed to method and it will print the area.
 */
public static void printShape(Shape shape)
{
	System.out.println("area is"+shape.getArea());
}
}

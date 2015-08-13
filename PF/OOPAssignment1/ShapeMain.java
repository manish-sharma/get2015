import java.util.*;
public class ShapeMain {
public static void main(String arg[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of side");
	int length=scan.nextInt();
	Shape circle=new Circle(length);
	circle.draw();
	printShape(circle);
	Shape square=new Square(length);
	square.draw();
	printShape(square);
	scan.close();
	
	List<Shape> shape = new ArrayList<Shape>();
	
	shape.add(circle);
	shape.add(square);
	Iterator<Shape> itr=shape.iterator();
	while(itr.hasNext())
	{
		Shape s1=itr.next();
		s1.draw();
		printShape(s1);
	}
	
}
public static void printShape(Shape shape)
{
	System.out.println("area is"+shape.getArea());
}
}

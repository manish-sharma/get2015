import java.util.*;
//Main class that shows interface implementation
public class ShapeMain
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of side"); //User input
		int length=scan.nextInt();
		Shape circle=new Circle(length);
		circle.draw();     //calling circle draw function
		printShape(circle);
		Shape square=new Square(length);
		square.draw();    //calling draw function of square
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
	public static void printShape(Shape shape)  //printing object shape
	{
		System.out.println("area is"+shape.getArea());
	}
}
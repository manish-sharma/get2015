
import java.util.Scanner;
interface Shape 
{
	void draw();
	double getArea();
}
class Circle implements Shape
{
	private int radius;
	public Circle(int radius)//Constructor of Circle class
	{
		this.radius=radius;
	}
	public void draw()//To print which shape is there
	{
		System.out.println("Its a circle");
	}
	public double getArea()//to return the area of shape
	{
		return (3.14*radius*radius);
	}
}
class Square implements Shape
{
	private int side;
	public Square (int side)
	{
		this.side=side;
	}
	public void draw()
	{
		System.out.println("Its a Square");
	}
	public double getArea()
	{
		return (side*side);
	}
}
public class MainShape
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr radius:");
		int radius=sc.nextInt();
		Circle circle=new Circle(radius);
		circle.draw();//call draw method for circle
		System.out.println("Area of circle is:"+circle.getArea());
		System.out.println("Enetr side:");
		int side=sc.nextInt();
		Square square=new Square(side);
		square.draw();//call draw method for square
		System.out.println("Area of square is:"+square.getArea());
		sc.close();
	}
}


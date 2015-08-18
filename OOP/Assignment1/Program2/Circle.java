//Class circle that implements from Interface shape
public class Circle implements Shape
{
	private int radius;
	public Circle(int radius){this.radius = radius;
}
	public void draw(){
	// Circle drawing logic
	System.out.println("this is circle");
}
public double getArea()
{
	// Circle area calculation
	double area=3.14*radius*radius;
	return area;
}
}


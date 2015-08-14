/*Implement Shape interface for Find area of  circle*/
class Circle implements Shape
{
	private static final double PI = 3.14;
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public void draw()
	{
		System.out.println("A Circle has been drawn");		
	}
	public double getArea()
	{
		return PI * radius * radius ; 
	}
}

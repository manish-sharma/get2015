public class Square implements Shape
{
	private int side;
	public Square(int side)
	{
		this.side = side;
	}
	public void draw()
	{
		// Square drawing logic
		System.out.println("this is Square");
	}
	public double getArea()
	{
		// Square area calculation
		double area=side*side;
		return area;
	}
}

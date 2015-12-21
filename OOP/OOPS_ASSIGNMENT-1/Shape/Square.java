package Shape;

public class Square implements Shape
{
	private int side;
	
	public Square(int side)
	{
		this.side = side;
		
	}
		public void draw()
		{
			 System.out.print("Square Drawn");  // Square drawing logic
		}
		
		public double getArea() //Function  Square area calculation
		{
			double area;
			
			area=side*side;
			
			return area;// Square area calculation
			
		}

	
}

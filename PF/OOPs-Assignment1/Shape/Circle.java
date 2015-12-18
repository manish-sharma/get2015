package Shape;

public class Circle implements Shape
{
	    private int radius;
	 
		public Circle(int radius)
		{
			this.radius = radius;
		}
		
		public void draw()
		{ 
	      System.out.print("Circle Drawn");                   // Circle drawing logic
		}
		
		public double getArea()        // Function for Circle area calculation
		{
           double area;
			
			area=3.14*radius*radius;                   // Circle area calculation
			return area;
		}

}

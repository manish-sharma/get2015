/*This class implements the Shape interface for circle 
 * @author Gaurav Saini
 * Date 13th August 2015*/


public class Circle implements Shape {
	
	    private int radius;
	    /*Constructor*/
		public Circle(int radius)
		{
			this.radius = radius;
			}
		/*Function to display message on Console*/
		public void draw()
		{ 
	    System.out.println("Area of the circle is : ");
		}
		/*Function needed to calculate Area of Shape*/
		public double getArea()
		{
			double area;
			area= (22/7)*(radius*radius);
			return area;
		}
		/*Function to Print calculated area*/
		void printShape(Shape shape){
			System.out.println(shape.getArea());
			}
		
	}


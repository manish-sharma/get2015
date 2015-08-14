
/**
 * @author Sumitra
 *this class is implemented frorm interface shape which is having two functions void draw() and void getArea().
 */
public class Circle implements Shape {
	private int radius;
	/**
	 * 
	 * @param radius is the value of radius of circle.
	 */
	public Circle(int radius)
	{
		this.radius = radius;
	}
	/**
	 * this method is to print a suitable message
	 */
	public void draw(){
	// Circle drawing logic
		System.out.println("this is circle");
	}
	/**
	 * this method is to calcutae the area of circle and than it will return.
	 */
	public double getArea(){
	// Circle area calculation
		double area=3.14*radius*radius;
		return area;
	}


}
//end of class

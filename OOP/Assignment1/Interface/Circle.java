/****************************************************************************************
Name            : Circle
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to calculate area of circle and implements shape inteface. 
                :
****************************************************************************************/
public class Circle implements Shape {
	private int radious;
	
	public Circle(int radious)
	{
		this.radious=radious;
	}
	
	//getArea Method return area of circle
	public double getArea()
	{
		return 2*3.14*radious;
	}
	public void draw()
	{
		System.out.println("CIRCLE");
	}

}
//End of circle class

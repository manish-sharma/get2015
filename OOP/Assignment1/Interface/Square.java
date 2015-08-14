/****************************************************************************************
Name            : Square
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to calculate area of Square and implements shape inteface. 
                :
****************************************************************************************/
public class Square {
	
	private int size;
	
	public Square(int size)
	{
		this.size=size;
	}
	
	//getArea Method return area of Square
	double getArea()
	{
		return size*size;
	}
	
	void draw()
	{
		System.out.println("SQUARE");
	}
	
}
//End of Square class

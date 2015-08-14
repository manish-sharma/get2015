/*This class implements the Shape interface for Square 
 * @author Gaurav Saini
 * Date 13th August 2015*/

public class Square implements Shape{
    private int side;
    /*Constructor*/
	public Square(int side)
	{
		this.side = side;
	}
	/*Function to display message on Console*/
	public void draw()
	{
		System.out.print("Area Of the square is : ");
	}
	/*Function needed to calculate Area of Shape*/
	public double getArea()
	{
		return (side*side);
				
	}
			
}

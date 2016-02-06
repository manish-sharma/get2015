/*This class implements the Shape interface for Square 
 * @author Shishir Pareek
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
		System.out.print("Function To Draw Square");
	}
	/*Function needed to calculate Area of Shape*/
	public double getArea()
	{
		return (side*side);
				
	}
			
}

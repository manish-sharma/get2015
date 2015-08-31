
/**
 * @author Sumitra
 * this class is created to calculate the area of square and in implemented from shape
 */
public class Square implements Shape 
{
	private int side;
	/**
	 * 
	 * @param side is the length of one side of square
	 */
	public Square(int side)
	{
		this.side = side;
	}
	/**
	 * method is created to print a appropriate message about the class
	 */
	public void draw()
	{
		// Square drawing logic
		System.out.println("this is Square");
	}
	/**
	 * will return the area of square
	 */
	public double getArea()
	{
		// Square area calculation
		double area=side*side;
		return area;
	}
}



/*Implement shape interface for find the area of square*/
class Square implements Shape 
{
	private double side;
	public Square(int side)
	{
		this.side = side;
	}
	public void draw()
	{
		System.out.println("A Square of "+side+"*"+side+"has been drawan");
	}
	public double getArea()
	{
		return side*side;
	}
}

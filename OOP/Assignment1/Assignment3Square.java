class Assignment3Square implements Assignment3Shape 
{
	private double side;
	public Assignment3Square(int side)
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

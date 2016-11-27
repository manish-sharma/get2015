package InterfaceImplementation;


public class Square implements Shape{
	private double side;
	
	public Square(double side)
	{
		this.side = side;
	}
	/**
	 * draw a function which is used to return a string
	 * 
	 * @return It return a String
	 */
		public String draw()
		{
			
			String Draw="Area of Square is";
	         return Draw;		
		}

		/**
		 getArea a function which is used to return a Area of Square
		 * 
		 */
		public double getArea()
		{
			double Area;
			Area=side*side;
			return Area;
			
		}
	}


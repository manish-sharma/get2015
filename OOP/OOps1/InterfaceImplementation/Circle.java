package InterfaceImplementation;

public class Circle implements Shape {
	
	private double radius;
	
	
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	

	/**
	 * draw a function which is used to return a string
	 * 
	 * @return It return a String
	 */
	public  String draw()
	{ String draw="Area of the Cricle is";
       return draw;
	}


	/**
	 getArea a function which is used to return a Area of Cricle
	 * 
	 */
    public double getArea()
	{   double Area;   
		Area=radius*Math.PI*Math.PI;
	    return Area;
	
	}
}


